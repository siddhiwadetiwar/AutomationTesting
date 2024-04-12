package test;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Testing7 {
	
	    public static void main(String[] args) {
	    	
	        WebDriver driver = new FirefoxDriver();
	        
	        driver.get("https://www.calculator.net/");
	        
	              driver.manage().window().maximize();
	              
	              calPage.searchinput(driver).sendKeys("calorie calculator");
	    
	  }


}



