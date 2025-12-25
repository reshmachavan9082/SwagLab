package hooks;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;
import utilities.ConfigReader;
import utilities.ScreenshotUtils;

public class Hooks extends Base {
	LoginPage login;

	@Before("@requiresLogin")
	public void setUp() {
		launchBrowser();
		openApplicationURL();
		login = new LoginPage(Base.driver);// this driver is base driver and this has pass to page class
		Base.product = new ProductPage(Base.driver);
		Base.cart = new CartPage(Base.driver);
		login.login(ConfigReader.getProperties("username"), ConfigReader.getProperties("password"));
	}

	@After
	public void tearDownScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			ScreenshotUtils.takeFullPageScrollingScreenshot(driver, "failed_test");
		}
		if (driver != null) {
			driver.quit();
		}

	}
}
