package com.retailer.rewards.service;

import com.retailer.rewards.entity.Customer;

public interface CustomerService {

    public void saveCustomer(Customer customerObj);

    public Customer getCustomerById(int customerId);

    public void deleteCustomerById(int customerId);

    public void updateCustomerById(int customerId, Customer customer);

}
