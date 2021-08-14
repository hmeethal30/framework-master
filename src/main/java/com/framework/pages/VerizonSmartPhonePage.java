package com.framework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;


public class VerizonSmartPhonePage extends SeleniumBase {

	public VerizonSmartPhonePage clickAddFilter() {
		click(Locators.XPATH, "//span[contains(text(),'Filter')]|//span[contains(text(),'filters')]");
		return this;
	}
	
	public VerizonSmartPhonePage clickBrandDropdown() {
		click(Locators.XPATH, "(//button[contains(@class,'accordionButton')])[1]//span[2]");
		return this;
	}
	
	public VerizonSmartPhonePage selectBrand(String brandName) throws InterruptedException
	{
		List<WebElement> phones = locateElements(Locators.XPATH, "//li[@class='brand filter-list']//label//a");
		int increment=1;
		for(int i=0;i<phones.size();i++)
		{
			if(phones.get(i).getText().equalsIgnoreCase(brandName)){				
				locateElement(Locators.XPATH, "(//li[@class='brand filter-list']//label//a/../../..//span//span)["+increment+"]").click();
				break;				
			}
			increment+=3;
		}
		click(Locators.XPATH, "//span[contains(text(),'View results')]");
		return this;
	}
	
	public VerizonContractPage selectPhones() throws InterruptedException
	{		
		List<WebElement> phoneList = locateElements(Locators.XPATH, "(//div[@class='marginBottom5'])");
		for(int i=1;i<=phoneList.size();i++)
		{
			click(Locators.XPATH, "(//div[@class='marginBottom5'])["+i+"]");
			break;
		}		
		return new VerizonContractPage();
	}
			
}
