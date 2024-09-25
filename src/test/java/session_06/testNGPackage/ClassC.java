package session_06.testNGPackage;

import org.testng.annotations.*;

public class ClassC {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Open Browser");
    }

    @Test
    public void test (){
        System.out.println("Enter User Name");
        System.out.println("Enter User Password");
        System.out.println("Click On Login");

    }
    @Test
    public void test1 (){
        System.out.println("Logout From Browser");
    }

    @AfterClass
    public void afterClass (){
        System.out.println("Close Browser");
    }

}
