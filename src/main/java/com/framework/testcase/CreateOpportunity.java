package com.framework.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class CreateOpportunity extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setTestDetails() {
		testcaseName = "CreateOpportunity";
		testDescription = "This test is for Create Opportunity";
		category = "Regression";
		authors = "Vallynayki";
		excelFileName = "CreateOpp";

	}
	@Test(dataProvider="fetchData")
	public void CreateOpport(String oppName, String amount) throws InterruptedException, IOException {

		
		 new LoginPage().typeUserName().typePassword().clickLogin().clickApplauncher()
		.clickViewAll()
		.viewAllKeyDeals()
		.clickOpportunity()
		.clickNewOpportunity()
		.clickOpportName(oppName)
		.clickOpportType()
		.clickOpportLeadSource()
		.clickOpportAmount(amount)
		.clickOpportCloseDate()
		.clickOpportStage()
		.clickOpportPrimaryCampaign()
		.clickOpportSave()
		.verifyOpportCreated(oppName,amount);
		
	}

	
	
}
