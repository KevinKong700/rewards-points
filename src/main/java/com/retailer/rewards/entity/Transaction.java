package com.retailer.rewards.pojo;

public class Transaction {

    private int id;
    private int customerId;
    private int spend;

    public Transaction(int id, int customerId, int spend) {
        this.id = id;
        this.customerId = customerId;
        this.spend = spend;
    }

    public Transaction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", spend=" + spend +
                '}';
    }
}
