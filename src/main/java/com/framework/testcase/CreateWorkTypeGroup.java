package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateWorkTypeGroup extends ProjectSpecificMethods {

	@BeforeTest
	public void setTestDetails() {
		testcaseName = "CreateWorkTypeGroup";
		testDescription = "This test is for Create WorkTypeGroup";
		category = "Regression";
		authors = "Vallynayki";
		excelFileName = "WorkType";

	}

	@Test(dataProvider = "fetchData")
	public void createWorkGroup(String name) throws InterruptedException {

		new LoginPage().typeUserName().typePassword().clickLogin().clickApplauncher().clickViewAll().clickWorkGroup()
				.clickNewWorkGroup().enterWorkTypeGroupName(name).clickSaveWorkType();

	}
}
