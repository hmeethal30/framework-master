package com.framework.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class IndividualsPage extends SeleniumBase {

	/*
	 * @author Selva
	 * This method is to click on the New button on the Individuals page
	 */
	public NewIndividualPage click_New() {
		click(locateElement(Locators.XPATH, "//div[@title='New']"));

		return new NewIndividualPage();
	}

	/*
	 * @author Selva
	 * This method verifies the name displayed in the Individuals page
	 */
	public IndividualsPage verifyIndividualName() {

		verifyDisplayed(locateElement(Locators.XPATH, "//button[@title='Close']/preceding-sibling::div//span"));
		String name = getElementText(locateElement(Locators.XPATH, "//*[@class='uiOutputText']"));

		return this;
	}

	/*
	 * @author Selva
	 * This method veifies whether the Individuals tab is displayed
	 */
	public IndividualsPage verifyIndividualTab() {
		verifyDisplayed(locateElement(Locators.XPATH, "//li/span[contains(text(),'Individuals')]"));
		return this;
	}

	/*
	 * @author Selva
	 * This method searches for the given name in the Individuals page
	 */
	public IndividualsPage searchIndividual() {
		typeAndEnter(locateElement(Locators.XPATH, "//input[@name='Individual-search-input']"), "Kumar");

		// WebElement select_individual = new
		// WebDriverWait(driver,Duration.ofSeconds(20))
		// .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='scroller
		// actionBarPlugin']//table/tbody/tr[1]/td[6]//a")));
		// select_individual.click();
		return this;
	}

	/*
	 * @author Selva
	 * This method clicks on the edit button on the Individuals page
	 */
	public EditIndividualPage clickEdit() {
		click(Locators.XPATH, "//div[@class='scroller actionBarPlugin']//table/tbody/tr[1]/td[6]//a");
		click(Locators.XPATH, "//a[@title='Edit']");

		return new EditIndividualPage();
	}

}
