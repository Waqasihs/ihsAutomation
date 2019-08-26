package com.codebase.ui;

import junit.framework.Assert;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.baseClass.BaseUi;
//import com.codebase.WebTestClass;
import com.codebase.GoogleTestClass;

public class GoogleTestClass_UI extends BaseUi {
	WebDriver driver;
	

	public GoogleTestClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css = "[id = 'hplogo']")
	private WebElement googleLogo;
	
	@FindBy(css = "[class = 'Q8LRLc']")
	private WebElement countryName;
	
	
	
	
	public void CheckGoogleTitle() {
		Assert.assertEquals("Google", driver.getTitle()); 
		// OR
		// isElementDisplayed(googleTitle);
	}
	
	public void CheckGoogleLogo() {
		isElementDisplayed(googleLogo);
	}
		
	public void CheckFooterCountryName() {
		isElementDisplayed(countryName);
		String footerCountryName = countryName.getText();
		if (footerCountryName.contentEquals("Pakistan")) {
			System.out.println("Country Name found");
		 
		}else {
			System.out.println("Country Name not found");
			
		}
	}
	
	

}
