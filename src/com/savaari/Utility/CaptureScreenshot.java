/**
 * 
 */
package com.savaari.Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/**
 * @author Raghav
 *
 */
public class CaptureScreenshot {
	
	
	
	public static void getScreenshot(WebDriver driver) throws Exception{
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C:\\Users\\Raghav\\workspace\\Savaari Car Rental Automation\\"+driver.getTitle()+CaptureScreenshot.timestamp()+".jpg"));
				
	}

	public static String timestamp() throws Exception{
		String newformat= ReadProperty.getPropData("DateFormatString");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(newformat);
		return sdf.format(date);
		
		
		
	}
	
	
	
}
