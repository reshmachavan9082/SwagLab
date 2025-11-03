package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	WebDriver driver;

	private By firstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By zip = By.id("postal-code");
	private By continueBtn = By.id("continue");

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);

	}

	public void enterLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);

	}

	public void enterPincode(String pincode) {
		driver.findElement(zip).sendKeys(pincode);

	}


	public void clickToCheckOutDetails(String fname, String lname, String pincode) {

		enterFirstName(fname);
		enterLastName(lname);
		enterPincode(pincode);

	}
	
	public void clickToContinue() {
		driver.findElement(continueBtn).click();

	}
}
