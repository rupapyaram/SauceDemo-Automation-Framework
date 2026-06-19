package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

	public static String captureScreenshot(WebDriver driver, String testName) {

	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	    String path = "screenshots/" + testName + ".png";

	    try {
	        FileHandler.copy(src, new File(path));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return path;
	
    }
}
