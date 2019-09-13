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

public class AhungTestClass_UI extends BaseUi {
	WebDriver driver;
	

	public AhungTestClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/div/img")
	private WebElement ahungLogo;
	
	@FindBy(css = "[id = 'username']")
	private WebElement txtUserName;
	
	@FindBy(css = "[id = 'password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/div/form/div[2]/button")
	private WebElement btnLogin;
	
	
	
	public void CompareAgahiTitle() {
		Assert.assertEquals("Aagahi Web", driver.getTitle());
		hardwait(5);
		// OR
		// isElementDisplayed(googleTitle);
	}
	
	public void CheckAhungLogo() {
		isElementDisplayed(ahungLogo);
	}
	
	public void EnterUserId() {
		txtUserName.sendKeys("admin");
		hardwait(2);
	}
	
	public void EnterPassword() {
		txtPassword.sendKeys("admin123");
		hardwait(2);
	}
	
	public void PerformLogin() {
		btnLogin.click();
		hardwait(5);
	}
		
	/*
	 * public void CheckFooterCountryName() { isElementDisplayed(countryName);
	 * String footerCountryName = countryName.getText(); if
	 * (footerCountryName.contentEquals("Pakistan")) {
	 * System.out.println("Country Name found");
	 * 
	 * }else { System.out.println("Country Name not found");
	 * 
	 * } }
	 */
	
	

}
