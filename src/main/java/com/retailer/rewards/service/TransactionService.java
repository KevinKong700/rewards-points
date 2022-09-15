package com.retailer.rewards.service;

import com.retailer.rewards.dao.TransactionRepository;
import com.retailer.rewards.entity.Transaction;

public interface TransactionService {

    public void save(Transaction transactionObj);

    public Transaction getTransaction(int transactionId);

    public void deleteTransaction(int transactionId);

    public void updateTransaction(int transactionId, Transaction transaction);
}
