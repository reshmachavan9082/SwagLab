package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutOverviewPage {

	WebDriver driver;

	public CheckoutOverviewPage(WebDriver driver) {
		this.driver = driver;
	}

	private By finishBtn = By.xpath("//button[text()='Finish']");

	public void clickFinishButton() {
		 System.out.println("URL at clickFinishButton: " + driver.getCurrentUrl());
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(finishBtn));
//	    ((JavascriptExecutor) driver)
//        .executeScript("arguments[0].scrollIntoView(true);", driver.findElement(finishBtn));
		driver.findElement(finishBtn).click();
	}

}
