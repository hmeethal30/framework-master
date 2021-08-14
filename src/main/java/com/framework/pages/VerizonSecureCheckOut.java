package com.framework.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class VerizonSecureCheckOut extends SeleniumBase {

	public VerizonSecureCheckOut contactInfo() throws InterruptedException {
		
		type(locateElement(Locators.XPATH, "//input[@name='firstname']"), "test");
		type(locateElement(Locators.XPATH, "//input[@name='lastname']"), "test");
		type(locateElement(Locators.XPATH, "//input[@name='email']"), "navi.arasu@gmail.com");
		type(locateElement(Locators.XPATH, "//input[@name='contactNumber']"), "9325462148");

		clickUsingJs(locateElement(Locators.XPATH,
				"//input[@name='receiveSpecialOfferUpdates']"));
		clickUsingJs(locateElement(Locators.XPATH,
				"//button/span[text()='Next']"));
		
		
		return this;
	}
	
	
	public VerizonSecureCheckOut eligibilityReview() throws InterruptedException {
		
		type(locateElement(Locators.XPATH, "//input[@id='creditCheck_addressLine1']"), "1 Verizon Way");
		type(locateElement(Locators.XPATH, "//input[@name='dob']"), "01081991");
		type(locateElement(Locators.XPATH, "//input[@name='ssn']"), "276456935");
		type(locateElement(Locators.XPATH, "//input[@name='confirmSsn']"), "276456935");
		clickUsingJs(locateElement(Locators.XPATH,"//span[text()='Accept and continue']"));
		
		clickUsingJs(locateElement(Locators.XPATH,"//span[text()='Continue']"));
		return this;
	}


	
}
