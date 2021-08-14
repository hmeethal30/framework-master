package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL124_CreateContractWithoutMandatoryFields extends ProjectSpecificMethods{
	@BeforeTest
	public void setTest() {
		testcaseName = "SAL124_Create contracts without mandatory fields";
		authors = "Sharathmathi";
		category = "Regression";
	}
	
	@Test
	public void NoMandateFldContracts() throws InterruptedException {
		
		new LoginPage().typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.selectContract()
		.selectContractDropDown()
		.clickNewContract()
		.selectAccountNAme()
		.selectContStartDate()
		.clickSave()
		.verifyErrMsg("These required fields must be completed: Contract Term (months)");
	}
}
