package com.test.customerapp;

import com.remote.app.ILogin;
import com.remote.app.LoginFactory;
import org.apache.log4j.Logger;

public class LoginApp {
    private Logger logger = Logger.getLogger(LoginApp.class);
    private  ILogin login;
    public LoginApp(ILogin login ){
        this.login = login;
    }
    public void login(String username){
        String usernameFromDB = login.getUserName();
        if(usernameFromDB != null  && !usernameFromDB.equals(username)){
            throw new RuntimeException("Exception Occured ");
        }else{
            logger.info("Logged in Success...");
        }

        String usernameFromDB1 = login.getUserName();
        if(usernameFromDB != null  && !usernameFromDB.equals(username)){
            throw new RuntimeException("Exception Occured ");
        }else{
            logger.info("XXXXXxxxxxxxxxX");
        }
    }
}
