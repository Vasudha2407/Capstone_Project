package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicButtonPage {

    WebDriver driver;

    public DynamicButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    By startButton =
            By.xpath("//button[text()='START']");

    public void clickStartButton() {

        driver.findElement(startButton)
              .click();

        System.out.println(
        "START Button Clicked");
    }
}