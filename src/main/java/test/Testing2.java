package test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;

public class Testing2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		

		
		driver.get("https://www.calculator.net/");
		
		driver.findElement(By.linkText("Calorie Calculator")).click();
		
		WebElement el=driver.findElement(By.id("cactivity"));

		Select sl= new Select(el);

		sl.selectByIndex(2);
		
		List<WebElement> l=sl.getOptions();
		l.size();


		for (int i=0;i<l.size();i++)
		{
		String k=l.get(i).getText();
		System.out.println(k);

		}
	}
}