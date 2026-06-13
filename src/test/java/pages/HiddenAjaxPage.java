package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HiddenAjaxPage {

    WebDriver driver;

    public HiddenAjaxPage(WebDriver driver) {

        this.driver = driver;
    }

    By input1 =
            By.id("input1");

    By toggleInputBtn =
            By.xpath("//button[contains(text(),'Toggle Input Box 2')]");

    By ajaxBtn =
            By.xpath("//button[contains(text(),'Load AJAX Content')]");

    By ajaxContent =
            By.id("ajax-content");

    public void enterInput1() {

        driver.findElement(input1)
                .sendKeys("Selenium");
    }

    public void showHiddenInput() {

        driver.findElement(toggleInputBtn)
                .click();

        System.out.println(
                "Hidden Input Displayed");
    }

    public void loadAjaxContent() {

        driver.findElement(ajaxBtn)
                .click();

        System.out.println(
                "AJAX Content Loaded");
    }
}