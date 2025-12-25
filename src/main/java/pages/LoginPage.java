package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;

	private By userName = By.id("user-name");
	private By password = By.id("password");
	private By loginBtn = By.id("login-button");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String uName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
		driver.findElement(userName).sendKeys("standard_user");

	}

	public void enterPassword(String pass) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		driver.findElement(password).sendKeys("secret_sauce");

	}

	public void clickToLogin() {
		driver.findElement(loginBtn).click();
	}

	public void login(String uName, String pass) {
		enterUserName(uName);
		enterPassword(pass);
		clickToLogin();

	}

}
