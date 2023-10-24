package com.ecommerce.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.management.DynamicMBean;

import org.junit.jupiter.api.TestFactory;
 
@DisplayName("JUnit 5 Dynamic Tests Example")
public class DynamicTests {

        @TestFactory
    Collection<DynamicMBean> dynamicTests() {
        return Arrays.asList(
            dynamicTest("simple dynamic test", () -> assertTrue(true)),
            dynamicTest("My Executable Class", new MyExecutable()),
            dynamicTest("Exception Executable", () -> {throw new Exception("Exception Example");}),
            dynamicTest("simple dynamic test-2", () -> assertTrue(true))
        );
    }

}


class MyExecutable implements Executable {

        @Override
        public void execute() throws Throwable {
                System.out.println("Hello World!");
        }

}
