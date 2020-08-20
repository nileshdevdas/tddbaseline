package com.test.customerapp;

import com.remote.app.ILogin;
import com.remote.app.LoginFactory;

public class LoginApp {
    private  ILogin login;
    public LoginApp(ILogin login ){
        this.login = login;
    }
    public void login(String username){
        String usernameFromDB = login.getUserName();
        if(usernameFromDB != null  && !usernameFromDB.equals(username)){
            throw new RuntimeException("Exception Occured ");
        }else{
            System.out.println("Logged in Success...");
        }
    }
}
