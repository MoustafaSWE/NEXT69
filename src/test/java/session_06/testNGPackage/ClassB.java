package session_06.testNGPackage;

import org.testng.Assert;
import org.testng.annotations.*;

public class ClassB {

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("Open Browser");
    }

    @Test(priority = 2) // Low
    public void test (){
        System.out.println("Enter User Name");
        System.out.println("Enter User Password");
        System.out.println("Click On Login");
        Assert.assertTrue(false);

    }
    @Test(priority = 1, dependsOnMethods = "test" ) // high
    public void test1 (){
        System.out.println("Enter User Name");
        System.out.println("Enter User Password");
        System.out.println("Click On Login");
        System.out.println("Logout From Browser");
    }

    @AfterMethod
    public void afterMethod (){
        System.out.println("Close Browser");
    }


}
