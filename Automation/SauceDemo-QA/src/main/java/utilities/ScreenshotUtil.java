package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtil {

    public static String takeScreenshot(
            WebDriver driver,
            String testName
    ) {
        try {
            // create screenshots folder
            File screenshotFolder = new File("screenshots");

            if (!screenshotFolder.exists()) {
                screenshotFolder.mkdir();
            }

            // create a unique timestamp
            String timestamp = LocalDateTime.now().format(
                    DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss-SSS")
            );

            // build a screenshot filename
            String screenshotPath = "screenshots/" + testName + "_" + timestamp + ".png";

            // capture ss
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destinationFile = new File(screenshotPath);

            // copy ss to destination
            FileUtils.copyFile(
                    sourceFile,
                    destinationFile
            );

            return screenshotPath;
        }
        catch (Exception e) {
            System.out.println("Screenshot capture failed: " + e.getMessage());
            return null;
        }
    }

}
