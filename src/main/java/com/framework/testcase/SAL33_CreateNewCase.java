package com.framework.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL33_CreateNewCase extends ProjectSpecificMethods {
	
	@org.testng.annotations.BeforeTest
	public void passParametersToDataProvider() throws IOException {
		testcaseName = "Create New Case";
		testDescription = "Test to verify whether the user is able to create a new case";
		authors = "Sunil";
		category = "Regression";
		excelFileName = "SAL33_CreateCase";
	}
	
	@Test(dataProvider = "fetchData")
	public void createNewCase(String subject, String description, String firstPartOfToastMessage, String lastPartOfToastMessage) {
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickGlobalActionsSVGicon()
		.clickNewCase()
		.chooseContactName()
		.selectStatus()
		.entersubject(subject)
		.enterDescription(description)
		.clickSaveToCreateACase()
		.verifyToastMessage(firstPartOfToastMessage, lastPartOfToastMessage);
	}	
}
