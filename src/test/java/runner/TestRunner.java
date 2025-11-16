package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/SauceDemoE2E.feature", glue = { "stepdefinitions",
		"hooks" }, tags = "@smoke and @regression", plugin = { "pretty",
				"html:target/cucumber-reports.html" }, dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests {

}
