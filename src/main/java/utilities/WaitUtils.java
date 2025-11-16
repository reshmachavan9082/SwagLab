package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class WaitUtils extends Base {
	
	// Private helper to create a single WebDriverWait object
    private static WebDriverWait wait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    // Wait until a WebElement is clickable
    public static void waitForElementToBeClickable(WebDriver driver, WebElement element) {
        wait(driver).until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait until a WebElement is visible
    public static void waitForElementToBeVisible(WebDriver driver, WebElement element) {
        wait(driver).until(ExpectedConditions.visibilityOf(element));
    }

    // Wait until an element is present in the DOM
    public static void waitForPresenceOfElement(WebDriver driver, By locator) {
        wait(driver).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait until an element disappears
    public static void waitForElementToDisappear(WebDriver driver, By locator) {
        wait(driver).until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // Wait until an alert is present
    public static void waitForAlert(WebDriver driver) {
        wait(driver).until(ExpectedConditions.alertIsPresent());
    }

    // Wait until specific text is present in element
    public static void waitForTextToBePresent(WebDriver driver, WebElement element, String text) {
        wait(driver).until(ExpectedConditions.textToBePresentInElement(element, text));
    }

}
