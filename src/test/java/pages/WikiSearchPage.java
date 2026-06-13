package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiSearchPage {

    WebDriver driver;

    public WikiSearchPage(WebDriver driver) {

        this.driver = driver;
    }

    public void searchWiki() {

        driver.findElement(
        By.id("Wikipedia1_wikipedia-search-input"))
        .sendKeys("Selenium");

        driver.findElement(
        By.className("wikipedia-search-button"))
        .click();

        System.out.println(
        "Wikipedia Search Done");
    }
}