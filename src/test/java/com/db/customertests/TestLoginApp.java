package com.db.customertests;

import com.remote.app.ILogin;
import com.test.customerapp.LoginApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestLoginApp {

    @Mock
    ILogin iLogin;

    @Test
    public void testMyLogin() {
        assertNotNull(iLogin);
        when(iLogin.getUserName()).thenReturn("nilesh");
        LoginApp app = new LoginApp(iLogin);
        app.login("nilesh");
    }

}
