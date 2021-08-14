package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreatePartyConsentWithError extends ProjectSpecificMethods {

	@BeforeTest
	public void setTestDetails() {
		testcaseName = "CreatePartyConsentWithError";
		testDescription = "This test is for Create Consent with Error";
		category = "Regression";
		authors = "Vallynayki";
		excelFileName = "Createconsent";

	}


	@Test
	public void CreateConsent(String name) throws InterruptedException {
		new LoginPage().typeUserName().typePassword().clickLogin().clickApplauncher().clickViewAll().clickPartyConsent()
				.clickPartyConsentTab().clickNewPartyConsent().enterName(name).clickSaveWithoutCompletion()
				.alertMessageValidation().errorMessageValidation();
	}

}
