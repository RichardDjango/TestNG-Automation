package ca.amazon.lib;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.*;

@Listeners({ExtentITestListenerClassAdapter.class})
public class TestBase {
    protected String browserVar;

    @BeforeSuite
    protected void beforeSuite(){
        System.out.println("Before suite");
    }

    @AfterSuite
    protected void afterSuite(){
        System.out.println("after suite");
    }

    @BeforeTest
    protected void beforeTest(){

        System.out.println("Before test");
    }

    @AfterTest
    protected void afterTest(){
        System.out.println("After test");
    }

    @Parameters({"browser"})
    @BeforeClass
    protected void beforeClass(@Optional("Chrome Browser") String browser){
        this.browserVar = browser;
        System.out.println("Before class");
    }

    @AfterClass
    protected void afterClass(){
        System.out.println("After class");
    }

    @BeforeMethod
    protected void beforeMethod(){
        System.out.println("Before method");
    }

    @AfterMethod
    protected void afterMethod(){
        System.out.println("after method");
    }

    protected void log(Status status, String msg){
        ExtentTestManager.getTest().log(status,msg);
    }

    protected void logBrowserName(){
        log(Status.INFO, this.browserVar);
    }




}
