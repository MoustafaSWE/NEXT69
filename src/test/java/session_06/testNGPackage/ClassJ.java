package session_06.testNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
TestCase 01:
    1. Open Browser
    2. Open URL: https://www.saucedemo.com/v1/
    3. Enter Valid username: standard_user
    4. Enter Valid password: secret_sauce
    5. Click on Login
    6. Close Browser

TestCase 02:
    1. Open Browser
    2. Open URL: https://www.saucedemo.com/v1/
    3. Enter Invalid username: secret_sauce
    4. Enter Invalid password: standard_user
    5. Click on Login
    6. Close Browser
 */
public class ClassJ {

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("1. Open Browser");
        System.out.println("2. Open URL: swagLabs.com");
    }

    @Test(priority = 2)
    public void test1 (){
        System.out.println("3. Enter Valid username");
        System.out.println("4. Enter Valid password");
        System.out.println("5. Click on Login");
    }

    @Test(priority = 1, dependsOnMethods = "test1")
    public void test2 (){
        System.out.println("3. Enter Invalid username");
        System.out.println("4. Enter Invalid password");
        System.out.println("5. Click on Login");
    }

    @AfterMethod
    public void afterMethod (){
        System.out.println("6. Close Browser");
    }

}
