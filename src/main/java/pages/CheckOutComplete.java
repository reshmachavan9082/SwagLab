package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutComplete {

	WebDriver driver;
	private By backToHomeBtn = By.xpath("//button[@id=\"back-to-products\"]");
	private By message = By.xpath("//h2[contains(text(),'Thank you')]");

	public CheckOutComplete(WebDriver driver) {
		this.driver = driver;
	}

	public void clickBackToHomeButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			// ✅ Wait until the confirmation message is visible
			WebElement msgElement = wait.until(ExpectedConditions.visibilityOfElementLocated(message));
			System.out.println("✅ Confirmation message: " + msgElement.getText());

			// ✅ Wait for Back to Home button and click it
			WebElement homeBtn = wait.until(ExpectedConditions.elementToBeClickable(backToHomeBtn));
			homeBtn.click();
			System.out.println("✅ Clicked Back to Home button successfully");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("❌ Failed to verify confirmation message: " + e.getMessage());
		}

	}

}
