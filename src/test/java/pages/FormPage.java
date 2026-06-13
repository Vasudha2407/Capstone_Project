package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

    WebDriver driver;

    public FormPage(WebDriver driver) {

        this.driver = driver;
    }

    By name = By.id("name");
    By email = By.id("email");
    By phone = By.id("phone");
    By address = By.id("textarea");

    By female = By.id("female");

    By monday = By.id("monday");
    By friday = By.id("friday");

    By country = By.id("country");
    By colors = By.id("colors");
    By animals = By.id("animals");

    public void fillForm(
            String userName,
            String userEmail,
            String userPhone,
            String userAddress) {

        driver.findElement(name)
                .sendKeys(userName);

        driver.findElement(email)
                .sendKeys(userEmail);

        driver.findElement(phone)
                .sendKeys(userPhone);

        driver.findElement(address)
                .sendKeys(userAddress);

        driver.findElement(female)
                .click();

        driver.findElement(monday)
                .click();

        driver.findElement(friday)
                .click();

        Select countryDrop =
                new Select(
                driver.findElement(country));

        countryDrop.selectByVisibleText("India");

        Select colorDrop =
                new Select(
                driver.findElement(colors));

        colorDrop.selectByVisibleText("Red");

        Select animalDrop =
                new Select(
                driver.findElement(animals));

        animalDrop.selectByVisibleText("Dog");
    }
}