package utilities;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;


import base.Base;
import io.cucumber.java.Scenario;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotUtils extends Base {
    // 🔹 Take full-page scrolling screenshot using AShot
    public static void takeFullPageScrollingScreenshot(WebDriver driver, Scenario scenario, String name) {
        try {
            Screenshot screenshot = new AShot()
                    .shootingStrategy(ShootingStrategies.viewportPasting(1000)) // 1s scroll
                    .takeScreenshot(driver);
            File file = new File("target/screenshots/" + name + ".png");
            ImageIO.write(screenshot.getImage(), "PNG", file);

            // Attach to Cucumber report
            scenario.attach(FileUtils.fileToBytes(file), "image/png", name);
        } catch (IOException e) {
            System.out.println("❌ Failed to save full-page scrolling screenshot: " + e.getMessage());
        }
    }



}
