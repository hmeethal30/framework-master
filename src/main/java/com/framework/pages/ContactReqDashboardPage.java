package com.framework.pages;

import java.io.IOException;

import com.framework.pages.ContactRequestPopUpPage;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class ContactReqDashboardPage extends SeleniumBase{
	
	//To be deleted. This Method will navigate to "NewContactReqPage". 
	public ContactRequestPopUpPage clickNew() {
		click(Locators.XPATH, "//div[@title='New']");
		return new ContactRequestPopUpPage();
	}

	//This Method to verify the Success Tostr 
	public ContactReqDashboardPage VerifySuccessTostr() {
		boolean successTostr = verifyDisplayed(locateElement(Locators.XPATH, "//div[@data-key='success']/div//span"));
		if(successTostr) {
		reportStep("Got Success Tostr", "Pass", true);
		System.out.println("Is Success Tostr Displayed: "+successTostr);
		}else reportStep("No Success Message", "Fail", true);
		return this;
	}
	
	//This method is to click on Down Icon for respective Record
	public ContactReqDashboardPage clickRecordDownIcon(String strRecordId) {
		click(Locators.XPATH,"//a[@title='"+strRecordId+"']/ancestor::th/following-sibling::td//a");
		return this;
	}
	
	//This method is to click on Delete Option from Down icon menu
	public ContactReqDashboardPage clickDelete() {
		click(Locators.XPATH, "//li/a[@title='Delete']");
		return this;
	}
	//This method is to click on Delete Option from Down icon menu
		public ContactRequestPopUpPage clickEdit() {
			click(Locators.XPATH, "//li/a[@title='Edit']");
			return new ContactRequestPopUpPage();
		}
	//This method is to click Delete button from Confirmation page
		public ContactReqDashboardPage ClickDeleteBtn() {
			
			//click(Locators.XPATH, "//span[text()='Delete']");
			clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Delete']"));
			
			return this;
		}
		public ContactReqDashboardPage VerifyDeleteSuccessTostr(String strRecordID) {
			if(verifyPartialText(locateElement(Locators.XPATH,"//div[@data-key='success']/div//span"), strRecordID)) {
					System.out.println("Record deleted successfully");
					reportStep("Request Status Deleted", "Pass", true);
			}else reportStep("Request Status not Deleted", "Fail", true);
			return this;
		}
		
		public ContactReqDashboardPage ClickRecentlyViewed() {
			clickUsingJs(locateElement(Locators.XPATH,"//*[text()='Contact Requests']/following-sibling::span[text()='Recently Viewed']"));
			return this;
		}
		public ContactReqDashboardPage ClickAllContactReqMenu() {
			clickUsingJs(locateElement(Locators.XPATH,"//span[text()='All Contact Requests']"));
			return this;
		}
		public ContactRequestDetailPage ClickContactReqRecord(String strRequestID) throws InterruptedException{
			Thread.sleep(3000);	
			if(verifyDisplayed(locateElement(Locators.XPATH,"//a[@title='"+strRequestID+"']"))) {
					click(locateElement(Locators.XPATH,"//a[@title='"+strRequestID+"']"));
				}else {
					clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Contact Request Number']"));
					Thread.sleep(3000);
					clickUsingJs(locateElement(Locators.XPATH,"//a[@title='"+strRequestID+"']"));
				}
						
			return new ContactRequestDetailPage();
		}
		public ContactReqDashboardPage verifyReqStatus(String strEditReq, String strReqStatusValue) throws IOException {
			if(verifyExactText(locateElement(Locators.XPATH, "//a[@title='"+strEditReq+"']/ancestor::th/following-sibling::td[1]//span/span"), strReqStatusValue)) {
				reportStep("Request Status updated", "Pass", true);
				System.out.println("Request Status is updated, Hence This test cases is pass");
			}else reportStep("Request Status not updated", "Fail", true);
				
			return this;
		}
		
		public void testMethod() {
			System.out.println("Testing...");
		}
}
		

