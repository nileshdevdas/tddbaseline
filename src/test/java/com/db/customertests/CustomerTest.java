package com.db.customertests;

import com.test.customerapp.Customer;
import com.test.customerapp.InvalidValueException;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
public class CustomerTest {

    @BeforeClass
    public static void setupOnce(){
        System.out.println("Get called only once for all tests...before they run");
    }

    @AfterClass
    public static  void teardownOnce(){
        System.out.println("Gets Called only once for all test after all are run ");
    }

    @Before
    public void setup(){
        System.out.println("This method get called before every test..");
    }

    @After
    public void teardown(){
        System.out.println("This method get called after every test...");
    }

    @Test(expected = InvalidValueException.class)
    public void testCustomerNameNegative(){
        Customer customer = new Customer();
        customer.setFirstName("n2");
    }

    @Test
    public void testCustomerNameActual(){
        Customer customer = new Customer();
        customer.setFirstName("nilesh");
        int expected = 3;
        int actual = customer.getFirstName().length();
        assertTrue(actual >= expected);
    }

    @Test
    @Ignore
    public void testCustomerLastName(){
        fail();
    }

    @Test
    @Ignore
    public void testCustomerNameValidChars(){
        fail();
    }

    @Test
    @Ignore
    public void testCustomerLastNameValidChars(){
        fail();
    }

    @Test
    @Ignore
    public void testCustomerNameMinLength(){
        fail();
    }

    @Test
    @Ignore
    public void testCustomerLastNameMinLength(){
        fail();
    }


    @Test
    @Ignore
    public void testCustomerValidEmailId(){
        fail();
    }








}
