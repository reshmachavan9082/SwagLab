package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;

	private By checkoutBtn = By.id("checkout");

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	 // 🔹 Verify that product is displayed in cart
    public boolean isProductDisplayedInCart(String productName) {
        By productLocator = By.xpath("//div[@class='inventory_item_name' and text()='" + productName + "']");
        boolean isDisplayed = driver.findElement(productLocator).isDisplayed();
        System.out.println("🛒 Product visible in cart: " + productName);
        return isDisplayed;
    }

    // 🔹 Click on Checkout button
    public void clickToCheckOutBtn() {
        driver.findElement(checkoutBtn).click();
        System.out.println("✅ Clicked on Checkout button");
    }
    
    
	
    
}
