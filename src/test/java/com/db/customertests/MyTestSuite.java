package com.db.customertests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CustomerTest.class,
        OrderTest.class
})
public class MyTestSuite {
}
