A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every
dollar spent over $50 in each transaction
(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

Given a record of every transaction during a three-month period, calculate the reward points earned for
each customer per month and total.

- This REST API is used to calculate the customer rewards points by using customer id
- HashMap data structure is used to mock data set
- Start the application by running RewardsPointsApplication 


customer points page with customer id:

    http://localhost:8080/api/{customerId}/rewards
