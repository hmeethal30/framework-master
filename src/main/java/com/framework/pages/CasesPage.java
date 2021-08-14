package com.framework.pages;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;


public class CasesPage extends SeleniumBase {
	String refNumber;
	
	public CasesPage clickNewCase() {
		click(locateElement(Locators.XPATH,"//div[text()='New']"));
		return this;
	}
	
	public CasesPage chooseContactName() {
		click(locateElement(Locators.XPATH, "//input[@title='Search Contacts']"));
		click(locateElement(Locators.XPATH, "//li[contains(@class,'default uiAutocompleteOption')]"));
		return this;
	}
	
	public CasesPage selectStatus() {
		click(locateElement(Locators.LINK_TEXT, "New"));
		click(locateElement(Locators.XPATH, "//a[contains(text(),'Escalated')]"));
		return this;
	}
	
	
	public CasesPage entersubject(String subject) {
		click(locateElement(Locators.XPATH,"//span[text()='Subject']/following::input"));
		type(locateElement(Locators.XPATH, "//span[text()='Subject']/following::input"), subject);		
		return this;
	}

	public CasesPage enterDescription(String description) {
		click(locateElement(Locators.XPATH, "//span[text()='Description']/following::textarea"));
		type(locateElement(Locators.XPATH, "//span[text()='Description']/following::textarea"), description);		
		return this;
	}
	
	public ToastMessagesValidation clickSaveToCreateACase() {
		click(locateElement(Locators.XPATH, "//button[contains(@class,'publisherShareButton')]/span[text()='Save']"));
		return new ToastMessagesValidation();
	}
	
	public CasesPage getTicketNumber() {
		waitForApperance(locateElement(Locators.XPATH, "//span[contains(text(),'Updated')]"));
		refNumber = getElementText(locateElement(Locators.XPATH, "//table[@role='grid']//tr[1]//span/a"));
		return this;
	}
	
	public CasesPage clickEdit() {
		click(locateElement(Locators.XPATH, "//*[name()='svg' and @data-key='down']/parent::span"));
		click(locateElement(Locators.XPATH, "//a[@title='Edit']"));
		return this;
	}
	
	public CasesPage selectStatus(String status){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(locateElement(Locators.XPATH,"//label[text()='Status']/following-sibling::div"));
		waitUntilTheElementBecomesClickable(locateElement(Locators.XPATH, "//lightning-base-combobox-item[@data-value='Working']"));
		if (status.contains("None"))
			click(locateElement(Locators.XPATH,"//lightning-base-combobox-item//span[@title='--None--']"));
		else
			click(locateElement(Locators.XPATH,"//lightning-base-combobox-item[@data-value='" + status + "']"));
		return this;
	}
	
	public CasesPage selectPriority(String Priority) {
		click(locateElement(Locators.XPATH,"//span[text()='Priority']/parent::span/following-sibling::div"));
		click(locateElement(Locators.XPATH,"//a[text()='" + Priority + "']"));
		return this;
	}
	
	public CasesPage selectOrigin(String origin) {
		click(locateElement(Locators.XPATH,"//span[text()='Case Origin']/parent::span/following-sibling::div"));
		click(locateElement(Locators.XPATH,"//a[text()='" + origin + "']"));
		return this;
	}

	public CasesPage selectSLAviolation(String violation) {
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH,"//span[text()='SLA Violation']"));
		click(locateElement(Locators.XPATH,"//span[text()='SLA Violation']/parent::span/following-sibling::div"));
		click(locateElement(Locators.XPATH,"//a[text()='" + violation + "']"));
		return this;
	}
	
	public ToastMessagesValidation clickSave() {
		click(locateElement(Locators.XPATH,"//button[contains(@class,'forceActionButton')]/span[text()='Save']"));
		return new ToastMessagesValidation();
	}
	
	public CasesPage selectContact(String contactName) {
		waitForApperance(locateElement(Locators.XPATH,"//input[@title='Search Contacts']"));
		click(locateElement(Locators.XPATH,"//input[contains(@title,'Search Contacts')]"));
		type(locateElement(Locators.XPATH,"//input[contains(@title,'Search Contacts')]"), contactName);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		waitForApperance(locateElement(Locators.XPATH,"//mark[text()='" + contactName.split(" ")[0] + "']"));
		executeTheScript("arguments[0].click();", locateElement(Locators.XPATH,"//mark[text()='" + contactName.split(" ")[0] + "']"));
		return this;
	}
	
	public CasesPage typeSubject(String Subject) {
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH,"//span[text()='Internal Comments']"));
		click(locateElement(Locators.XPATH,"//span[text()='Subject']/parent::label/following-sibling::input"));
		type(locateElement(Locators.XPATH,"//span[text()='Subject']/parent::label/following-sibling::input"), Subject);
		return this;
	}
	
	public CasesPage typeDescription(String Description) {
		click(locateElement(Locators.XPATH,"//span[text()='Description']/parent::label/following-sibling::textarea"));
		type(locateElement(Locators.XPATH,"//span[text()='Description']/parent::label/following-sibling::textarea"), Description);
		return this;
	}
	
	public CasesPage clickSaveForMandatoryCheck() {
		click(locateElement(Locators.XPATH,"//button[contains(@class,'forceActionButton')]/span[text()='Save']"));
		return this;
	}
	
	public CasesPage verifyErrorMessage() {
		waitForApperance(locateElement(Locators.XPATH,"//ul[@class='errorsList']"));
		assertEquals("These required fields must be completed: Case Origin, Status", getElementText(locateElement(Locators.XPATH,"//ul[@class='errorsList']/li")));
		return this;
	}
	
	public CasesPage sortCasesInDateOrder() {
		click(locateElement(Locators.XPATH,"//span[@title='Date/Time Opened']/parent::a"));
		waitForApperance(locateElement(Locators.XPATH,"//span[@title='Date/Time Opened']/parent::a/following-sibling::span[contains(text(),'Sorted')]"));
		if(getElementText(locateElement(Locators.XPATH,"//span[@title='Date/Time Opened']/parent::a/following-sibling::span")).equals("Sorted Ascending")) {
			click(locateElement(Locators.XPATH,"//span[@title='Date/Time Opened']/parent::a"));
		}
		refNumber = getAttribute(locateElement(Locators.XPATH,"//th[@scope='row']//a"), "title");
		return this;
	}
	
	public CasesPage clickDropDown() {
		click(locateElement(Locators.XPATH,"//div[contains(@class,'forceVirtualActionMarker')]/a"));
		return this;
	}
	
	public CasesPage selectDelete() {
		click(locateElement(Locators.XPATH,"//a[@title='Delete']"));
		click(locateElement(Locators.XPATH,"//button[@title='Delete']"));
		return this;
	}
	
	public CasesPage verifyDeleteConfirmation() {
		waitForApperance(locateElement(Locators.XPATH,"//span[contains(@class,'toastMessage')]"));
		assertEquals("Case \""+ refNumber +"\" was deleted. Undo", getElementText(locateElement(Locators.XPATH,"//span[contains(@class,'toastMessage')]")));
		return this;
	}
	
	public CasesPage verifyCasesIsDeleted() {
		click(locateElement(Locators.XPATH,"//button[@title='Select List View']"));
		click(locateElement(Locators.XPATH,"//span[text()='Recently Viewed' and contains(@class,'virtual')]"));
		waitForApperance(locateElement(Locators.XPATH,"//input[contains(@placeholder,'Search this')]"));
		click(locateElement(Locators.XPATH,"//input[contains(@placeholder,'Search this')]"));
		type(locateElement(Locators.XPATH,"//input[contains(@placeholder,'Search this')]"), refNumber);
		click(locateElement(Locators.XPATH,"//span[@title='Date/Time Opened']/parent::a"));
		waitForApperance(locateElement(Locators.XPATH,"//span[text()='No items to display.']"));
		assertTrue(verifyDisplayed(locateElement(Locators.XPATH, "//span[text()='No items to display.']")));
		return this;
	}
}
