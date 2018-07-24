/**
 * 
 */
package com.savaari.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Raghav
 *
 */
public class BrowserFactory {
	
	public static WebDriver driver;
	public static WebDriver setBrowser(String browsername)
	{
		
		if (browsername.equalsIgnoreCase("Chrome"))
		{	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raghav\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	
		}
		
	return driver;
	
	
	}

}
