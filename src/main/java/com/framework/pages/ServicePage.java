package com.framework.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class ServicePage extends SeleniumBase {

    /** Click on Reports*/
    public ServicePage clickReports() {
        clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Reports']"));
//        click(Locators.XPATH,"//span[text()='Reports']");
        return this;
    }

    /** Click on Reports*/
    public ServicePage clickNewReportClassic() {
        click(Locators.XPATH,"//a[@title='New Report (Salesforce Classic)']");
        return this;
    }

    /** Click on */
    public ServicePage clickOnLeads() {
        int size = locateElements(Locators.TAGNAME,"iframe").size();
        System.out.println("number of frames is " + size);
        switchToFrame(0);
//        click(Locators.XPATH,"//span[text()='Leads']/parent::a");
        clickUsingJs(locateElement(Locators.XPATH, "//div[@id='reportTypeTree']//following::span[text()='Leads']"));
        defaultContent();
        return this;
    }

    public ServicePage savePreviewImage(String path) throws InterruptedException, AWTException {
        switchToFrame(0);
        WebElement elemPreview = locateElement(Locators.XPATH,"//div[@class='previewBlock']");
        rightClickAndSaveImage(elemPreview,path);
        defaultContent();
        return this;
    }

/** Click on */
    public ServicePage clickOnCreate() {
        switchToFrame(0);
//        click(Locators.XPATH,"//input[@id='thePage:rtForm:createButton']");
        clickUsingJs(locateElement(Locators.XPATH, "//input[@id='thePage:rtForm:createButton']"));
        defaultContent();
        return this;
    }

}
