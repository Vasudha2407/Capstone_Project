package base;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DriverFactory;

public class BaseClass {

    protected WebDriver driver;

    @BeforeMethod

    public void setup() {

        driver =DriverFactory.initializeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
    }

    @AfterMethod

    public void tearDown() {

        driver.quit();
    }
}