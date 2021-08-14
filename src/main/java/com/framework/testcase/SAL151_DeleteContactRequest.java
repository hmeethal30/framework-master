package com.framework.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.ContactReqDashboardPage;
import com.framework.pages.HomePage;
import com.framework.pages.LoginPage;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL151_DeleteContactRequest extends ProjectSpecificMethods{
	
	@BeforeTest
	public void TestCaseDetails() {
		
		testcaseName = "Delete Contact Request"; 
		  testDescription ="This test case is to validate Delete Contact Request feature"; 
		  authors = "Swaminathan"; 
		  category = "Regression";
		}

	@Test
	public void SAL148CreateNewContactRequest() throws IOException, InterruptedException {
		String strReqID = "00000071";
		
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickContactRequests()
		.clickRecordDownIcon(strReqID)
		.clickDelete()
		.ClickDeleteBtn()
		.VerifyDeleteSuccessTostr(strReqID);
		
		
	}
}
