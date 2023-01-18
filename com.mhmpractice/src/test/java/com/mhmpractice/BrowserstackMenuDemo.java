package com.mhmpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserstackMenuDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		// Maximize the browser
        driver.manage().window().maximize();
     // Launch Web site
		driver.navigate().to("https://www.browserstack.com/");
		Thread.sleep(2000);
		
		//	Products Items   ==============================
		WebElement prod = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
		prod.click();
		
		List<WebElement> prodEles  = driver.findElements(By.xpath("//div[@class=\"dropdown-link-heading\"]"));
		System.out.println("Products Total Number of Items are: " + prodEles .size());
		
		for (int i = 0; i < prodEles.size(); i++) {

			if ((prodEles.get(i).getText().isEmpty()) == false) {
			System.out.println("Item is: " + prodEles.get(i).getText());
			
			}
		}
		
		// Developers items  ===============================
		// Click is not working, Element Not Interactable Exception
		// Using JavascriptExecutor
		WebElement dev = driver.findElement(By.xpath("//li[@class='developers-menu-control']"));
		//Actions act = new Actions(driver);
		//act.moveToElement(dev).perform();
		Thread.sleep(2000);
		//dev.click();
		
		//JavascriptExecutor to click element
	      JavascriptExecutor jse = (JavascriptExecutor) driver;
	      jse.executeScript("arguments[0].click();", dev);
		
		Thread.sleep(2000);
		List<WebElement> devEles  = driver.findElements(By.xpath("//li[@class='developers-menu-control']/a"));
		System.out.println("Developers Total Number of Items are: " + devEles .size());

		for (int j = 0; j < devEles.size(); j++) {

			if ((prodEles.get(j).getAttribute("title").isEmpty()) == true) {
			System.out.println("Item is: " + devEles.get(j).getAttribute("title"));
			}
		}
		
		
		//  Top Menu Product Items  ======================================
		WebElement menu = driver.findElement(By.xpath("//ul[@class='horizontal-list product-menu']"));
		
		//JavascriptExecutor to click element
	    //  jse.executeScript("arguments[0].click();", menu);
		
		jse.executeScript("(\"head > script:nth-child(15)\")", menu);

		
		Thread.sleep(2000);
		List<WebElement> prodMenu = driver.findElements(By.xpath("(//ul[@class='horizontal-list product-menu']/li"));
		System.out.println("Main Menu Total Number of Items are: " + prodMenu.size());
	
		for (int k = 0; k < devEles.size(); k++) {

			if ((prodMenu.get(k).getAttribute("title").isEmpty()) == true) {
			System.out.println("Main Menu is: " + prodMenu.get(k).getAttribute("title"));
			}
		}

	}

}
