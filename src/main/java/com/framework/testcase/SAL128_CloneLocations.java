package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL128_CloneLocations extends ProjectSpecificMethods{

	@BeforeTest
	public void setTestDetails() {
		testcaseName = "Clone locations";
		testDescription = "Test to verify whether the user is able to clone the location";
		authors = "Sunil";
		category = "Regression";
	}
	
	@Test
	public void cancelLocations() {
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickLocations();
	}
}
