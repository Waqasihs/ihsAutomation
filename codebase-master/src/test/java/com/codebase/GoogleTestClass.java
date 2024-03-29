package com.codebase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.BaseUi;
import com.resources.DSLLibDesktop;

public class GoogleTestClass {
	DSLLibDesktop dsl;
	  //public String xPath = "D:/Excels/MyExcel.xls";
	  //public String xPath = "D:/Excels/MyFirstExcel.xlsx";
	  //public String xlPath_Res = "D:/Excels/userStatuses.xlsx";
	  //public static String XData[][];
	  //public String xlData[][];
	  

	  @BeforeClass
	  public void beforeClass() throws Exception {
		  	dsl = new DSLLibDesktop();
			//dsl.launchCubixCo();
		  	dsl.launchGoogle();
		  	//dsl.xlRead(xPath);
		  	
	  }
	  
	  @Test
	  public void Test01_Verify_Google_Title() {
		  dsl.googletestclass.CheckGoogleTitle();
	  }
	  
	  @Test
	  public void Test02_Verify_Google_Logo() {
		  dsl.googletestclass.CheckGoogleLogo();
	  }
	  
	  
	  @Test
	  public void Test03_Verify_Country_Name() {
		  dsl.googletestclass.CheckFooterCountryName();
	  }
	  

	  @AfterClass
	  public void afterClass() throws Exception {
		  dsl.closeBrowser();
		  //xlwrite(xlPath_Res, XData);//Writes the results
		  //BaseUi.xlwrite(xlPath_Res, XData);
		  
	  }
}
