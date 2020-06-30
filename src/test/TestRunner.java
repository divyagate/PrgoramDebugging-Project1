package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculationTest.class);
        Result resultException = JUnitCore.runClasses(ExceptionClassTest.class);
        Result resultUserDetails = JUnitCore.runClasses(UserDetailsTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        for (Failure failure : resultException.getFailures()) {
            System.out.println(failure.toString());
        }
        for (Failure failure : resultUserDetails.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}