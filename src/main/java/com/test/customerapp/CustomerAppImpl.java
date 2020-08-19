package com.test.customerapp;

import java.util.Random;

public class CustomerAppImpl implements ICustomerApp{
    @Override
    public Customer createCustomer(Customer customer) {
        System.out.println("Customer Created Successfully....");
        customer.setId(new Random().nextLong());
        return customer;
    }
}
