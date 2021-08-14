package com.framework.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class EditIndividualPage extends SeleniumBase {
	
	
	/*
	 * @author Selva
	 * This method selects the salutation in the New Individual modal
	 */
	public EditIndividualPage selectSalutation() {
		click(Locators.XPATH,"//span[contains(text(),'Salutation')]/parent::span/parent::div/div");
		click(Locators.XPATH,"//a[contains(text(),'Mr.')]");		
		return this;
	}
	
	/*
	 * @author Selva
	 * This method enters the first name in the New Individual modal
	 */
	public EditIndividualPage enter_FirstName(String fname) {
		clearAndType(locateElement("//input[@placeholder='First Name']"), fname);
		return this;
	}
	
	/*
	 * @author Selva
	 * This method verifies the firstname created in the New Individual modal
	 */
	
	public  EditIndividualPage verifyFirstlName() {
		
		
		List<WebElement> al = new ArrayList(getDriver().findElements(By.xpath("//div[@class='scroller actionBarPlugin']//table/tbody/tr/th")));
		
		for(WebElement names : al)
		{
			String nameList = names.getText();
			
			if(nameList.contains("Selva"))
			{
				System.out.println("First name is added as Selva");
			}
		}	
		
		return this;
		
		//System.out.println(fname_Created);
	}
	
	public IndividualsPage click_Save() {

		click(Locators.XPATH, "//button[@title='Save']");
		return new IndividualsPage();

	}
	

}
