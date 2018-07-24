/**
 * 
 */
package com.savaari.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Raghav
 *
 */
public class SavaariHomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div/div/h5[2]/a")
	WebElement local_city;
	
	@FindBy(id="from_city")
	WebElement source_city;
	
/*	@FindBy(xpath="/html/body/div[28]/div[1]/table/tbody/tr[5]/td[5]")
	WebElement starting_date;*/
	
	
	@FindBy(xpath="//*[@id='pickup_time']")
	WebElement pickup_time;
	
	
	@FindBy(xpath="//*[@id='go']")
	WebElement submit_button;
	
	public SavaariHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	public void setLocalCity()
	{
		local_city.click();
		
	}
	
	public void setSourceCity(String sourcecity)
	{
		source_city.sendKeys(sourcecity);
		
	}
	
	/*public void setStartingDate(String date)
	{
		starting_date.sendKeys(date);		
		
	}*/
	
	public void setPickUpTime(String pickuptime)
	{
		Select select = new Select (pickup_time);
		select.selectByVisibleText(pickuptime);
					
	}
	
	public void setSubmitButton()
	{
		submit_button.click();
		
	}
	
	public void finalSubmitAfterAllDetails(String sourcecity,String pickuptime)
	{
		this.setLocalCity();
		this.setSourceCity(sourcecity);
//		System.out.println("before date");
//	this.setStartingDate(startingdate);
	System.out.println("after date");
	this.setPickUpTime(pickuptime);
	this.setSubmitButton();		
		
	}
	

}
