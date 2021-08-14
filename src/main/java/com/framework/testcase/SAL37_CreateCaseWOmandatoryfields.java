package com.framework.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL37_CreateCaseWOmandatoryfields extends ProjectSpecificMethods{
	
	@org.testng.annotations.BeforeTest
	public void passParametersToDataProvider() throws IOException {
		testcaseName = "Create case without mandatory fields";
		testDescription = "Test to verify the error message while creating a case without updating the mandatory fields";
		authors = "Sunil";
		category = "Regression";
	}
	
	@Test
	public void createCaseWOmandatoryfields() {
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickSales()
		.clickCases()
		.clickNewCase()
		.selectContact("Naveen Elumalai")
		.selectStatus("--None--")
		.typeSubject("Testing")
		.typeDescription("Automation Testing")
		.clickSaveForMandatoryCheck()
		.verifyErrorMessage();
	}

}
