package com.framework.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class VerizonDeviceProtection extends SeleniumBase {
	
	

	public VerizonDeviceProtection declineDeviceProtection()
	{		
		if(verifyExactText(locateElement(Locators.XPATH, "//span[text()='Choose device protection.']"), "Choose device protection."))
		{
			scrollToViewElement("//button/span[text()='Decline device protection']");
			clickUsingJs(locateElement(Locators.XPATH, "//button/span[text()='Decline device protection']"));
		}
		else
		{
			System.err.println("Failed to click button - Decline device protection");
		}
		return this;		
	}
	
	
	public VerizonPlanPage Decline()
	{	
		scrollToViewElement("(//button/span[text()='Decline device protection'])[2]");
		clickUsingJs(locateElement(Locators.XPATH, "(//button/span[text()='Decline device protection'])[2]"));
		return new VerizonPlanPage();		
	}
	
	
}
