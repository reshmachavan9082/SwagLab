package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base {
	public static WebDriver driver;

	
	public void launchBrowser() {

		driver = new ChromeDriver();
		// driver.get("https://www.saucedemo.com/");
		System.out.println("Browser launched");
	}

	public void openApplicationURL() {
		driver.get("https://www.saucedemo.com/");

		System.out.println("Apllication launched sucessfully");
	}


	public void tearDown() {
		driver.quit();
	}
}
