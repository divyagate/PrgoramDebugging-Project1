package test;

import org.junit.*;
import project.logic.model.Address;
import project.logic.model.User;
import project.logic.UserDetails;

import static junit.framework.Assert.*;

public class UserDetailsTest {
    User u = new User();
    UserDetails userdetails = new UserDetails();
    Address useraddress= new Address();


    //TODO :7. Write Test Case for function FullName() (2marks) -Done by Monika
    @Test
    public void TestFullName(){
        u.setfName("Monika");
        u.setlName("Paul");
        System.out.println("test case fullname");
        assertEquals("MonikaPaul", userdetails.FullName(u));
    }


    //TODO :8. Write TestCase for function VerifyCountry() (3marks) -Done by Shivam
    @Test
    public void TestVerifyCountry(){
        useraddress.setCountry("CA");
        u.setAddress(useraddress);
        assertTrue(userdetails.VerifyCountry(u));
    }


    //TODO :9. Write TestCase for function SalaryAccumulated() (3marks) -Done by Divya
    @Test
    public void TestsalaryAccumulated(){
        u.setSalary(10000.0);
        u.setAge(30);
        assertEquals(16406.059944647295,userdetails.SalaryAccumulated(u));
    }
}
