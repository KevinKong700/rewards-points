package com.retailer.rewards.junit.test;

import com.retailer.rewards.dao.CustomerRepository;
import com.retailer.rewards.dao.TransactionRepository;
import com.retailer.rewards.service.TransactionServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JunitTestTest {

    @Autowired
    private TransactionRepository transactionRepo;

    @Autowired
    TransactionServiceImpl transaction;

    @Autowired
    private CustomerRepository customerRepo;

    @Test
    public void checkTransactionRepo() {
        assertEquals(true, !transactionRepo.getTransaction().isEmpty());
    }

    @Test
    public void checkCustomerRepo() {
        assertEquals(true, !customerRepo.getCustomer().isEmpty());
    }

    @Test
    public void checkCountRewardsPoint() {

        assertEquals(0, transaction.countRewardsPoint(50));
        assertEquals(50, transaction.countRewardsPoint(100));
        assertEquals(80, transaction.countRewardsPoint(115));
        assertEquals(250, transaction.countRewardsPoint(200));
        assertEquals(0, transaction.countRewardsPoint(49));
        assertEquals(49, transaction.countRewardsPoint(99));
        assertEquals(0, transaction.countRewardsPoint(0));
        assertEquals(1850, transaction.countRewardsPoint(1000));
    }

}
