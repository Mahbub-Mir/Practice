package headlessDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessChrome {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		// Configuration for headless
		ChromeOptions options = new ChromeOptions();
		// This is one way
		// options.setHeadless(true);
		// This is another way
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demo.nopcommerce.com/");

		System.out.println("Title of the page is: " + driver.getTitle());

	}

}
