package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing4 {

    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://schooledn.py.gov.in/admission/hsc.html");

        // Find and interact with elements using Actions class
        WebElement dg = driver.findElement(By.xpath("//a[normalize-space()='Schools']"));
        Actions act = new Actions(driver);
        act.moveToElement(dg).click().perform();

        WebElement dp = driver.findElement(By.xpath("//a[normalize-space()='Private']"));
        act.moveToElement(dp).click().perform();

        WebElement d = driver.findElement(By.xpath("//a[normalize-space()='Govt Aided']"));
        act.moveToElement(d).click().perform();

        // Add a delay using Thread.sleep (not recommended for production code)
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
