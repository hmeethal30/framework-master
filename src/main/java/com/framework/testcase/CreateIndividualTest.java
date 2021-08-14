package com.framework.testcase;


import com.framework.selenium.api.base.SeleniumBase;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import com.framework.pages.*;
import com.framework.testng.api.base.*;


public class CreateIndividualTest extends ProjectSpecificMethods{

	@BeforeTest
	public void setTest() {
		testcaseName = "Create Individuals" ;
		testDescription = "This testcase creates an Individual";
		category = "Regression";
		authors = "Selva";
		excelFileName = "";
	}


	@Test
	public void createIndividual(){

		new LoginPage()
				.typeUserName()
				.typePassword()
				.clickLogin()
				.clickApplauncher()
				.clickViewAll()
				.click_Individuals()
				.click_New()
				.enter_LastName("Kumar")
				.click_Save()
				.verifyIndividualName();

	}

}
