<<<<<<< HEAD
package com.framework.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.pages.ContactReqDashboardPage;
import com.framework.pages.HomePage;
import com.framework.pages.LoginPage;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL120_CreateLocations extends ProjectSpecificMethods{
	
	@BeforeTest
	public void TestCaseDetails() {
		
		testcaseName = "Create Locations request"; 
		  testDescription ="This test case is to validate Create Locations Feature"; 
		  authors = "Swaminathan"; 
		  category = "Regression";
		  excelFileName = "SAL120CreateLocations";
		}

	
	
	@Test (dataProvider="fetchData")
	public void SAL148CreateNewContactRequest(String strName, String strType) throws IOException, InterruptedException {
		System.out.println(strName+" and "+strType);
		
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickLocations().clickNew().typeLocationName(strName).selectAccountType(strType)
		.typeExternalReferencee(strName)
		.clickMainSave().verifyNewLocation(strName);
		
			
	}
}
=======
package com.framework.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.pages.ContactReqDashboardPage;
import com.framework.pages.HomePage;
import com.framework.pages.LoginPage;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL120_CreateLocations extends ProjectSpecificMethods{
	
	@BeforeTest
	public void TestCaseDetails() {
		
		testcaseName = "Create Locations request"; 
		  testDescription ="This test case is to validate Create Locations Feature"; 
		  authors = "Swaminathan"; 
		  category = "Regression";
		  excelFileName = "SAL120CreateLocations";
		}

	
	
	@Test (dataProvider="fetchData")
	public void SAL148CreateNewContactRequest(String strName, String strType) throws IOException, InterruptedException {
		System.out.println(strName+" and "+strType);
		
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickLocations().clickNew().typeLocationName(strName).selectAccountType(strType)
		.typeExternalReferencee(strName)
		.clickMainSave().verifyNewLocation(strName);
		
			
	}
}
>>>>>>> 9529103d6d51341f8de5c8d21d5a06d95ff8f512
