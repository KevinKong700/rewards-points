package com.retailer.rewards.service;

import com.retailer.rewards.dao.TransactionRepository;
import com.retailer.rewards.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepo;

    /**
     * Save a transaction object in the map
     */
    public void save(Transaction transactionObj) {
        transactionRepo.getTransaction().put(transactionObj.getTransactionId(), transactionObj);
    }

    /**
     * input a transaction id to get the transaction object
     */
    public Transaction getTransaction(int transactionId) {
        return transactionRepo.getTransaction().get(transactionId);
    }

    /**
     * remove the transaction object from map
     */
    public void delete(int transactionId) {
        transactionRepo.getTransaction().remove(transactionId);
    }
}
