package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePickerPage {

    WebDriver driver;

    public DatePickerPage(WebDriver driver) {
        this.driver = driver;
    }

    // Date Picker 1
    By datePicker1 = By.id("datepicker");
    //DatePicker2
   By datePicker2=By.id("txtDate");
    
    // Date Picker 3
    By startDate = By.id("start-date");
    By endDate = By.id("end-date");

    public void selectDatePicker1() {

        driver.findElement(datePicker1)
              .clear();

        driver.findElement(datePicker1)
              .sendKeys("06/15/2026");

        System.out.println("Date Picker 1 Completed");
    }
    public void selectDatePicker2() {

        driver.findElement(datePicker2)
              .click();

        driver.findElement(
            By.xpath("//td/a[text()='15']"))
              .click();

        System.out.println(
            "Date Picker 2 Completed");
    }

  
    public void selectDateRange() {

        driver.findElement(startDate)
              .clear();

        driver.findElement(startDate)
              .sendKeys("06/01/2026");

        driver.findElement(endDate)
              .clear();

        driver.findElement(endDate)
              .sendKeys("06/30/2026");

        System.out.println("Date Picker 3 Completed");
    }
}