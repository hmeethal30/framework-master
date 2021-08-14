package com.framework.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL36_DeleteCase extends ProjectSpecificMethods{
	
	@org.testng.annotations.BeforeTest
	public void passParametersToDataProvider() throws IOException {
		testcaseName = "Delete Case";
		testDescription = "Test to verify whether the user is able to delete the case that was created earlier";
		authors = "Sunil";
		category = "Regression";
	}
	
	@Test
	public void deleteCase() {
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickSales()
		.clickCases()
		.sortCasesInDateOrder()
		.clickDropDown()
		.selectDelete()
		.verifyDeleteConfirmation()
		.verifyCasesIsDeleted();		
	}
}
