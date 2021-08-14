package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditIndividualsTest extends ProjectSpecificMethods {
	
	@BeforeTest	
	  public void setTest() { 
		testcaseName = "Edit Individuals" ; 
		testDescription = "This testcase edits an Individual";
		category = "Regression";
		authors = "Selva";
		excelFileName = "";	  
	  }
	 
	
	@Test
	public void editIndividual(){
		
		new LoginPage()		
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.click_Individuals()
		.verifyIndividualTab()
		.searchIndividual()
		.clickEdit()
		.selectSalutation()
		.enter_FirstName("Selva")
		.click_Save();
	}
}

