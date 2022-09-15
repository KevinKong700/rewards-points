package com.retailer.rewards.service;

import com.retailer.rewards.dao.TransactionRepository;
import com.retailer.rewards.entity.Rewards;
import com.retailer.rewards.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.*;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepo;

    /**
     * Save a transaction object in the map
     */
    @Override
    public void save(Transaction transactionObj) {
        transactionRepo.getTransaction().put(transactionObj.getTransactionId(), transactionObj);
    }

    /**
     * input a transaction id to get the transaction object
     */
    @Override
    public Transaction getTransaction(int transactionId) {
        return transactionRepo.getTransaction().get(transactionId);
    }

    /**
     * remove the transaction object from map
     */
    @Override
    public void deleteTransaction(int transactionId) {
        transactionRepo.getTransaction().remove(transactionId);
    }

    /**
     * update the transaction with id in map
     */
    @Override
    public void updateTransaction(int transactionId, Transaction transaction) {
        transactionRepo.getTransaction().put(transactionId, transaction);
    }

    /**
     * generate a rewards object with given customer id
     */
    public Rewards getRewardsByCustomerId(int customerId) {

        List<Month> monthList = getAllMonths(transactionRepo.getTransaction());
        Rewards rewards = new Rewards();
        List<Transaction> filteredList = new ArrayList<>();

        transactionRepo.getTransaction().values()
                .stream()
                .filter(n -> n.getCustomerId() == customerId)
                .forEach(n -> filteredList.add(n));

        int firstMonthPurchaseCost = getMonthlyRewards(monthList.get(0), filteredList);
        int secondMonthPurchaseCost =getMonthlyRewards(monthList.get(1), filteredList);
        int thirdMonthPurchaseCost =getMonthlyRewards(monthList.get(2), filteredList);

        rewards.setFirstRewardsPoints(firstMonthPurchaseCost);
        rewards.setSecondRewardsPoints(secondMonthPurchaseCost);
        rewards.setThirdRewardsPoints(thirdMonthPurchaseCost);
        rewards.setTotalPoints(firstMonthPurchaseCost + secondMonthPurchaseCost + thirdMonthPurchaseCost);
        rewards.setMonths(monthList);

        System.out.println(rewards);
        return rewards;
    }

    /**
     *generate a monthly rewards point by using month in a Transaction object list
     */
    private int getMonthlyRewards(Month month, List<Transaction> filteredList) {

        int rewardsPoints = 0;
        List<Integer> rewardsList = new ArrayList<>();

        filteredList.stream()
                .filter( n -> n.getDate().getMonth() == month)
                .forEach( n -> {
                    rewardsList.add(countRewardsPoint(n.getSpend()));
                });

        for (int i = 0; i < rewardsList.size(); i++) {
            rewardsPoints = rewardsPoints + rewardsList.get(i);
        }
        return rewardsPoints;
    }

    /**
     * count the rewards points based on the spend amount
     */
    private int countRewardsPoint(int spend) {
        int totalPoints = 0;

        //2 points/dollar spent over $100
        if (spend > 100) {
            totalPoints = totalPoints + (spend - 100) * 2;
        }

        //1 point/dollar spent over $50
        if (spend > 100 && spend > 50) {
            totalPoints = totalPoints + 50;
        }
        if (spend <= 100 && spend > 50) {
            totalPoints = totalPoints + (spend - 50) * 2;
        }

        return totalPoints;
    }


    /**
     * get a non-duplicated Months list from a transaction map
     */
    public List<Month> getAllMonths(Map<Integer, Transaction> transaction) {
        List<Month> monthList = new ArrayList<>();

        transaction.values()
                .stream()
                .forEach( n -> {
                    if (!monthList.contains(n.getDate().getMonth())) {
                        monthList.add(n.getDate().getMonth());
                    }
                });
        Collections.sort(monthList);
        System.out.println(monthList);
        return monthList;
    }

}
