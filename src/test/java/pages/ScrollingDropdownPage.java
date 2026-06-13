package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScrollingDropdownPage {

    WebDriver driver;

    public ScrollingDropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectItem() {

        driver.findElement(By.id("comboBox"))
              .click();

        driver.findElement(By.id("comboBox"))
              .sendKeys("Item 5");

        driver.findElement(
                By.xpath("//div[text()='Item 5']"))
                .click();

        System.out.println("Item 50 Selected");
    }
}