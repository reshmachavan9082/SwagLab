package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.CartPage;
import pages.ProductPage;
import utilities.ConfigReader;

public class Base {
	public static WebDriver driver;
    public static ProductPage product;
    public static CartPage cart;

	public void launchBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
		options.addArguments("--guest"); // optional but safest
		options.addArguments("--start-maximized");

		String browser = ConfigReader.getProperties("browser");//this method return the value of given key so we need to store that value

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver(options);
			System.out.println("Browser launched");
		}
	}

	public void openApplicationURL() {
		driver.get(ConfigReader.getProperties("url"));
		System.out.println("Application launched sucessfully");
	}

	public void tearDown() {
	//	driver.quit();
	}
}
