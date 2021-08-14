package com.framework.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class NewIndividualPage extends SeleniumBase {

	/*
	 * @author Selva This method is to enter the last name in the New Individuals
	 * modal
	 */
	public NewIndividualPage enter_LastName(String lname) {

		type(locateElement(Locators.XPATH, "//input[@placeholder='Last Name']"), lname);

		return this;
	}

	/*
	 * 
	 * This method clicks on the Save button on the New Individuals Modal
	 */
	public IndividualsPage click_Save() {

		click(Locators.XPATH, "//button[@title='Save']");
		return new IndividualsPage();

	}

}
