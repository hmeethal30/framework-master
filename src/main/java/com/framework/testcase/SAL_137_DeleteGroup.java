package com.framework.testcase;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SAL_137_DeleteGroup extends ProjectSpecificMethods {
	@BeforeTest
	public void setTestDetails() {
		testcaseName = "Verify delete group";
		testDescription = "This is a test to verify if a group can be deleted";
		authors = "Haseena";
		category = "Regression"; 
		excelFileName = "SAL_137";
	}
	
	@Test(dataProvider = "fetchData")
	public void testEditGroup(String strGroupName, String strGroupDescription, String strFontName, String strFontSize) throws InterruptedException, AWTException {
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickSales()
		.clickGroupsTab()
		.searchGroupUsingName(strGroupName)
		.clickOnGroupAfterSearch(strGroupName)
		
		
		
		.selectEditGroup(strGroupName)
		.typeGroupDescription(strGroupDescription)
		.selectFontType(strFontName)
		.selectFontSize(strFontSize)
		.selectAccessTypeAsPrivate()
		.clickSaveAfterEdit()
		.verifyEditedGroupName(strGroupName);
		;		
	}
}
