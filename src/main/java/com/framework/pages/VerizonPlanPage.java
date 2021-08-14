package com.framework.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class VerizonPlanPage extends SeleniumBase {

	public VerizonPlanPage selectPlan(String planName) throws InterruptedException {
		Thread.sleep(10000);
		String xpathValue = "(//div[contains(@id,'planview')]//div[contains(@class,'PlanTiles__PlanColumn')]/div/div[3]/h2)";
		int totalPlan = locateElements(Locators.XPATH, xpathValue).size();

		if (planName.equalsIgnoreCase("Start Unlimited")) {
			scrollToViewElement(xpathValue + "[1]");
			//click(Locators.XPATH, xpathValue + "[1]");
			clickUsingJs(locateElement(Locators.XPATH,
					"(//div[contains(@id,'planview')]//div[contains(@class,'PlanTiles__PlanColumn')]/div/div[3]/h2)[1]/../../div[5]//span[2]"));
		} else if (planName.equalsIgnoreCase("Play More Unlimited")) {
			scrollToViewElement(xpathValue + "[2]");
			//click(Locators.XPATH, xpathValue + "[1]");
			clickUsingJs(locateElement(Locators.XPATH,
					"(//div[contains(@id,'planview')]//div[contains(@class,'PlanTiles__PlanColumn')]/div/div[3]/h2)[2]/../../div[5]//span[2]"));
		} else if (planName.equalsIgnoreCase("Do More Unlimited")) {
			scrollToViewElement(xpathValue + "[3]");
			//click(Locators.XPATH, xpathValue + "[1]");
			clickUsingJs(locateElement(Locators.XPATH,
					"(//div[contains(@id,'planview')]//div[contains(@class,'PlanTiles__PlanColumn')]/div/div[3]/h2)[3]/../../div[5]//span[2]"));
		} else if (planName.equalsIgnoreCase("Get More Unlimited")) {
			scrollToViewElement(xpathValue + "[4]");
			//click(Locators.XPATH, xpathValue + "[1]");
			clickUsingJs(locateElement(Locators.XPATH,
					"(//div[contains(@id,'planview')]//div[contains(@class,'PlanTiles__PlanColumn')]/div/div[3]/h2)[4]/../../div[5]//span[2]"));
		} else {
			scrollToViewElement(xpathValue + "[5]");
			//click(Locators.XPATH, xpathValue + "[1]");
			clickUsingJs(locateElement(Locators.XPATH,
					"(//div[contains(@id,'planview')]//div[contains(@class,'PlanTiles__PlanColumn')]/div/div[3]/h2)[5]/../../div[5]//span[2]"));
		}
		return this;
	}

	
	public VerizonSecureCheckOut addALine(String text) {
		if (text.equalsIgnoreCase("No")) {
			scrollToViewElement("//p[text()='Begin secure checkout']");
			clickUsingJs(locateElement(Locators.XPATH,
					"//p[text()='Begin secure checkout']"));			
		} 	
		return new VerizonSecureCheckOut();
	}

}
