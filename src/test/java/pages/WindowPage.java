package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowPage {

    WebDriver driver;

    public WindowPage(WebDriver driver) {

        this.driver = driver;
    }

    public void handleNewTab() {

        String parent =
                driver.getWindowHandle();

        driver.findElement(
        By.xpath("//button[contains(text(),'New Tab')]"))
        .click();

        Set<String> windows =
                driver.getWindowHandles();

        for(String win : windows) {

            if(!win.equals(parent)) {

                driver.switchTo()
                      .window(win);

                System.out.println(
                        driver.getTitle());

                driver.close();
            }
        }

        driver.switchTo()
              .window(parent);
    }
    public void handlePopupWindow() {

        String parent =
                driver.getWindowHandle();

        driver.findElement(
                By.xpath("//button[text()='Popup Windows']"))
                .click();

        for(String win :
                driver.getWindowHandles()) {

            if(!win.equals(parent)) {

                driver.switchTo()
                      .window(win);

                System.out.println(
                "Popup Title = "
                + driver.getTitle());

                driver.close();
            }
        }

        driver.switchTo()
              .window(parent);

        System.out.println(
        "Popup Window Handled");
    }
}