package com.framework.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class NewPartyConsentPage extends SeleniumBase {

	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

	public NewPartyConsentPage enterName(String name) {

		WebElement webEle = locateElement(Locators.XPATH, "((//span[text()='Name'])[2])/../following-sibling::input");
		type(webEle, name);
		return this;
	}

	public NewPartyConsentPage selectPartyfield() {

		WebElement webEle = locateElement(Locators.XPATH, "//input[@title='Search Individuals']");
		click(webEle);
		WebElement eleParty = locateElement(Locators.XPATH,
				"(//li[@class='lookup__item  default uiAutocompleteOption forceSearchInputLookupDesktopOption'])[3]");
		clickUsingJs(eleParty);
		return this;
	}

	public NewPartyConsentPage selectEffectiveFrom() {

		Calendar calendarFrom = Calendar.getInstance();
		Date today = calendarFrom.getTime();
		String todayAsString = dateFormat.format(today);
		System.out.println(todayAsString);
		WebElement webEle = locateElement(Locators.XPATH,
				"(//span[text()='Effective From'])[2]/../following-sibling::div/input");
		clickUsingJs(webEle);
		WebElement webDate = locateElement(Locators.XPATH,
				"(//span[text()='Effective From'])[2]/../following-sibling::div/input");
		type(webDate, todayAsString);
		return this;
	}

	public NewPartyConsentPage selectEffectiveTo() {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		Date tomorrow = calendar.getTime();
		String tomorrowAsString = dateFormat.format(tomorrow);
		System.out.println(tomorrowAsString);
		WebElement webEle = locateElement(Locators.XPATH,
				"(//span[text()='Effective To'])[2]/../following-sibling::div/input");
		clickUsingJs(webEle);
		WebElement webDate = locateElement(Locators.XPATH,
				"(//span[text()='Effective To'])[2]/../following-sibling::div/input");
		type(webDate, tomorrowAsString);
		return this;
	}

	public ToastMessagesValidation clickSave() {
		WebElement webEle = locateElement(Locators.XPATH, "(//span[text()='Save'])[2]/..");
		click(webEle);
		return new ToastMessagesValidation();
	}

	public PartyConsentPage clickSaveWithoutCompletion() {
		WebElement webEle = locateElement(Locators.XPATH, "(//span[text()='Save'])[2]/..");
		click(webEle);
		return new PartyConsentPage();
	}
}
