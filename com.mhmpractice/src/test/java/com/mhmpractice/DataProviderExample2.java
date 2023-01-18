package com.mhmpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample2 {

	public WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Load application
		driver.get("https://www.saucedemo.com/");
	}

	// this will take data from dataprovider which we created
	@Test(dataProvider = "testdata")
	public void TestLogin(String uname, String password) throws InterruptedException {

		// clear email field
		// driver.findElement(By.xpath("//input[@name='username']")).clear();
		// Enter username
		Thread.sleep(3000);
		driver.findElement(By.id("user-name")).sendKeys(uname);
		Thread.sleep(3000);
		// Clear password field
		// driver.findElement(By.xpath("//input[@name='password']")).clear();
		// Enter password
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}

	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() {

		// Create object array with 2 rows and 2 column- first parameter is row and
		// second is column
		Object[][] data = new Object[2][2];

		// Enter data to row 0 column 0
		data[0][0] = "standard_user";
		// Enter data to row 0 column 1
		data[0][1] = "secret_sauce";
		// Enter data to row 1 column 0
		data[1][0] = "performance_glitch_user";
		// Enter data to row 1 column 0
		data[1][1] = "secret_sauce";
		// return arrayobject to testscript
		return data;
	}

	@AfterTest
	public void closebrowser() {
		// driver.quit();
	}

}
