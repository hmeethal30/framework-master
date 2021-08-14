package com.framework.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;



public class CreatePaymentPage extends SeleniumBase{	

	
	public CreatePaymentPage clickNewButton() throws InterruptedException{
		
		verifyDisplayed(locateElement(Locators.XPATH, "//div[text()='New']//parent::a"));
		click(Locators.XPATH, "//div[text()='New']//parent::a");
		return this;
	}

	public CreatePaymentPage clickAccount(){
		click(Locators.XPATH, "//span[text()='Information']//following::span[text()='Account']//following::input");
		return this;
	}	
	
	
	public CreatePaymentPage selectAccount(){	
		click(Locators.XPATH, "//div[text()='Credits']");
		return this;
	}
	
	public CreatePaymentPage enterAmount(){
		type(locateElement(Locators.XPATH, "(//span[text()='Amount'])[2]//following::input"), "5000");
		return this;
	}

	

	public CreatePaymentPage selectStatus() throws InterruptedException{
		click(Locators.XPATH, "//span[text()='Status']//following::a[@class='select']");
		return this;
	}
	 

	public CreatePaymentPage clickStatus() throws InterruptedException{
		click(Locators.XPATH, "//a[text()='Draft']");
		click(Locators.XPATH, "(//span[text()='Type'])[2]//following::a[@class='select']");
		return this;
		}

	public CreatePaymentPage clickType(){
		click(Locators.XPATH, "//a[text()='Sale']");
		return this;
	}

    public CreatePaymentPage clickProcessingMode() throws InterruptedException{
    	
    	click(Locators.XPATH, "(//span[text()='Processing Mode']//following::a[@class='select'])");
		return this;
		}

    public CreatePaymentPage clickMode(){
    	click(Locators.XPATH, "//a[text()='External']");
		return this;
    }
    
    public CreatePaymentPage clickSaveButton(){
    	click(Locators.XPATH, "//span[text()='Information']//following::span[text()='Save']");	
    	return this;
    }

}
