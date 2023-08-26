package generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * This method is used to take the screenshot with date & time along with the path from the directory
 * @author ishit
 *
 */
public class ScreenshotUtility extends Baseclass implements IAutoConstants {
	public String takingScreenshot(String screenshotname) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		
		String path =DIRECTORY+ SCREENSHOT + screenshotname +" "+TIME+ ".png";
		File file = new File(path);
		try {
			FileUtils.copyFile(photo, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}

}
