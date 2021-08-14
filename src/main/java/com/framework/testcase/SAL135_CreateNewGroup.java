package com.framework.testcase;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL135_CreateNewGroup extends ProjectSpecificMethods{

	@BeforeTest
	public void setTestDetails() {
		testcaseName = "Verify create group";
		testDescription = "This is a test to verify if a new group can be created successfully by providing required information";
		authors = "Haseena";
		category = "Regression"; 
		excelFileName = "SAL_135";
	}
	
	@Test(dataProvider = "fetchData")
	public void testCreateGroup(String strGroupName, String imageFile) throws InterruptedException, AWTException {
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickSales()
		.clickGroupsTab()
		.clickNewButton()
		.typeGroupName(strGroupName)
		.selectAccessTypeAsPublic()
		.clickSaveAndNext()
		.uploadImage(imageFile)
		.clickNext()
		.clickDone()
		.verifyGroupName(strGroupName);
		;		
	}

}
