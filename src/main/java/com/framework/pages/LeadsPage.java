package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;



public class LeadsPage extends SeleniumBase {
	
	//Click New button
		public CreateNewLeadPage createLead() throws InterruptedException {	
			clickUsingJs(locateElement(Locators.XPATH,"//div[@title='New']"));
			Thread.sleep(5000);
			System.out.println("clicked New button");
			return new CreateNewLeadPage();
		}
		


}
