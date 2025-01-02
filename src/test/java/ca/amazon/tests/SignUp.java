package ca.amazon.tests;

import ca.amazon.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUp extends TestBase {

    @Test
    public void signUpTest1(){
        super.logBrowserName();
        System.out.println("Sign Up test 1 success");
    }

    @Test
    public void signUpTest2(){
        super.logBrowserName();
        System.out.println("Sign Up test 2 success");
    }

    @Test
    public void signUpTest3(){
        super.logBrowserName();
        super.log(Status.INFO, "End of Test");
        System.out.println("Sign Up test 3 success");
    }

    @Test(dataProvider = "empData" , dataProviderClass = SignUp.class)
    public void signUpTest3(String empName, int empId){
        super.logBrowserName();
        System.out.println("Employee Name: " + empName + ", Employee ID: " + empId);
        super.log(Status.INFO, "End of Test");
        System.out.println("Sign Up test 3 success");
    }

    @DataProvider(name = "empData")
    public Object[][] data(){
        Object[][] employees = {
                {"Richard",101},
                {"Arjun", 876},
                {"Amal", 432},
                {"Karun", 222}
        };
        return employees;
    }

}
