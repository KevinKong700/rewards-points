package com.retailer.rewards.junit.test;

import com.retailer.rewards.controller.RewardsController;
import com.retailer.rewards.dao.CustomerRepository;
import com.retailer.rewards.dao.TransactionRepository;
import com.retailer.rewards.entity.Rewards;
import com.retailer.rewards.service.TransactionServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class JunitTestTest {

    @Autowired
    TransactionRepository transactionRepo;

    @Autowired
    TransactionServiceImpl transaction;

    @Autowired
    CustomerRepository customerRepo;



    @Test
    public void checkNullTransaction() {
        assertFalse(transactionRepo.getTransaction().isEmpty());
    }

    @Test
    public void checkNullCustomer() {
        assertFalse(customerRepo.getCustomer().isEmpty());
    }

    @Test
    public void check0Point() {

        assertEquals(0, transaction.countRewardsPoint(50));
    }
    @Test
    public void check50Point() {
        assertEquals(0, transaction.countRewardsPoint(50));
    }
    @Test
    public void check51Point() {
        assertEquals(1, transaction.countRewardsPoint(51));
    }
    @Test
    public void check49Point() {
        assertEquals(0, transaction.countRewardsPoint(49));
    }
    @Test
    public void check100Point() {

        assertEquals(50, transaction.countRewardsPoint(100));
    }
    @Test
    public void check99Point() {
        assertEquals(49, transaction.countRewardsPoint(99));
    }
    @Test
    public void check101Point() {
        assertEquals(52, transaction.countRewardsPoint(101));
    }
    @Test
    public void checkLargeAmountPoint() {
        assertEquals(1850, transaction.countRewardsPoint(1000));
    }
    @Test
    public void checkApiRewardsObject() {
        RewardsController reward = new RewardsController(transaction);
        Rewards case1 = transaction.getRewardsByCustomerId(1);
        Rewards case2;
        case2 = reward.getRewards(1);
        assertEquals(case1.getTotalPoints(), case2.getTotalPoints());
    }

}
