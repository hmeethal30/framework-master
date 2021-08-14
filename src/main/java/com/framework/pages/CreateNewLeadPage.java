package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;



public class CreateNewLeadPage extends SeleniumBase{

    public CreateNewLeadPage selectSalutation() {
        click(Locators.XPATH, "//input[@name='salutation']");
        return this;
    }
    public CreateNewLeadPage enterMr() {
        click(Locators.XPATH, "//span[@title='Mr.']");
        return this;
    }
    public CreateNewLeadPage enterLastname() {
        clearAndType(locateElement(Locators.XPATH, "//input[@name='lastName']"),"Kumar");
        return this;
    }
    public CreateNewLeadPage enterCompany() {
        clearAndType(locateElement(Locators.XPATH, "//input[@name='Company']"),"TestLeaf");
        return this;
    }

    public CreateNewLeadPage enterFirstName() {
        clearAndType(locateElement(Locators.XPATH, "//input[@name='firstName']"),"Ganesh");
        return this;
    }


    public LeadsPage verifyCreateLeadSuccess() {
        //Click Save
        click(Locators.XPATH, "\"//button[text()='Save']");
        // Verify success message
//				WebElement successMessage = driver.findElement(By.xpath("(//div[@data-aura-class='forceToastMessage']//span)[2]"));
//				String sm1 = successMessage.getAttribute("textContent");
        String sm1 = getAttribute(locateElement(Locators.XPATH, "//div[@class='genericNotification']//strong"), "textContent");
//		String sm1 = getAttribute(locateElement(Locators.XPATH, "//div[@class='genericNotification']//strong"), sm1);
        System.out.println(sm1);
        return new LeadsPage();
    }


    public CreateNewLeadPage verifyAlertMessage() {
        // Verify alert message
        click(Locators.XPATH, "//button[text()='Save']");
        //WebElement alertMessage = driver.findElement(By.xpath("//div[@class='genericNotification']//strong"));
        //String alert1 = alertMessage.getAttribute("textContent");
        //System.out.println(alert1);
        String alert1 = getElementText(locateElement(Locators.XPATH, "//div[@class='genericNotification']//strong"));
//					WebElement alertField = driver.findElement(By.xpath("//div[@class='genericNotification']/following-sibling::ul//a"));
//					String alert2 = alertField.getAttribute("textContent");
        String alert2 = getElementText(locateElement(Locators.XPATH, "//div[@class='genericNotification']/following-sibling::ul//a"));
        System.out.println(alert1 + ":" + alert2);
        return this;
    }


}
