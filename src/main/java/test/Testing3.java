package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing3 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200/home");

        // Find an <input> element with placeholder "Type query" using CSS selector and send keys "css-" to it
        driver.findElement(By.cssSelector("input[placeholder='Type query']")).sendKeys("css-");

        // Assuming the radio button has an id of "radioButtonId"
        driver.findElement(By.cssSelector("body app-root label:nth-child(2)")).click();

        // Find a link with partial visible text "Enter" and click on it
        driver.findElement(By.partialLinkText("Enter")).click();

        // Find a link with visible text "Personal" and click on it
        driver.findElement(By.linkText("Personal")).click();

        // Find a <span> element with id "signInBtn" using XPath and click on it
        driver.findElement(By.xpath("//button[@id='signInBtn']")).click();

        driver.findElement(By.cssSelector("input[placeholder='Enter username']")).sendKeys("archie@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Enter Password']")).sendKeys("archie@123");
        driver.findElement(By.xpath("//button[@class='richblue']")).click();

        // Close the browser after completing actions
        driver.quit();
    }
}
