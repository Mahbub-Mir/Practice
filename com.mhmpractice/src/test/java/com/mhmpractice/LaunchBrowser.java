package com.mhmpractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\SWs\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.edge.driver", "D:\\SWs\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		
		// Instantiate a ChromeDriver class.
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		
		
		// Instantiate a ChromeDriver class.
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver =  new ChromeDriver();
		
		driver.navigate().to("https://www.browserstack.com/");
        System.out.println(
                "Open Browser Passed");
		
		
	}

}
