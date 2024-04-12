package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing6 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.redbus.com/");
        
        driver.manage().window().maximize();

        // Click on the "Help" link
        driver.findElement(By.linkText("Help")).click();

        // Introduce a delay (not recommended, use dynamic waits instead)
        Thread.sleep(3000);

        // Get the window handles and switch to the new window
        Set<String> windowHandles = driver.getWindowHandles();
        
        Iterator<String> iterator = windowHandles.iterator();
        
        String pw = iterator.next();
        String cw = iterator.next();
        
        driver.switchTo().window(cw);
        
        driver.findElement(By.xpath("//i[@class='icon-close']")).click();
        
        Thread.sleep(2000);
        
        driver.close();
        
        driver.switchTo().window(pw);
        
        
    }
}
