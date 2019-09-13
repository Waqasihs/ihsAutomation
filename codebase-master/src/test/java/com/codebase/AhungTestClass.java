package com.codebase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.BaseUi;
import com.resources.DSLLibDesktop;

public class AhungTestClass {
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
		  	//dsl.launchGoogle();
		  	//dsl.xlRead(xPath);
		  	dsl.launchAhung();
	  }
	  
	  @Test
	  public void Test01_Verify_Ahung_Title() {
		  dsl.ahungtestclass.CompareAgahiTitle();
	  }
	  
	  @Test
	  public void Test02_Verify_Ahung_Logo() {
		  dsl.ahungtestclass.CheckAhungLogo();
	  }
	  
	  @Test
	  public void Test03_Enter_User_Id() {
		  dsl.ahungtestclass.EnterUserId();
	  }
	  
	  @Test
	  public void Test04_Enter_Password() {
		  dsl.ahungtestclass.EnterPassword();
	  }
	  
	  @Test
	  public void Test05_Perform_Login() {
		  dsl.ahungtestclass.PerformLogin();
	  }
	  
	/*
	 * @Test public void Test03_Verify_Country_Name() {
	 * dsl.googletestclass.CheckFooterCountryName(); }
	 */

	  @AfterClass
	  public void afterClass() throws Exception {
		  dsl.closeBrowser();
		  //xlwrite(xlPath_Res, XData);//Writes the results
		  //BaseUi.xlwrite(xlPath_Res, XData);
		  
	  }
}
