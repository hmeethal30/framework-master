package com.framework.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.pages.HomePage;
import com.framework.pages.ContractPage;

public class SAL123_DeleteContract extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setTest() {
		testcaseName = "SAL123_Delete contracts";
		authors = "Sharathmathi";
		category = "Regression";
	}
	
	@Test
	public void deleteContracts() throws IOException, InterruptedException {
		
		 new LoginPage().typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.selectContract()
		.typeContractNo()
		.selectRecordDelete()
		.confirmDelete()
		.verifyStatus("Contract \"00000113\" was deleted.");
	}

}
