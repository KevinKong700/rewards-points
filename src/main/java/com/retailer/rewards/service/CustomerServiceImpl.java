package com.retailer.rewards.service;

import com.retailer.rewards.dao.CustomerRepository;
import com.retailer.rewards.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepo;

    /**
     * Save a customer object in the map
     */
    public void saveCustomer(Customer customerObj) {
        customerRepo.getCustomer().put(customerObj.getId() ,customerObj);
    }

    /**
     * input a customer id to get the customer object
     */
    public Customer getCustomerById(int customerId) {
        return customerRepo.getCustomer().get(customerId);
    }

    /**
     * remove the customer object from map
     */
    public void deleteCustomerById(int customerId) {
        customerRepo.getCustomer().remove(customerId);
    }
}
