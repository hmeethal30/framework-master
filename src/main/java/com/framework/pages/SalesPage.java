package com.framework.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class SalesPage extends SeleniumBase {

	public SalesPage clickApplauncher() {
		click(Locators.XPATH, "//div[@role='navigation']//button[1]");
		return this;
	}

	/**
	 * @author Haseena
	 *	This method will click on Groups tab from SalesPage
	 * @return Groups page
	 */
	public GroupsPage clickGroupsTab() {
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Groups']/parent::a"));
		return new GroupsPage();
	}
	
	public CasesPage clickCases() {
		executeTheScript("arguments[0].click();", locateElement(Locators.XPATH, "//a[@title='Cases']"));
		return new CasesPage();
	}
	
	public LeadsPage clickLeads() throws InterruptedException {
		//click(Locators.XPATH,"//span[text()='Leads']");
		clickUsingJs(locateElement(Locators.XPATH,"//span[text()='Leads']"));
		Thread.sleep(5000);
		System.out.println("clicked leads");
		return new LeadsPage();
	}
	
}
