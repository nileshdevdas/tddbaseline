package com.test.customerapp;

import java.util.Random;

public class CustomerAppImpl implements ICustomerApp{
    @Override
    public Customer createCustomer(Customer customer) {
        customer.setId(new Random().nextLong());
        return customer;
    }


    public Customer createCustomer1(Customer customer) {
        customer.setId(new Random().nextLong());
        return customer;
    }

    public Customer createCustomer2(Customer customer) {
        customer.setId(new Random().nextLong());
        return customer;
    }
}
