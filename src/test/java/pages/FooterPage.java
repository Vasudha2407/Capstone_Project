package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterPage {

    WebDriver driver;

    public FooterPage(WebDriver driver) {

        this.driver = driver;
    }

    By homeLink =
            By.linkText("Home");

    By ajaxLink =
            By.linkText(
            "Hidden Elements & AJAX");

    public void clickHome() {

        driver.findElement(homeLink)
                .click();

        System.out.println(
                "Home Link Clicked");
    }

    public void clickAjaxPage() {

        driver.findElement(ajaxLink)
                .click();

        System.out.println(
                "AJAX Page Opened");
    }
}