package stepdefinitions;

import base.Base;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginStep extends Base {

	LoginPage login;

	@Given("verify user launches the browser")
	public void verify_user_launches_the_browser() {
//
//		launchBrowser();
//		System.out.println("Browser opened successfully: ");
	}

//	@And("user open application url")
//	public void user_open_application_url() {
////		// Call the Base class method to open the URL from config.properties
////		openApplicationURL();
////		System.out.println("✅ Application URL opened successfully: " + driver.getCurrentUrl());
//	}

	@When("user login with valid credentials")
	public void user_login_with_valid_credentials() {
//		login = new LoginPage(Base.driver);
//		login.login("username", "password");
//		System.out.println("✅ User logged in successfully");

	}

	@Then("user should be navigated to product page")
	public void user_should_be_navigated_to_product_page() {
		String actualTitle = driver.getTitle();
		String expecedTtitle = "Swag Labs";
		if (expecedTtitle.equals(actualTitle)) {
			System.out.println("✅ User navigated to product page successfully");
		}else {
			System.out.println("invalid page");
		}
	}

	@Then("the user quit the browser")
	public void the_user_quit_the_browser() {
		tearDown();
	}

}
