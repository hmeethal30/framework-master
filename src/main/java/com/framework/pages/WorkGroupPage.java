package com.framework.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class WorkGroupPage extends SeleniumBase {

	// Click on New button(Work Type Group)

	public WorkGroupPage clickNewWorkGroup() {
		WebElement webEle = locateElement(Locators.XPATH, "//a[@title='New']");
		click(webEle);
		return this;

	}

	// Enter Work Type Group Name as 'Salesforce Automation by Your Name'
	public WorkGroupPage enterWorkTypeGroupName(String name) {

		WebElement webEle = locateElement(Locators.XPATH,
				"//label[contains(@class,'label inputLabel')]/following-sibling::input");
		type(webEle, name);
		return this;

	}

	// Click save and verify Work Type Group Name
	public WorkGroupPage clickSaveWorkType() {

		WebElement webEle = locateElement(Locators.XPATH, "//button[@title='Save']");
		click(webEle);
		return this;

	}

	public WorkGroupPage searchWorkTypeGroup(String name) {
		WebElement webEle = locateElement(Locators.XPATH, "//input[@name='WorkTypeGroup-search-input']");
		type(webEle, name);
		return this;
	}

	public WorkGroupPage clickDropdownandEdit() throws InterruptedException {
		Thread.sleep(2000);
		WebElement webEle = locateElement(Locators.XPATH, "//tbody/tr[1]/td[5]//a");
		clickUsingJs(webEle);
		WebElement webEle1 = locateElement(Locators.XPATH, "//a[@title='Edit']");
		clickUsingJs(webEle1);
		WebElement webEle2 = locateElement(Locators.CLASS_NAME, "select");
		clickUsingJs(webEle2);
		return this;
	}

	public WorkGroupPage selectGroupType() {
		WebElement webEle = locateElement(Locators.XPATH, "//a[@title='Capacity']");
		click(webEle);
		return this;

	}

}
