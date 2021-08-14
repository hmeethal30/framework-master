package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class createPriceBookTest extends ProjectSpecificMethods{
	
	@BeforeTest	
	  public void setTest() { 
		testcaseName = "Create Price Books" ; 
		testDescription = "This testcase creates a Price Book";
		category = "Regression";
		authors = "Selva";
		excelFileName = "";	  
	  }
	
	@Test
	public void createPriceBook() {
		new LoginPage()
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.click_PriceBooks()
		.clickNewPB()
		.enterBookName()
		.enterBookDesc()
		.checkActive()
		.clickSave()
		.verifyPriceBookCreated();
	}

}
