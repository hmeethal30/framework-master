package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.pages.VerizonSmartPhonePage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class VerizonWireless extends ProjectSpecificMethods {
	
	@BeforeTest
	public void readSheet()
	{
		testcaseName = "Select Apple Product";
		testDescription = "Billing apple product";
		authors = "Ragunath";
		category = "Regression";
		excelFileName = "VerizonWireless";
	}
	

	@Test(dataProvider="fetchData")
	public void appleProducts(String brandName,String contract,String pinCode,
			String customerType,String planType,String addALine
			) throws InterruptedException
	{
		new VerizonSmartPhonePage()
		.clickAddFilter()
		.clickBrandDropdown()
		.selectBrand(brandName)
		.selectPhones()
		.clickContract(contract)
		.btnContinue()
		.validateZipCode(pinCode)
		.customerType(customerType)
		.validateTextPresence()
		//.tradeIn("no")
		//.clickNext()
		.declineDeviceProtection()
		.Decline()
		.selectPlan(planType)
		.addALine(addALine)
		.contactInfo()
		.eligibilityReview()
		
		
		;
		
		
	}

}
