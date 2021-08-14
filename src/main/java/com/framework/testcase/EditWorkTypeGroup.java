package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditWorkTypeGroup extends ProjectSpecificMethods {
	@BeforeTest
	public void setTestDetails() {
		testcaseName = "EditWorkTypeGroup";
		testDescription = "This test is for Edit WorkTypeGroup";
		category = "Regression";
		authors = "Vallynayki";
		excelFileName = "WorkType";

	}

	@Test(dataProvider = "fetchData")
	public void EditWorkType(String name) throws InterruptedException {

		new LoginPage().typeUserName().typePassword().clickLogin().clickApplauncher().clickViewAll().clickWorkGroup()
				.searchWorkTypeGroup(name).clickDropdownandEdit().selectGroupType().clickSaveWorkType();

	}
}
