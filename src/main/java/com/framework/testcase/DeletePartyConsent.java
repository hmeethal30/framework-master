package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DeletePartyConsent extends ProjectSpecificMethods {

	@BeforeTest
	public void setTestDetails() {
		testcaseName = "DeletePartyConsent";
		testDescription = "This test is for Delete Consent";
		category = "Regression";
		authors = "Vallynayki";

	}

	@Test
	public void DeleteConsent() throws InterruptedException {

		new LoginPage().typeUserName().typePassword().clickLogin().clickApplauncher().clickViewAll().clickPartyConsent()
				.clickPartyConsentTab().searchbyName().clickDeleteButton().popupDelete().verifyToastMessageDelete();

	}
}
