package project.logic;

import project.logic.model.Address;
import project.logic.model.User;

public class UserDetails {

    // TODO :4. Write function to display full name of user (2 marks) - Done by Monika
    public String FullName(User user){
        return user.getfName()+user.getlName();
    }


    //TODO :5. Write function to set Verify if the user belongs to Canada ( Address of user is canadian)  -( 3 marks)
    // Assume that the country string will consider CA,US,IN etc. - Done by Shivam
    public Boolean VerifyCountry(User user){
        Address address = user.getAddress();
        String country =address.getCountry();
        if(country == "CA"){
            return true;
        }else{
            return false;
        }
    }

    //TODO :6. Write function to calculate amount user will accumulate by age of 55.
    // Logic to be considered : imagine if user has salary 10000 per year and age is 30 then
    // the total amount that will be accumulated will be 25*salary per year.
    // Also consider that each year user gets 2% hike -( 3 marks) - Done by Divya
    public Double SalaryAccumulated(User user){
        int age = user.getAge();
        double salary = user.getSalary();
        int diff= 55-age;
        if (diff<55){
            for(int i=0; i<diff; i++){
                double hike = (salary/100)*2;
                salary = salary + hike;
            }}
        else System.out.println("Age will not be more than 55");
        return salary;

    }
}
