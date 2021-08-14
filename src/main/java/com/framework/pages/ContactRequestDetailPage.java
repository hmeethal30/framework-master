<<<<<<< HEAD
package com.framework.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class ContactRequestDetailPage extends SeleniumBase{

	public ContactRequestPopUpPage ClickCloneBtn() {
		click(locateElement(Locators.XPATH,"//div[@title='Clone']"));
		return new ContactRequestPopUpPage();
	}
	public ContactRequestDetailPage getContactReqNumber(){
		String strContReq = getAttribute(locateElement(Locators.XPATH,"//div[text()='Contact Request']/following-sibling::div"), "title");
		reportStep("Newly Created contact request# "+strContReq, "Pass", true);
		return this;
	}
	public ContactRequestDetailPage verifySuccess(){
		if(verifyDisplayed(locateElement(Locators.XPATH,"//div[@data-key='success']/div//span"))) {
			System.out.println("Success Tostr displayed");
			reportStep("Success Tostr Displayed", "Pass", true);
		}else reportStep("Success Tostr not Displayed", "Fail", true);
		return this;
	}	

}
=======
package com.framework.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class ContactRequestDetailPage extends SeleniumBase{

	public ContactRequestPopUpPage ClickCloneBtn() {
		click(locateElement(Locators.XPATH,"//div[@title='Clone']"));
		return new ContactRequestPopUpPage();
	}
	public ContactRequestDetailPage getContactReqNumber(){
		String strContReq = getAttribute(locateElement(Locators.XPATH,"//div[text()='Contact Request']/following-sibling::div"), "title");
		reportStep("Newly Created contact request# "+strContReq, "Pass", true);
		return this;
	}
	public ContactRequestDetailPage verifySuccess(){
		if(verifyDisplayed(locateElement(Locators.XPATH,"//div[@data-key='success']/div//span"))) {
			System.out.println("Success Tostr displayed");
			reportStep("Success Tostr Displayed", "Pass", true);
		}else reportStep("Success Tostr not Displayed", "Fail", true);
		return this;
	}	

}
>>>>>>> 9529103d6d51341f8de5c8d21d5a06d95ff8f512
