package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver) {

        this.driver = driver;
    }

    public void handleSimpleAlert() {

        driver.findElement(
        By.id("alertBtn"))
        .click();

        Alert alert =
                driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();
    }

    public void handleConfirmationAlert() {

        driver.findElement(
        By.id("confirmBtn"))
        .click();

        Alert alert =
                driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();
    }

    public void handlePromptAlert() {

        driver.findElement(
        By.id("promptBtn"))
        .click();

        Alert alert =
                driver.switchTo().alert();

        alert.sendKeys("Vasudha");

        alert.accept();
    }
}