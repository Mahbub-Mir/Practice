package com.webdriver;

import java.awt.AWTException;
import java.awt.Button;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownDemo4 {

		public static void main(String[] aa) throws AWTException, InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
	        driver.get("https://semantic-ui.com/modules/dropdown.html");
	        driver.manage().window().maximize();
	         
	        Thread.sleep(3000);
	        //scroll down the page
	         
	        JavascriptExecutor jsexec = (JavascriptExecutor)driver;
	        //jsexec.executeScript("window.scrollBy(0,500)");
	        // scroll down to State dropdown 
			WebElement state = driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[7]/div"));
			jsexec.executeScript("arguments[0].scrollIntoView(true);", state);
	         
	        //Click on State Dropdown
			state.click();
	        //driver.findElement(By.xpath(" //*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[3]/div[2]")).click();
	         
	       // List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[7]/div/select/option"));
			List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[7]/div/div[2]/div"));
	        
	        System.out.println(allOptions.size());
	           
	        for(int i = 0; i<=allOptions.size()-1; i++) {
	        	
	        	String statename = allOptions.get(i).getText();
	        	System.out.println( i + " State is :" + statename);
	            
	            if(allOptions.get(i).getText().contains("Virginia")) {
	                 
	                allOptions.get(i).click();
	                break;
	                 
	            }
	        }
	         
	}
	 
	}
