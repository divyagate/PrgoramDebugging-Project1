package test;

import org.junit.Test;
import project.logic.ExceptionClass;

import static junit.framework.Assert.assertEquals;

public class ExceptionClassTest {

    //TODO :2. Complete the test case to test IllegalArgumentException (2 marks) - Done by Madhav
    ExceptionClass tester = new ExceptionClass();
    @Test(expected=IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        System.out.println("test case Exception");
        tester.multiply(1000, 5);
    }


    //TODO :3. Complete the test case to test if the multiply function is giving correct answer or not ( 2 marks) - Done by Madhav
    @Test
    public void testMultiply() {
        System.out.println("test case multiply");
        assertEquals(6,tester.multiply(3,2));
    }
}
