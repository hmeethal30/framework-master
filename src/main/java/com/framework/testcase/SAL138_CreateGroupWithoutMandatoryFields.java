package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.pages.HomePage;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL138_CreateGroupWithoutMandatoryFields extends ProjectSpecificMethods {

	@BeforeTest
	public void setTestDetails() {
		testcaseName = "Verify create group without mandatory fields";
		testDescription = "This is a test to verify error is displayed when mandatory fields are not enetered";
		authors = "Haseena";
		category = "Regression"; 
	}
	
	@Test
	public void testCreateGroupwithoutMndtryFlds() {
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickSales()
		.clickGroupsTab()
		.clickNewButton()
		.clickSaveAndNext()
		.typeGroupName("testgroup")
		.verifyAlertforGroupsWithoutMndtryFlds();
		;		
	}
}
