package com.framework.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class VerizonContractPage extends SeleniumBase {

	public VerizonContractPage clickContract(String text)
	{
		List<WebElement> sel = locateElements(Locators.XPATH, "(//ul[@role='tablist'])[1]/li[1]");
		for(int i=0;i<sel.size();i++) {
			
			if(sel.get(i).getText().contains(text)) 
			{
				
				break;
				}		}	
		return this;
	}
	
	public VerizonContractPage btnContinue()
	{	
		click(Locators.XPATH, "//div[text()='Continue']");		
		return this;
	}
	
	public VerizonContractPage validateZipCode(String text)
	{	
		scrollToViewElement("//input[@name='pdp_zipcode']");
		type(locateElement(Locators.XPATH, "//input[@name='pdp_zipcode']"), text);
		click(Locators.XPATH, "//span[text()='Confirm Location']");		
		return this;
	}
	
	public VerizonCustomizeDevicePage customerType(String text) throws InterruptedException
	{	
		Thread.sleep(3000);
		click(Locators.XPATH, "//span[text()='"+text+"']");	
		return new VerizonCustomizeDevicePage();
	}
	
	
	
	
			
}
