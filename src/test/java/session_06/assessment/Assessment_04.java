package session_06.assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
    Scenario 1 (Verify that user cannot log in with valid but not registered email)
        ● Go to https://www.amazon.eg/
        ● Verify user can’t login with valid but not registered email
    Scenario 2 ( Verify that Items are added to cart correctly
        ● Go to https://www.amazon.eg/
        ● Click on All tab
        ● Go to Today’s Deals
        ● Click on 2nd category
        ● Click on 1st product in this category
        ● Click on 2nd item in this product
        ● Add it to cart with Qty = 2
        ● Do all the necessary actions to add the item to the cart
        ● Go to cart
        ● Verify correct items are added to the cart (name, price, qty and subtotal is correct)
    Scenario 3: (Verify that you cannot see “Your Orders” and “Your Addresses” pages if you are not
    logged in. But you can see “Your Lists” intro screen)
        ● Go to https://www.amazon.eg/
        ● Click on “Hello, sign in Account & Lists” at the top right corner
        ● Select “Your orders”
        ● Make sure user can’t see orders when not signed in
        ● Select “Your Addresses”
        ● Make sure user can’t see orders when not signed in
        ● Select “Your Lists”
        ● Make sure user can see the screen
 */
public class Assessment_04 {

    @Test
    public void test01 () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.eg/");
    }

}
