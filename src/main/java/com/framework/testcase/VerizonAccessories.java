package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.pages.VerizonHomePage;
import com.framework.pages.VerizonSmartPhonePage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class VerizonAccessories extends ProjectSpecificMethods {
	
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
	public void accessories(String brandName,String contract,String pinCode,
			String customerType,String planType,String addALine
			) throws InterruptedException
	{
		new VerizonHomePage()
		.btnShop()
		.labelAccessories()
		.shopAllAccessories()
		.AccessoriesTypes()
		.AccessoriesSelection()
		.clickContinue()
		.clickCheckOut()
		.guestCheckOut()
		.shippingInformation()
		.shippingMethod(2)
		.billingAddress()
		.paymentInformation()	
		
		
		;
		
		
	}

}
