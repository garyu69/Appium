import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;

import java.net.URL;

import static org.junit.Assert.*;


public class AppiumTest {

    private WebDriver driver;


    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 5");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "8.3");
        capabilities.setCapability("browserName", "safari");
        driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:5555/wd/hub"),
                capabilities);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test
    public void runTest1() throws Exception {
        driver.get("http://www.skyvegas.com");
        Thread.sleep(1000);
        WebElement logIn = driver.findElement(By.linkText("Log In"));
        logIn.click();
        Thread.sleep(10000);
        driver.switchTo().frame(2);
        //driver.switchTo().frame(driver.findElement(By.id("SkyBetAccount")));
        WebElement userField = driver.findElement(By.id("username"));
        userField.sendKeys("<ValidUser>");
        WebElement pinField = driver.findElement(By.id("pin"));
        pinField.sendKeys("<ValidPin");
        WebElement logInButton = driver.findElement(By.linkText("Log in"));
        logInButton.click();
        WebElement loggedIn = driver.findElement(By.xpath("//*[@data-track-id='MyAccount']"));
        loggedIn.click();
        WebElement logOutButton = driver.findElement(By.xpath("//*[@class='skycon s-logout']"));
        logOutButton.click();
        assertTrue(logIn.isDisplayed());

        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void runTest2() throws Exception {
        driver.get("http://www.skyvegas.com");
        Thread.sleep(1000);
        WebElement burgerMenu = driver.findElement(By.xpath("//*[@class='mobile-menu__icon']"));
        burgerMenu.click();
        WebElement searchField = driver.findElement(By.xpath("//*[@class='search__input']"));
        searchField.sendKeys("roulette");


        System.out.println(driver.getCurrentUrl());
    }

    /**
     * Closes the {@link #driver} instance.
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}