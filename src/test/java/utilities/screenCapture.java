package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenCapture {
	
	public static void takeScreenshot(WebDriver driver) throws Exception {
	Date currentDate = new Date();
	SimpleDateFormat ff = new SimpleDateFormat("yyyyMMdd_hhmmss");	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\screenshot\\"+ff.format(currentDate)+".png"));
	}
}







