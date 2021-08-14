package com.framework.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class LocationsPage extends SeleniumBase {
	String locationName;
	
	public LocationsPage clickNew() {
		click(locateElement(Locators.XPATH, "//div[@title='New']"));
		return this;
	}
	
	public LocationsPage typeLocationName(String locationName) {
		type(locateElement(Locators.XPATH, "//span[text()='Location Name']/parent::label/following-sibling::input"), locationName);
		return this;
	}
	
	public LocationsPage selectAccountType(String locationName) {
		this.locationName = locationName;
		click(locateElement(Locators.XPATH, "//span[text()='Location Type']/parent::span/following-sibling::div//a"));
		click(locateElement(Locators.XPATH, "//a[text()='" + locationName+ "']"));		
		return this;
	}
	
	public LocationsPage typeExternalReferencee(String externalReference) {
		type(locateElement(Locators.XPATH, "//span[text()='External Reference']/parent::label/following-sibling::input"), externalReference);
		return this;
	}
	
	public LocationsPage clickCancel() {
		click(locateElement(Locators.XPATH, "//button[@title='Cancel']"));
		return this;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public LocationsPage verifyLocationIsCancelled() {
		List<WebElement> locateElements = locateElements(Locators.XPATH, "//tr/th//a[@data-refid='recordId']");
		Assert.assertTrue(!(locateElements.contains(locationName)));
		return this;
	}
	
	/*
	 * Author: Swami 
	 * This Method is for Clicking down icon for location id
	 */
	public LocationsPage clickDownIcon(String strReq) throws IOException {
	  	click(Locators.XPATH, "//a[@title='"+strReq+"']/ancestor::th/following-sibling::td//a");
		return this;
  }
	/*
	 * Author: Swami 
	 * This Method is to Click Edit link 
	 */
 public LocationsPage clickEdit() throws IOException {
		click(Locators.XPATH, "//li/a[@title='Edit']");
		return this;
	}
 	/* Author: Swami 
	 * This Method is to verify the location typen in Locations list	 
	 */
 public LocationsPage verifyLocationType(String strLName, String strLType) throws InterruptedException, IOException {
	Thread.sleep(2000); 
	if(getElementText(locateElement(Locators.XPATH,"//a[@title='"+strLName+"']/ancestor::th/following-sibling::td//span/span")).equalsIgnoreCase(strLType)){
		reportStep("For Location "+strLName+" Type "+strLType+" updated", "Pass");
	}else reportStep("Locations update failed", "Fail");
	return this;
 }
	/* Author: Swami 
	 * This Method is to click on Save button.	 
	 */
	public LocationsPage clickMainSave() throws IOException, InterruptedException{
		Thread.sleep(6000);
		click(locateElement(Locators.XPATH, "//div[@class='inlineFooter']//span[text()='Save']"));
		return this;
	}
 	/* Author: Swami 
	 * This Method is to get Last Modified User details	 
	 */
	public LocationsPage getLastModUser() {
		reportStep(getElementText(locateElement(Locators.XPATH, "//*[text()='Last Modified By']/parent::div/following-sibling::div//span[contains(@class,'OutputText')]")),"Pass");
		return this;
	}
 	/*Author: Swami 
	 * This Method is to get Last Modified Date and Time details		 
	 */
	public LocationsPage getLastModDateTime() {
		reportStep(getElementText(locateElement(Locators.XPATH, "//*[text()='Last Modified By']/parent::div/following-sibling::div//span[contains(@class,'OutputText')]/following-sibling::span")),"Pass");
		return this;
	}
 	/* Author: Swami 
	 * This Method is to verify whether new location created
	 */
	public LocationsPage verifyNewLocation(String strLName) throws IOException {
		if(verifyDisplayed(locateElement(Locators.XPATH, "//div[@title='"+strLName+"']"))) {
			reportStep(strLName+" Location is created ", "Pass");
		}else reportStep(strLName+" Location is not created ", "Fail");
		
		return this;
	}
	
	
	
}
