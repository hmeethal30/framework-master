package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditPartyConsent extends ProjectSpecificMethods {

	@BeforeTest
	public void setTestDetails() {
		testcaseName = "EditPartyConsent";
		testDescription = "This test is for Edit Consent";
		category = "Regression";
		authors = "Vallynayki";

	}

	@Test
	public void DeleteConsent() throws InterruptedException {

		new LoginPage().typeUserName().typePassword().clickLogin().clickApplauncher().clickViewAll().clickPartyConsent()
				.clickPartyConsentTab().searchbyName().clickEditButton().EditPrivacyConsent().EditConsentDate()
				.EditConsentTime().clickSaveAfterEdit();

	}
}
