package stepdefinitions;

import java.util.List;

import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.*;
import pages.ProductPage;
import utilities.WaitUtils;

public class ProductStep extends Base {

	// ProductPage product;//hooks have same ref variavle so commented this

	@Given("user is logged into the SwagLab application")
	public void user_is_logged_into_the_swag_lab_application() {
		// Base.product = new ProductPage(Base.driver);//this already initilised in
		// hooks class so commented this
		// product = Base.product;
		System.out.println("✅ User already logged in via Hooks");
	}

	@When("user sort product from low to high")
	public void user_sort_product_from_low_to_high() throws InterruptedException {
		// System.out.println("Base.product = " + Base.product);
		Base.product.selectkDropdownMenuLowToHigh();
	}

	@Then("product should displayed in ascending order of price")
	public void product_should_displayed_in_ascending_order_of_price() {

	}

	@When("user sort the product from high to low")
	public void user_sort_the_product_from_high_to_low() {

		Base.product.selectDropdownMenuHighToLow();
	}

	@Then("product should displayed as descending order of price")
	public void product_should_displayed_as_descending_order_of_price() {

	}

	@When("user adds product {string} to the cart")
	public void user_adds_product_to_the_cart(String productName) {
		product.addProductToCart(productName);
	
		product.clickToCartBucket();
		System.out.println("🛒 Navigated to Cart Page after adding: " + productName);
	}

	@Then("product {string} should be displayed in the cart")
	public void product_should_be_displayed_in_the_cart(String productName) {
		boolean isVisible = cart.isProductDisplayedInCart(productName);
		Assert.assertTrue(isVisible);
		System.out.println("✅ Verified product is displayed in cart: " + productName);
	}

	@When("user adds multiple products to cart")
	public void user_adds_multiple_products_to_cart(List<String> products) {
		for (String product : products) {
			Base.product.addProductToCart(product);
		}
	}

	@When("user removes one product {string}")
	public void user_removes_one_product(String productName) {
		Base.product.removeProductFromCart(productName);
	}

	@Then("cart count should be updated correctly")
	public void cart_count_should_be_updated_correctly() {
	
	}

	@When("user adds product {string} to cart")
	public void user_adds_product_to_cart(String string) {
		
	}

	@Then("cart icon count and total price should be correct")
	public void cart_icon_count_and_total_price_should_be_correct() {
		
	}

}
