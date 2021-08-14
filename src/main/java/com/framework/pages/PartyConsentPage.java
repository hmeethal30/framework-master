package com.framework.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class PartyConsentPage extends SeleniumBase {

	public PartyConsentPage clickPartyConsentTab() throws InterruptedException {
		Thread.sleep(2000);
		WebElement webEle = locateElement(Locators.XPATH,
				"//a[contains(@title,'Party Consent')]/following-sibling::one-app-nav-bar-item-dropdown//a[@role='button']");
		clickUsingJs(webEle);
		return this;
	}

	public NewPartyConsentPage clickNewPartyConsent() throws InterruptedException {
		Thread.sleep(5000);
		WebElement webEle = locateElement(Locators.XPATH, "//a[contains(@href,'ObjectName=PartyConsent')]");
		clickUsingJs(webEle);
		return new NewPartyConsentPage();

	}

	public PartyConsentPage searchbyName() throws InterruptedException {
		Thread.sleep(2000);
		String consentName = "Automation By vallynayki";
		WebElement webEle = locateElement(Locators.XPATH, "//input[@name='PartyConsent-search-input']");
		type(webEle, consentName);
		return this;
	}

	public DeletePopUpWindow clickDeleteButton() throws InterruptedException {
		Thread.sleep(2000);
		WebElement divEle = locateElement(Locators.XPATH,
				"//div[@class='uiScroller scroller-wrapper scroll-bidirectional native']");
		String script = "arguments[0].scrollLeft += 500;";
		executeTheScript(script, divEle);

		WebElement butEle = locateElement(Locators.XPATH,
				"(//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button'])[1]");
		clickUsingJs(butEle);
		Thread.sleep(3000);

		WebElement delEle = locateElement(Locators.XPATH, "//a[@title='Delete']");
		clickUsingJs(delEle);
		return new DeletePopUpWindow();

	}

	public PartyConsentPage alertMessageValidation() {
		WebElement alertParty = locateElement(Locators.XPATH, "//ul[@class='errorsList']/li");
		System.out.println(alertParty.getText());

		if (alertParty.getText().contains("These required fields must be completed: Party")) {
			System.out.println("Alert is triggered");
		} else {
			System.out.println("Alert is not triggered");
		}
		return this;
	}

	public PartyConsentPage errorMessageValidation() {
		WebElement errorPartyfield = locateElement(Locators.XPATH,
				"//ul[@class='has-error uiInputDefaultError uiInput forceSearchInputLookupDesktop uiInput--default']/li");
		System.out.println(errorPartyfield.getText());

		return this;
	}

	public PartyConsentPage clickEditButton() throws InterruptedException {

		Thread.sleep(2000);
		WebElement webEle = locateElement(Locators.XPATH,
				"(//span[@class='slds-icon_container slds-icon-utility-down']/..)[1]");
		clickUsingJs(webEle);
		WebElement editEle = locateElement(Locators.XPATH, "//a[@title='Edit']");
		clickUsingJs(editEle);
		return this;
	}

	public PartyConsentPage EditPrivacyConsent() {

		WebElement webEle = locateElement(Locators.XPATH, "  (//a[contains(text(),'Seen')])[1]");
		clickUsingJs(webEle);
		WebElement webEle1 = locateElement(Locators.XPATH, "  //a[@title='Seen']");
		clickUsingJs(webEle1);
		return this;
	}

	public PartyConsentPage EditConsentDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		String todayAsString = dateFormat.format(today);
		System.out.println(todayAsString);
		WebElement webEle = locateElement(Locators.XPATH, "(//label[text()='Date'])[2]/following::input[1]");
		clickUsingJs(webEle);
		WebElement webEle1 = locateElement(Locators.XPATH, "(//label[text()='Date'])[2]/following::input[1]");
		clear(webEle1);
		WebElement webEle2 = locateElement(Locators.XPATH, "(//label[text()='Date'])[2]/following::input[1]");
		type(webEle2, todayAsString);
		return this;
	}

	public PartyConsentPage EditConsentTime() throws InterruptedException {

		WebElement webEle = locateElement(Locators.XPATH, "(//label[text()='Time'])[2]/following::input[1]");
		clickUsingJs(webEle);
		WebElement webEle1 = locateElement(Locators.XPATH, "//li[text()='12:00 PM']");
		clickUsingJs(webEle1);
		Thread.sleep(200);
		return this;
	}

	public PartyConsentPage clickSaveAfterEdit() {
		WebElement webEle = locateElement(Locators.XPATH, "(//span[text()='Save'])[2]/..");
		click(webEle);
		return this;
	}

}
