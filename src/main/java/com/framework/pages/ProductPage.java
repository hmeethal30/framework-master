package com.framework.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class ProductPage extends SeleniumBase {

	private String captureProductName;

	public ProductPage clickAndSelectListView() {
		click(Locators.XPATH, "(//*[@data-key='down'])[4]");
		click(Locators.XPATH, "//span[text()='All Products']");
		return this;
	}

	public ProductPage clickNew() {
		click(Locators.XPATH, "//div[text()='New']");
		return this;
	}

	public ProductPage typeProductName(String productName) {
		captureProductName = productName;
		clearAndType(locateElement(Locators.XPATH, "(//input[@class=' input'])[1]"), productName);
		return this;
	}

	public ProductPage typeProductCode(String productCode) {
		clearAndType(locateElement(Locators.XPATH, "(//input[@class=' input'])[2]"), productCode);
		return this;
	}

	public ProductPage typeProductDescription(String productDesc) {
		clearAndType(locateElement(Locators.XPATH, "//textarea[@role='textbox']"), productDesc);
		return this;
	}

	public ProductPage clickSave() {
		click(Locators.XPATH, "(//span[text()='Save'])[2]");
		return this;
	}

	public ProductPage getProductName() {
		String text = getElementText(locateElement(Locators.XPATH,"(//div[contains(@class,'page-header')])[7]"));
		if (text.equalsIgnoreCase(captureProductName)) {
			System.out.println(captureProductName + " is created");
		} else {
			System.err.println(captureProductName + " is not created");
		}
		return this;
	}
	
	public ProductPage enterProductAndSearch(String value) {
		typeAndEnter(locateElement(Locators.XPATH, "(//input[@type='search'])[2]"), value);
		return this;
	}
	
	public ProductPage selectEdit() {
		click(Locators.XPATH, "//table[contains(@class,'uiVirtualDataTable')]/tbody/tr[1]/td[6]//a");
		click(Locators.XPATH, "((//ul[@class='scrollable'])[3]/li)[1]/a");
		return this;
	}
	
	public ProductPage updateProductName(String data) {
		captureProductName = data;
		typeAndEnter(locateElement(Locators.XPATH, "(//input[@class=' input'])[1]"), data);
		click(Locators.XPATH, "(//span[text()='Save'])[2]");
		return this;
	}
	
	public ProductPage confirmEditProduct() {
		String text = getElementText(locateElement(Locators.XPATH,"//span[contains(@class,'toastMessage')]"));
		if (text.equalsIgnoreCase(captureProductName)) {
			System.out.println(captureProductName + " is created");
		} else {
			System.err.println(captureProductName + " is not created");
		}
		return this;
	}
	
}
