package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;

	private By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
	private By cartIcon = By.className("shopping_cart_badge");

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addProductToCart(String productName) {
		By addToCartBtn = By.xpath("//div[text()='" + productName + "']/following::button[1]");
		driver.findElement(addToCartBtn).click();
	}

	public void clickToCartBucket() {

		driver.findElement(cartIcon).click();
	}
}
