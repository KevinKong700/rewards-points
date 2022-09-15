package com.retailer.rewards.entity;

import java.time.Month;
import java.util.List;


public class Rewards {
    private int customerId;
    private int firstRewardsPoints;
    private int secondRewardsPoints;
    private int thirdRewardsPoints;

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    private int totalPoints;
    private List<Month> months;

    public Rewards() {
    }

    public Rewards(int customerId, int firstRewardsPoints, int secondRewardsPoints, int thirdRewardsPoints, List<Month> months) {
        this.customerId = customerId;
        this.firstRewardsPoints = firstRewardsPoints;
        this.secondRewardsPoints = secondRewardsPoints;
        this.thirdRewardsPoints = thirdRewardsPoints;
        this.months = months;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getFirstRewardsPoints() {
        return firstRewardsPoints;
    }

    public void setFirstRewardsPoints(int firstRewardsPoints) {
        this.firstRewardsPoints = firstRewardsPoints;
    }

    public int getSecondRewardsPoints() {
        return secondRewardsPoints;
    }

    public void setSecondRewardsPoints(int secondRewardsPoints) {
        this.secondRewardsPoints = secondRewardsPoints;
    }

    public int getThirdRewardsPoints() {
        return thirdRewardsPoints;
    }

    public void setThirdRewardsPoints(int thirdRewardsPoints) {
        this.thirdRewardsPoints = thirdRewardsPoints;
    }

    public List<Month> getMonths() {
        return months;
    }

    public void setMonths(List<Month> months) {
        this.months = months;
    }

    @Override
    public String toString() {
        return "Rewards{" +
                "customerId=" + customerId +
                ", " + months.get(0) + " RewardsPoints=" + firstRewardsPoints +
                ", " + months.get(1) + " RewardsPoints=" + secondRewardsPoints +
                ", " + months.get(2) + " RewardsPoints=" + thirdRewardsPoints +
                ", " + "Total point=" + totalPoints +
                '}';
    }
}
