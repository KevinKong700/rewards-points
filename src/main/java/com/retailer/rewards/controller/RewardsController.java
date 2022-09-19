package com.retailer.rewards.controller;

import com.retailer.rewards.entity.Rewards;
import com.retailer.rewards.service.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class RewardsController {
    TransactionServiceImpl transaction;
    @Autowired
    public RewardsController(TransactionServiceImpl transaction) {
        this.transaction = transaction;
    }

    /**
     *Given a customer id, the method will return a rewards object contains all information for rewards points
     *
     * @param id - Customer id
     * @return - A rewards object contains customerId, first second and third month's rewards points,
     * and total reward points
     */
    @RequestMapping("/{cid}/rewards")
    public Rewards getRewards(@PathVariable("cid") int id) {
        return transaction.getRewardsByCustomerId(id);
    }

}
