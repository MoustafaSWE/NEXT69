package session_06.testNGPackage;

import org.testng.annotations.*;

public class ClassA {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Open Browser");
    }

//    @BeforeMethod
//    public void beforeMethod (){
//        System.out.println("Before Method");
//    }

    @Test
    public void test (){
        System.out.println("Run TestCase");
    }

//    @AfterMethod
//    public void afterMethod (){
//        System.out.println("After Method");
//    }

    @AfterClass
    public void afterClass (){
        System.out.println("Close Browser");
    }


}
