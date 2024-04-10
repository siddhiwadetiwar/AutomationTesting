package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing5 {
    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver (ChromeDriver in this case)
        WebDriver driver = new ChromeDriver();

        // Navigate to the Redbus website
        driver.get("https://www.redbus.com/");

        // Find the "Help" link and perform actions using Actions class
        WebElement help = driver.findElement(By.linkText("Help"));
        Actions act = new Actions(driver);
        act.moveToElement(help).click().perform();

        // Introduce a delay (not recommended, use dynamic waits instead)
        Thread.sleep(2000);

        // Find and click on the close button (cross)
        WebElement cross = driver.findElement(By.cssSelector("i.icon-close"));
        act.moveToElement(cross).click().perform();

        // Introduce another delay (not recommended, use dynamic waits instead)
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
