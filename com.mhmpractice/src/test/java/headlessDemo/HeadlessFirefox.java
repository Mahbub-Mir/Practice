package headlessDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessFirefox {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		// Configuration for headless
		FirefoxOptions options = new FirefoxOptions();
		// This is one way
		// options.setHeadless(true);
		// This is another way
		options.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(options);

		driver.get("https://demo.nopcommerce.com/");

		System.out.println("Title of the page is: " + driver.getTitle());

	}

}
