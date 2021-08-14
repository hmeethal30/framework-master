package com.framework.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL35_EditCase extends ProjectSpecificMethods {
	
	@org.testng.annotations.BeforeTest
	public void passParametersToDataProvider() throws IOException {
		testcaseName = "Edit Case";
		testDescription = "Test to verify whether the user can edit an existing case";
		authors = "Sunil";
		category = "Regression";
	}
	
	@Test
	public void editCase() {
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickSales()
		.clickCases()
		.getTicketNumber()
		.clickEdit()
		.selectStatus("Working")
		.selectPriority("Low")
		.selectOrigin("Phone")
		.selectSLAviolation("No")
		.clickSave()
		.verifyToastMessage("Case", "was saved");
	}	
}
