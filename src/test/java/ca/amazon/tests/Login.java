package ca.amazon.tests;

import ca.amazon.lib.TestBase;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login extends TestBase {
    @Test (priority = 3)
    public void loginTest1(){
        super.logBrowserName();
        super.log(Status.INFO, "Beginning of Test");
        System.out.println("Login test 1 success");
    }

    @Test (priority = 2 )
    public void loginTest2(){
        super.logBrowserName();
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals("hell","Hello","The values provided are not equal");
//        softAssert.assertAll();
        System.out.println("Login test 2 success");
    }

    @Test (priority = 1, enabled  = false)
    public void loginTest3(){
        super.logBrowserName();
//        Assert.assertFalse(true,"The boolean value is true!");
        System.out.println("Login test 3 success");
    }
}
