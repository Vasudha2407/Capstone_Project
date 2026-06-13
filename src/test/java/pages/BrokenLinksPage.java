package pages;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksPage {

    WebDriver driver;

    public BrokenLinksPage(WebDriver driver) {
        this.driver = driver;
    }

    
    public void verifyBrokenLinks() {

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {

            String url = link.getDomAttribute("href");

            if (url == null || url.isEmpty()) {
                continue;
            }

            try {
                HttpURLConnection conn =
                        (HttpURLConnection) new URI(url).toURL().openConnection();

                conn.setConnectTimeout(3000);
                conn.connect();

                int code = conn.getResponseCode();

                if (code >= 400) {
                    System.out.println(url + " --> ❌ Broken Link (" + code + ")");
                } else {
                    System.out.println(url + " --> ✅ Valid Link (" + code + ")");
                }

            } catch (Exception e) {
                System.out.println(url + " --> ❌ Error / Broken Link");
            }
        }
    }

    public void clickLaptopLinks() throws InterruptedException {

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (int i = 0; i < links.size(); i++) {

            // 🔥 re-fetch every time (avoid stale element)
            links = driver.findElements(By.tagName("a"));
            WebElement link = links.get(i);

            String text = link.getText();

            if (text.equalsIgnoreCase("Apple") ||
                text.equalsIgnoreCase("Lenovo") ||
                text.equalsIgnoreCase("Dell")) {

                System.out.println("Opening Laptop Link: " + text);

                link.click();  
                Thread.sleep(2000);

                driver.navigate().back();  // 🔙 go back
            }
        }
    }

  
    public void handleAllLinks() throws InterruptedException {

        System.out.println("----- Checking Broken Links -----");
        verifyBrokenLinks();

        System.out.println("----- Opening Laptop Links -----");
        clickLaptopLinks();
    }
}