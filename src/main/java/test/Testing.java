package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		

		
		driver.get("https://www.calculator.net/");
		

		// Find an element by its name attribute and send keys "name-" to it
		driver.findElement(By.name("calcSearchTerm")).sendKeys("name-");

		// Find an element by its id attribute and send keys "id-" to it
		driver.findElement(By.id("calcSearchTerm")).sendKeys("id-");

		// Find a <span> element with id blue button using XPath and click on it
		driver.findElement(By.xpath("//span[@id='bluebtn']")).click();

		// Find an <input> element with id "calcSearchTerm" using CSS selector and send keys "css-" to it
		

		// Find an element by its class attribute value "in longest" and send keys "class" to it
		driver.findElement(By.className("inlongest")).sendKeys("class");

		// Find a link with exact visible text "Mortgage Calculator" and click on it
		driver.findElement(By.linkText("Mortgage Calculator")).click();

		// Find a link with partial visible text "Auto" and click on it
		driver.findElement(By.partialLinkText("Auto")).click();
		
		driver.findElement(By.linkText("Calorie Calculator")).click();
		
		// Assuming the radio button has an id of "radioButtonId"
		driver.findElement(By.xpath("//table[@id='calinputtable']//label[2]/span[@class='rbmark']")).click();
		
		
	}

}
