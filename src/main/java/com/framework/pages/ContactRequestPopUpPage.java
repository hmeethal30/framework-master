package com.framework.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class ContactRequestPopUpPage extends SeleniumBase{
	
	//////////ContactRequest Pop up Page for New Contact, Edit Contact//////////////////
	/////////Author: Swami ////////////////////////////////////////////////////////////
	/////////Date: july 22, 2021 /////////////////////////////////////////////////////
	
	public ContactRequestPopUpPage clickSearchContacts() {
		//clickUsingJs(locateElement("//input[@title='Search Contacts']"));
		clickUsingJs(locateElement(Locators.XPATH, "//input[@title='Search Contacts']"));
		return this;
	}

	public ContactRequestPopUpPage clickNewContIcon() {
		click(locateElement(Locators.XPATH,"//span[@title='New Contact']"));
		return this;
	}
		
	public ContactRequestPopUpPage clickSalutation(){
		click(Locators.XPATH, "//span[text()='Salutation']/parent::span/following-sibling::div//a");
		return this;
	}
	 public ContactRequestPopUpPage clickMr() throws IOException {
		 clickUsingJs(locateElement(Locators.XPATH,"//a[@title='Mr.']"));
		 return this;
	 }
	public ContactRequestPopUpPage TypeFirstName(String strFN){
		type(locateElement(Locators.XPATH,"//input[contains(@class,'firstName')]"), strFN);
		return this;
	}
	
	public ContactRequestPopUpPage TypeLastName(String strLN){
		type(locateElement(Locators.XPATH,"//input[contains(@class,'lastName')]"), strLN);
		return this;
	} 
	
	public ContactRequestPopUpPage clickSave(){
		click(locateElement(Locators.XPATH,"//div[contains(@class,'modal-footer')]//span[text()='Save']"));
		return this;
	}
	
	public ContactReqDashboardPage clickMainSave(){
		click(locateElement(Locators.XPATH,"//div[@class='inlineFooter']//span[text()='Save']"));
		return new ContactReqDashboardPage();
	}
	public ContactRequestDetailPage clickMainSaveNewReq(){
		//if(verifyDisappeared(locateElement(Locators.XPATH,"//div[@data-key='success']/div//span"))) {
			click(locateElement(Locators.XPATH,"//div[@class='inlineFooter']//span[text()='Save']"));
		//}
		return new ContactRequestDetailPage();
	}
	public ContactRequestPopUpPage TypeReqDescription(String strDesc){
		type(locateElement(Locators.XPATH,"//span[text()='Request Description']/parent::label/following-sibling::textarea"), strDesc);
		return this;
	}
	public ContactRequestPopUpPage TypePreferredPhone(String strPrefPhone){
		type(locateElement(Locators.XPATH,"//span[text()='Preferred Phone Number']/parent::label/following-sibling::input"), strPrefPhone);
		return this;
	}
	public ContactRequestPopUpPage clickReqReasonDropDown() {
		clickUsingJs(locateElement(Locators.XPATH,"//*[text()='Request Reason']/parent::span/following-sibling::*//a"));
		return this;
	}
	public ContactRequestPopUpPage clickReqReasonValue(String strReqReasonVal) {
		clickUsingJs(locateElement(Locators.XPATH,"//a[@title='"+strReqReasonVal+"']"));
		return this;
	}
	public ContactRequestPopUpPage clickReqStatusDropDown() throws InterruptedException, IOException {
		Thread.sleep(6000);
		clickUsingJs(locateElement(Locators.XPATH,"//span[text()='Request Status']/parent::span/following-sibling::div//a"));
		return this;
	}
	public ContactRequestPopUpPage clickReqStatusAttempted() throws IOException {
		clickUsingJs(locateElement(Locators.XPATH,"//a[@title='Attempted']"));
		return this;
	}
	public ContactRequestPopUpPage getLastModUser(){
		System.out.println(getElementText(locateElement(Locators.XPATH,"//*[text()='Last Modified By']/parent::div/following-sibling::div//span[contains(@class,'OutputText')]")));
		return this;
	}
	public ContactRequestPopUpPage getLastModDateTime() {
		System.out.println(getElementText(locateElement(Locators.XPATH,"//*[text()='Last Modified By']/parent::div/following-sibling::div//span[contains(@class,'OutputDateTime')]")));
		return this;
	}
		
}
