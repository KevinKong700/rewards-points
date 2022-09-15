package com.retailer.rewards.dao;

import com.retailer.rewards.entity.Customer;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;
@Repository
public class CustomerRepository {

    //mock the customer data
    private static Map<Integer, Customer> customer = new HashMap<>();

    static {
        customer.put(1, new Customer(1, "user1"));
        customer.put(2, new Customer(2, "user2"));
        customer.put(3, new Customer(3, "user3"));
        customer.put(4, new Customer(4, "user4"));
        customer.put(5, new Customer(5, "user5"));
        customer.put(6, new Customer(6, "user6"));
    }

    public Map<Integer, Customer> getCustomer() {
        return customer;
    }

}
