package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreatePartyConsent extends ProjectSpecificMethods {

	@BeforeTest
	public void setTestDetails() {
		testcaseName = "CreatePartyConsent";
		testDescription = "This test is for Create Consent";
		category = "Regression";
		authors = "Vallynayki";
		excelFileName = "Createconsent";

	}

	@Test(dataProvider = "fetchData")
	public void CreateConsent(String name) throws InterruptedException {

		new LoginPage().typeUserName().typePassword().clickLogin().clickApplauncher().clickViewAll().clickPartyConsent()
				.clickPartyConsentTab().clickNewPartyConsent().enterName(name).selectPartyfield().selectEffectiveFrom()
				.selectEffectiveTo().clickSave().verifyToastMessageCreate(name);

	}

}
