package session_03.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assessment_01 {

    /*
    Test Case No1 : Validate that user can log in successfully
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter Valid Password: secret_sauce
        4. Click On Login
     */

    public static void main(String[] args) throws InterruptedException {

        // init chrome
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();

        driver= new ChromeDriver(options);

        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-button\"]")));

        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        button.click();


        Thread.sleep(2000);
        driver.quit();

        /*// init chrome
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();

        driver= new ChromeDriver(options);

        driver.navigate().to("https://authenticate.riotgames.com/?client_id=accountodactyl-prod&method=riot_identity&platform=web&redirect_uri=https%3A%2F%2Fauth.riotgames.com%2Fauthorize%3Facr_values%3Durn%253Ariot%253Agold%26client_id%3Daccountodactyl-prod%26redirect_uri%3Dhttps%253A%252F%252Faccount.riotgames.com%252Foauth2%252Flog-in%26response_type%3Dcode%26scope%3Dopenid%2520email%2520profile%2520riot%253A%252F%252Friot.atlas%252Faccounts.edit%2520riot%253A%252F%252Friot.atlas%252Faccounts%252Fpassword.edit%2520riot%253A%252F%252Friot.atlas%252Faccounts%252Femail.edit%2520riot%253A%252F%252Friot.atlas%252Faccounts.auth%2520riot%253A%252F%252Fthird_party.revoke%2520riot%253A%252F%252Fthird_party.query%2520riot%253A%252F%252Fforgetme%252Fnotify.write%2520riot%253A%252F%252Friot.authenticator%252Fauth.code%2520riot%253A%252F%252Friot.authenticator%252Fauthz.edit%2520riot%253A%252F%252Frso%252Fmfa%252Fdevice.write%2520riot%253A%252F%252Friot.authenticator%252Fidentity.add%26state%3D2e3de7e8-c481-473e-8c84-0175a1419fd1&security_profile=high");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/main/div/form/div/div/div[2]/button]")));

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/div/div/div[1]/div[2]/div/input")).sendKeys("LeoProfLuca");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/div/div/div[1]/div[3]/div/input")).sendKeys("Yoyosasaloka0203");
        Thread.sleep(2000);

        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/div/div/div[2]/button"));
        button.click();


        Thread.sleep(2000);
        driver.quit();*/
    }
}
