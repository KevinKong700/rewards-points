package com.retailer.rewards.junit.test;

import com.retailer.rewards.controller.rewardsController;
import com.retailer.rewards.dao.CustomerRepository;
import com.retailer.rewards.dao.TransactionRepository;
import com.retailer.rewards.entity.Rewards;
import com.retailer.rewards.service.TransactionServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

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
        assertEquals(true, !transactionRepo.getTransaction().isEmpty());
    }

    @Test
    public void checkNullCustomer() {
        assertEquals(true, !customerRepo.getCustomer().isEmpty());
    }

    @Test
    public void check0Point() {

        assertEquals(0, transaction.countRewardsPoint(50));
    }

    public void check50Point() {
        assertEquals(0, transaction.countRewardsPoint(50));
    }
    public void check51Point() {
        assertEquals(1, transaction.countRewardsPoint(51));
    }
    public void check49Point() {
        assertEquals(0, transaction.countRewardsPoint(49));
    }
    public void check100Point() {

        assertEquals(50, transaction.countRewardsPoint(100));
    }
    public void check99Point() {
        assertEquals(49, transaction.countRewardsPoint(99));
    }
    public void check101Point() {
        assertEquals(52, transaction.countRewardsPoint(101));
    }
    public void checkLargeAmountPoint() {
        assertEquals(1850, transaction.countRewardsPoint(1000));
    }

    public void checkApiRewardsObject() {
        Rewards rewards = new Rewards();
        rewardsController reward = null;
        Rewards case1 = transaction.getRewardsByCustomerId(1);
        Rewards case2 = reward.getRewards(1);
        assertEquals(case1.getTotalPoints(), case2.getTotalPoints());
    }

}
