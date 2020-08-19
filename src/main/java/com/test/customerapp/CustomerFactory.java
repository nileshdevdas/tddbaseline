package com.test.customerapp;

public class CustomerFactory {

    public static ICustomerApp getCustomerApp(){
        return new CustomerAppImpl();
    }
}
