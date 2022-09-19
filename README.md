# Reward points API
A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every
dollar spent over $50 in each transaction
(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

Given a record of every transaction during a three-month period, calculate the reward points earned for
each customer per month and total.

- This REST API is used to calculate the customer rewards points by using customer id


### Run
- Start the application by running [RewardsPointsApplication class](https://github.com/KevinKong700/rewards-points/blob/main/src/main/java/com/retailer/rewards/RewardsPointsApplication.java)
### Design
- Technologies used - Spring Boot

| Package                         | Description                                                                                           |
|---------------------------------|-------------------------------------------------------------------------------------------------------|
| com.retailer.rewards.controller | Handle user's request to return a reward points object                                                |
| com.retailer.rewards.dao        | Mock the data set using HashMap for customer and transaction repository                               |
| com.retailer.rewards.entity     | Contain Customer, Transaction and Rewards persistence domain object                                   |
| com.retailer.rewards.service    | Contain all logics to handle the exchange of information and methods to retrieve user's reward points |

| Method | URL                | Description                                                  |
|--------|--------------------|--------------------------------------------------------------|
| GET    | /api/{cId}/rewards | Retrieve each month and total rewards points in three months |

### Test
- Technologies used - Spring Test, JUnit

### Todo
- Jenkins integration
- Http authentication

## Contributor
Kevin Kong
