package com.retailer.rewards.dao;

import com.retailer.rewards.entity.Transaction;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Repository
public class TransactionRepository {



    //mock the transaction data
    private static Map<Integer, Transaction> transaction = new HashMap<>();

    static {
        transaction.put(1, new Transaction(7, 1, 300, LocalDate.of(2022, 7, 10)));
        transaction.put(2, new Transaction(8, 2, 100, LocalDate.of(2022, 7, 12)));
        transaction.put(3, new Transaction(9, 3, 250, LocalDate.of(2022, 7, 20)));
        transaction.put(4, new Transaction(10, 6, 90, LocalDate.of(2022, 7, 7)));
        transaction.put(5, new Transaction(11, 2, 1000, LocalDate.of(2022, 8, 2)));
        transaction.put(6, new Transaction(12, 3, 750, LocalDate.of(2022, 8, 14)));
        transaction.put(7, new Transaction(13, 4, 0, LocalDate.of(2022, 9, 11)));
        transaction.put(8, new Transaction(14, 2, 20, LocalDate.of(2022, 9, 12)));
        transaction.put(9, new Transaction(15, 1, 0, LocalDate.of(2022, 9, 15)));
    }

    public Map<Integer, Transaction> getTransaction() {
        return transaction;
    }
}
