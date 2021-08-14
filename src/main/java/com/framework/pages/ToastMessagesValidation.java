package com.framework.pages;



import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class ToastMessagesValidation extends SeleniumBase {
	
	public PartyConsentPage verifyToastMessageCreate(String name) {
		
		WebElement toastMessage =locateElement(Locators.XPATH, "//div[@class='toastContent slds-notify__content']//span");
		String toastMsgText = getElementText(toastMessage);
		System.out.println(toastMsgText);
		
		if (toastMsgText.contains(name)) {
			System.out.println("Party consent is created");
		} else {
			System.out.println("Party consent is not created");
		}
		return new PartyConsentPage();
		//Pass driver using constructor
		//return new PartyConsentPage(driver);
	}
	
	public PartyConsentPage verifyToastMessageDelete() throws InterruptedException {
		
		WebElement toastMessage =locateElement(Locators.XPATH, "//span[text()[contains(.,'was deleted')]]");
		String toastMsgText = getElementText(toastMessage);
		System.out.println(toastMsgText);
		
		//Thread.sleep(4000);
		String consentName = "Automation By vallynayki";
		if (toastMsgText.contains(consentName)) {
			System.out.println("Party consent "+ consentName +" is deleted ");
		} else {
			System.out.println("Party consent "+ consentName +" is not deleted ");
		}
		return new PartyConsentPage();
		//Pass driver using constructor
		//return new PartyConsentPage(driver);
	}
	
	
	/**
	 * For validating any generic toast message that appears in the Salesforce application
	 * @author Sunil
	 * @param firstPart - Expected first part of the toast message (comes before the ticket number)
	 * @param lastPart - Expected later/last part of the toast message (comes after the ticket number)
	 */
	public ToastMessagesValidation verifyToastMessage(String firstPart, String lastPart) {
		waitForApperance(locateElement(Locators.XPATH, "//span[contains(@class,'toastMessage')]"));
		String toastMessage = getElementText(locateElement(Locators.XPATH, "//span[contains(@class,'toastMessage')]")); //Assigning the toastMessage to a String so that there wont be an issue even if it vanishes
		assertTrue(toastMessage.contains(firstPart));
		assertTrue(toastMessage.contains(lastPart));
		assertTrue(toastMessage.replace(firstPart, "").replace(lastPart, "").replaceAll("[^a-zA-Z0-9_-]", "")!=""); //Making sure ticket/reference number is not null
		return this;
	}

}
