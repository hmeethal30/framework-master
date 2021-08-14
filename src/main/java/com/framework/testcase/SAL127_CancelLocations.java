package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL127_CancelLocations extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setTestDetails() {
		testcaseName = "Cancel locations";
		testDescription = "Test to verify whether the user is able to cancel the location that has been set";
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
		.clickLocations()
		.clickNew()
		.typeLocationName("Chennai")
		.selectAccountType("Space")
		.typeExternalReferencee("Testing")
		.clickCancel()
		.verifyLocationIsCancelled();
	}

}
