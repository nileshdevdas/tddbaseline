package com.db.customertests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class MockingApplication {

    @Mock
    private DataSource dataSource;

    @Mock
    private Connection connection;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private ResultSet resultSet;

    @Test
    public void testSomething(){
        try {
            assertNotNull(dataSource);
            when(connection.prepareStatement(any(String.class))).thenReturn(stmt);
            when(dataSource.getConnection()).thenReturn(connection);
            when (stmt.executeQuery()).thenReturn(resultSet);
            when(resultSet.next()).thenReturn(true);
            when(resultSet.getString("username")).thenReturn("nilesh");
            Connection con = dataSource.getConnection();
            stmt = con.prepareStatement("xxx");
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString("username"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
