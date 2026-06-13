package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablePage {

    WebDriver driver;

    public TablePage(WebDriver driver) {

        this.driver = driver;
    }

    public void readStaticTable() {

        List<WebElement> rows =
                driver.findElements(
                By.xpath("//table[@name='BookTable']//tr"));

        System.out.println(
        "Static Table Rows = "
        + rows.size());
    }

    public void readDynamicTable() {

        List<WebElement> rows =
                driver.findElements(
                By.xpath("//table[contains(@id,'taskTable')]//tr"));

        System.out.println(
        "Dynamic Table Rows = "
        + rows.size());
    }

    public void handlePagination() {

        List<WebElement> pages =
                driver.findElements(
                By.xpath("//ul[@id='pagination']//li"));

        for(WebElement page : pages) {

            page.click();

            System.out.println(
                    "Page Clicked");
        }
    }
    public void selectPaginationCheckboxes() {

        for(int i=1;i<=4;i++) {

            driver.findElement(
            By.linkText(String.valueOf(i)))
            .click();

            List<WebElement> checkboxes =
            driver.findElements(
            By.xpath("//table[@id='productTable']//input[@type='checkbox']"));

            for(WebElement cb : checkboxes) {

                if(!cb.isSelected()) {

                    cb.click();
                }
            }

            System.out.println(
            "Page " + i +
            " Checkboxes Selected");
        }
    }
}