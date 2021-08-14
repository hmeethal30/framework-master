package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateProduct extends ProjectSpecificMethods {
	
	@BeforeTest
	public void readSheet()
	{
		testcaseName = "Products";
		testDescription = "CreateProduct";
		authors = "Ragunath";
		category = "Regression";
		excelFileName = "TC01_Products";
	}
	

	@Test(dataProvider="fetchData")
	public void ProductCreation(String productName,String productCode,String productDesc)
	{
		new LoginPage()		
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.clickProducts()
		.clickNew()
		.typeProductName(productName)
		.typeProductCode(productCode)
		.typeProductDescription(productDesc)
		
		
		;
		
		
	}

}
