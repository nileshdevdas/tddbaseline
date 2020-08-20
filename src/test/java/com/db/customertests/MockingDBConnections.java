package com.db.customertests;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class MockingDBConnections {

    public MockingDBConnections() {
        System.out.println("Constrcutor called...");
    }

    @Mock
    Connection connection;

    @Mock
    PreparedStatement preparedStatement;

    @Mock
    ResultSet resultSet;

    @Before
    public void setup() throws Throwable {
        /** the test Double Mocked object Setup **/
        when(connection.prepareStatement(any(String.class))).thenReturn(preparedStatement);
        when(preparedStatement.executeQuery()).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true);
        when(resultSet.getString("username")).thenReturn("nilesh");
        when(resultSet.getString("password")).thenReturn("n238098213123");
    }

    @Test
    public void test() {
    }

    @Test
    public void test1() {
    }

    @Test
    public void test2() {
    }


    @Test
    public void testSomeThing() throws Throwable {
        assertNotNull(connection);
        preparedStatement = connection.prepareStatement("Select * from users");
        resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            System.out.println(username);
            System.out.println(password);
        }
    }
}
