package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	private By menu = By.xpath("//button[@id='react-burger-menu-btn']");
	private By logoutBtn = By.xpath("//a[@id='logout_sidebar_link']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickLogoutButton() throws InterruptedException {

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(menu));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(menu));

	
		wait.until(ExpectedConditions.elementToBeClickable(logoutBtn)).click();
		

	}
}
