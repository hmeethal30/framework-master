package com.framework.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.ContactReqDashboardPage;
import com.framework.pages.HomePage;
import com.framework.pages.LoginPage;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL148_CreateNewContactRequest2 extends ProjectSpecificMethods{
	
	@BeforeTest
	public void TestCaseDetails() {
		
		testcaseName = "Create Contact Request"; 
		  testDescription ="This test case is to validate Create Contact Request"; 
		  authors = "Swaminathan"; 
		  category = "Regression";
		}

	@Test
	public void SAL148CreateNewContactRequest() throws IOException {
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickContactRequests()
		.clickNew()
		.clickSearchContacts()
		.clickNewContIcon()
		.clickSalutation()
		.clickMr()
		.TypeFirstName("TestSwFN")
		.TypeLastName("TestSwLN")
		.clickSave()
		.clickMainSaveNewReq()
		.verifySuccess()
		.getContactReqNumber();
		
	}
}
