package com.framework.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class VerizonCustomizeDevicePage extends SeleniumBase {
	
	

	public VerizonDeviceProtection validateTextPresence() throws InterruptedException
	{		
		if(verifyExactText(locateElement(Locators.XPATH, "//span[text()='Customize your device.']"), "Customize your device."))
		{
			scrollToViewElement("//button/span[text()='Next']");
			Thread.sleep(3000);
			clickUsingJs(locateElement(Locators.XPATH, "//button/span[text()='Next']"));
			Thread.sleep(3000);
			scrollToViewElement("//button/span[text()='Next']");
			Thread.sleep(3000);
			clickUsingJs(locateElement(Locators.XPATH, "//button/span[text()='Next']"));
		}
		else
		{
			System.err.println("Failed to click an element");
		}
		return new VerizonDeviceProtection();		
	}
	
	
	public VerizonCustomizeDevicePage tradeIn(String text)
	{		
		click(Locators.XPATH, "//input[@value='"+text+"']");
		return this;		
	}
	
	
	public VerizonDeviceProtection clickNext() throws InterruptedException
	{		
			scrollToViewElement("//button/span[text()='Next']");
			Thread.sleep(3000);
			clickUsingJs(locateElement(Locators.XPATH, "//button/span[text()='Next']"));		
		return new VerizonDeviceProtection();		
	}
	
	
}
