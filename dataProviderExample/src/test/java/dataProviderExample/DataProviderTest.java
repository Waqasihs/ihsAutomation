package dataProviderExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest {

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Waqas\\eclipse-workspace\\chromedriver.exe");

		// Initialize browser
		WebDriver driver=new ChromeDriver();

		// Maximize browser 
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");
	}

	@Test
	public void testMethod() {
		
	}


	@AfterMethod 
	public void afterMethod() {

		// Close the driver

		driver.quit();
		driver.close();
	}

}
