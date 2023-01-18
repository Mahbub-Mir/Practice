package com.mhmpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

public class AssertDemo {
	
	//			https://www.browserstack.com/guide/verify-and-assert-in-selenium

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\I2EWebsiteTest\\Driver\\chromedriver.exe");
//		Instantiate a ChromeDriver class.
//		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		// Maximize the browser
        driver.manage().window().maximize();
     // Launch Website
		driver.navigate().to("https://www.browserstack.com/");
		
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Boolean verifyTitle2 = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Boolean verifyTitle3 = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack3");
		Boolean verifyTitle4 = driver.getTitle().isBlank();
		Boolean bol = null;
		
		
		Assert.assertEquals(verifyTitle, verifyTitle2);
        System.out.println(
                "assertEquals Passed");
        
		Assert.assertNotEquals(verifyTitle, verifyTitle3);
        System.out.println(
                "assertNotEquals Passed");
		
		assertTrue(verifyTitle);
        System.out.println(
                "assertTrue Passed");
        
		assertFalse(verifyTitle3);
        System.out.println(
                "assertFalse Passed");
        
        assertNotNull(verifyTitle);
        System.out.println(
                "assertNotNull Passed");   
        
        assertNull(bol);
        System.out.println(
                "assertNull Passed");   
        
		driver.close();
		
	}

}
