package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {

    WebDriver driver;

    public UploadPage(WebDriver driver) {

        this.driver = driver;
    }

    public void uploadSingleFile() {

        driver.findElement(
        By.id("singleFileInput"))
        .sendKeys(
        		"C:\\Users\\HELLO\\Downloads\\Surabhi Resume.pdf");
    }

    public void uploadMultipleFiles() {

        String file1 =
                "C:\\Users\\HELLO\\Downloads\\vasudha python.pdf";

        String file2 =
                "C:\\Users\\HELLO\\Downloads\\Surabhi Resume.pdf";

        driver.findElement(
                By.id("multipleFilesInput"))
                .sendKeys(file1 + "\n" + file2);
    }
}