package com.framework.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;


public class NewOpportunityPage extends SeleniumBase{
	
	
	public NewOpportunityPage clickNewOpportunity() throws InterruptedException, IOException {
		WebElement webEle = locateElement(Locators.XPATH, "//a[@class='forceActionLink']/div[text()='New']");
		click(webEle);
		Thread.sleep(2000);
		return this;
	}


	public NewOpportunityPage clickOpportName(String oppName) throws IOException {
		
		WebElement webEle = locateElement(Locators.XPATH, "//label[text()='Opportunity Name']/following::input[1]");
		type(webEle, oppName);
		return this;		
	}	
	 	
	public NewOpportunityPage clickOpportType() throws IOException {
		
		WebElement webEle = locateElement(Locators.XPATH, "//label[text()='Type']/following::input");	
		click(webEle);
		
		WebElement webEle1 = locateElement(Locators.XPATH, "//span[text()='New Customer']");
		click(webEle1);
		 return this;
		  
	}
	
	public NewOpportunityPage clickOpportLeadSource() throws IOException {
		 
		WebElement webEle = locateElement(Locators.XPATH, "//label[text()='Lead Source']/following::input");	
		clickUsingJs(webEle);
		WebElement webEle1 = locateElement(Locators.XPATH, "//span[text()='Partner Referral']");	
		click(webEle1);
		return this;
		
	}
	
	public NewOpportunityPage clickOpportAmount(String amount) throws IOException {
		
		WebElement webEle = locateElement(Locators.XPATH, "//label[text()='Amount']/following::input");	
		clickUsingJs(webEle);
		WebElement webEle1 = locateElement(Locators.XPATH, "//label[text()='Amount']/following::input");	
		type(webEle1, String.valueOf(amount));
		return this;
	}
	public NewOpportunityPage clickOpportCloseDate() throws IOException {
		
		WebElement webEle = locateElement(Locators.XPATH, "//label[text()='Close Date']/following::input");	
		click(webEle);
		WebElement webEle1 = locateElement(Locators.XPATH, "//button[@title='Next Month']//lightning-primitive-icon[1]");	
		click(webEle1);
		WebElement webEle2 = locateElement(Locators.XPATH, "//span[text()='20']");	
		click(webEle2);
		  return this;
		
	}
	public NewOpportunityPage clickOpportStage() throws IOException {
		
		WebElement webEle = locateElement(Locators.XPATH, "//label[text()='Stage']/following::input");	
		click(webEle);
		WebElement webEle1 = locateElement(Locators.XPATH, "//span[@title='Needs Analysis']");	
		click(webEle1);
		  return this;
	}
	public NewOpportunityPage clickOpportPrimaryCampaign() throws IOException { 
		
		WebElement webEle = locateElement(Locators.XPATH, "//label[text()='Primary Campaign Source']/following::input");	
	    clickUsingJs(webEle);
		WebElement webEle1 = locateElement(Locators.XPATH, "//ul[@aria-label='Recent Campaigns']/li[1]");	
		click(webEle1); 
	   return this;
			  }
	
	public NewOpportunityPage clickOpportSave() throws IOException {
		
		WebElement webEle = locateElement(Locators.XPATH, "//button[text()='Save']");	
	    clickUsingJs(webEle);
		 return this;
	}
	
	public NewOpportunityPage verifyOpportCreated(String oppName, String amount) throws IOException {
		
		WebElement webEle = locateElement(Locators.XPATH, "//div[@data-key='success']/div/div/span[text()=' was created.']");
		verifyDisplayed(webEle);
		System.out.println("Verified that the Opportunity "+oppName+" is created with the Amount " +amount );

		  return this;
	}
		 
	}
