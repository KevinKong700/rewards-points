package com.retailer.rewards.service;

import com.retailer.rewards.dao.CustomerRepository;
import com.retailer.rewards.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepo;

    /**
     * Save a customer object in the map
     */
    @Override
    public void saveCustomer(Customer customerObj) {
        customerRepo.getCustomer().put(customerObj.getId() ,customerObj);
    }

    /**
     * input a customer id to get the customer object
     */
    @Override
    public Customer getCustomerById(int customerId) {
        return customerRepo.getCustomer().get(customerId);
    }

    /**
     * remove the customer object from map
     */
    @Override
    public void deleteCustomerById(int customerId) {
        customerRepo.getCustomer().remove(customerId);
    }

    /**
     * update the customer object from map
     */
    @Override
    public void updateCustomerById(int customerId, Customer customer) {
        customerRepo.getCustomer().put(customerId, customer);
    }
}
