package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsPage {

    WebDriver driver;

    public ActionsPage(WebDriver driver) {

        this.driver = driver;
    }

    public void performDragAndDrop() {

        Actions act = new Actions(driver);

        WebElement source =
                driver.findElement(
                By.id("draggable"));

        WebElement target =
                driver.findElement(
                By.id("droppable"));

        act.dragAndDrop(source, target)
           .perform();
    }

    public void performDoubleClick() {

        Actions act = new Actions(driver);

        WebElement button =
                driver.findElement(
                By.xpath("//button[text()='Copy Text']"));

        act.doubleClick(button)
           .perform();
    }

    public void performMouseHover() {

        Actions act = new Actions(driver);

        WebElement hover =
                driver.findElement(
                By.xpath("//button[text()='Point Me']"));

        act.moveToElement(hover)
           .perform();
    }

    public void moveSlider() {

        Actions act = new Actions(driver);

        WebElement slider =
                driver.findElement( By.xpath("//span[contains(@class,'ui-slider-handle')]"));

       act.dragAndDropBy(slider, 100, 0).perform();
              
    }
}