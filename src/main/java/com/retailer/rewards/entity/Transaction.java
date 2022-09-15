package com.retailer.rewards.entity;

import java.time.LocalDate;

public class Transaction {

    private int transactionId;
    private int customerId;
    private int spend;
    private LocalDate date;

    public Transaction() {
    }

    public Transaction(int transactionId, int customerId, int spend, LocalDate date) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.spend = spend;
        this.date = date;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSpend() {
        return spend;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", customerId=" + customerId +
                ", spend=" + spend +
                ", date=" + date +
                '}';
    }
}
