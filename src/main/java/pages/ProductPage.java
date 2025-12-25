package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import io.cucumber.java.Scenario;
import utilities.ScreenshotUtils;
import utilities.WaitUtils;

public class ProductPage {

	WebDriver driver;
	Scenario scenario;

	// private By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
	private By cartIcon = By.className("shopping_cart_badge");

	private By dropDown = By.xpath("//select[@class='product_sort_container']");

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		//this.scenario=scenario;
	}

//	public void addProductToCart(String productName) {
//		By addToCartBtn = By.xpath("//div[text()='" + productName + "']/following::button[1]");
//		driver.findElement(addToCartBtn).click();
//	}

	public void clickToCartBucket() {

		driver.findElement(cartIcon).click();
	}

	public void selectkDropdownMenuLowToHigh() throws InterruptedException {
		Select select = new Select(driver.findElement(dropDown));
		Thread.sleep(500);

		select.selectByVisibleText("Price (low to high)");
	}

	public void selectDropdownMenuHighToLow() {

		Select select = new Select(driver.findElement(dropDown));
		// Thread.sleep(5000);

		select.selectByVisibleText("Price (high to low)");
	}

	// 🔹 Dynamic Add to Cart method
	public void addProductToCart(String productName) {
		// Dynamic xpath based on product name
		By addToCartBtn = By
				.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button");
		WebElement addCartBtn = driver.findElement(addToCartBtn);
		WaitUtils.waitForElementToBeClickable(driver, addCartBtn);
		
		//ScreenshotUtils.takeFullPageScrollingScreenshot(driver, scenario, "failaddtocart");

		addCartBtn.click();
		System.out.println("✅ Added product to cart: " + productName);

	}

	// 🔹 Dynamic Add to Cart method
	public void removeProductFromCart(String productName) {
		// Dynamic xpath based on product name
		By remProdFrmCrt = By
				.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button");
		WebElement removeBtn = driver.findElement(remProdFrmCrt);
		WaitUtils.waitForElementToBeClickable(driver, removeBtn);
		removeBtn.click();
		System.out.println("✅ Remove product from cart: " + productName);

	}
}