package stepdefinitions;

import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Product;
import pages.CartPage;
import pages.CheckOutComplete;
import pages.CheckOutPage;
import pages.CheckoutOverviewPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class EndToEndFlowSteps extends Base {

	LoginPage login;
	ProductPage product;
	CartPage cart;
	CheckOutPage check;
	CheckoutOverviewPage checkOverview;
	CheckOutComplete checkComplete;
	HomePage homepage;

	@Given("user launches the browser")
	public void user_launches_the_browser() {
		launchBrowser();
	}

	@Given("user open application url")
	public void user_open_application_url() {
		openApplicationURL();
	}

	@Given("user logs in with valid credentials {string} and {string}")
	public void user_logs_in_with_valid_credentials_and(String uName, String pass) {

		login = new LoginPage(Base.driver);
		login.login(uName, pass);
	}

	@When("user add product to {string} to the cart")
	public void user_add_product_to_to_the_cart(String productName) {

		product = new ProductPage(Base.driver);
		product.addProductToCart(productName);
	}

	@When("user navigate to the cart page")
	public void user_navigate_to_the_cart_page() {

		product = new ProductPage(Base.driver);
		product.clickToCartBucket();
	}

	@When("user click to checkout button")
	public void user_click_to_checkout_button() {
		cart = new CartPage(Base.driver);
		cart.clickToCheckOutBtn();
	}

	@When("user enter checkoit details {string} {string} {string}")
	public void user_enter_checkoit_details(String uName, String lName, String pincode) throws InterruptedException {
		check = new CheckOutPage(Base.driver);
		check.fillCheckOutDetails(uName, lName, pincode);

	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {

		check = new CheckOutPage(Base.driver);
		check.clickToContinue();
	}

	@When("user click on finish button")
	public void user_click_on_finish_button() {

		checkOverview = new CheckoutOverviewPage(Base.driver);
		checkOverview.clickFinishButton();
	}

	@Then("user should show confirmation message {string}")
	public void user_should_show_confirmation_message(String string) {

//		checkComplete = new CheckOutComplete(Base.driver);
//		checkComplete.clickBackToHomeButton();
	}

	@Then("user logout from the application")
	public void user_logout_from_the_application() throws InterruptedException {

//		homepage = new HomePage(Base.driver);
//		homepage.clickLogoutButton();
	}

	@Then("user quit the browser")
	public void user_quit_the_browser() {
		// driver.close();
	}

}
