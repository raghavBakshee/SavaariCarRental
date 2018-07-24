package com.savaari.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.savaari.Pages.SavaariHomePage;
import com.savaari.Utility.BrowserFactory;
import com.savaari.Utility.CaptureScreenshot;
import com.savaari.Utility.ReadProperty;

public class NewTestCases {
	SavaariHomePage newTC;
	public WebDriver driver;
  @Test
  public void testcase() throws Exception {
	  
  newTC = new SavaariHomePage(driver);
  newTC.finalSubmitAfterAllDetails("Bangalore","04:30 PM");
  CaptureScreenshot.getScreenshot(driver);
  
  
  
  
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  driver= BrowserFactory.setBrowser("chrome");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  driver.get(ReadProperty.getPropData("URL"));
	  //driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  
	  
  }

}
