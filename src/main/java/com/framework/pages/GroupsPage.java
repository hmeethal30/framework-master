package com.framework.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class GroupsPage extends SeleniumBase {
	
	/**
	 * @author Haseena
	 * @return Groups page
	 */
	public GroupsPage clickNewButton() {
		click(Locators.XPATH, "//div[@title='New']/parent::a");
		return this;
	}
	
	/**
	 * @author Haseena
	 * This method will click type value into Group name text field
	 * @return Groups page
	 */
	public GroupsPage typeGroupName(String strGroupName) {
		clearAndType(locateElement(Locators.XPATH, "//span[text()='Name']/parent::label/following-sibling::input"), strGroupName);
		return this;
	}
	
	/**
	 * @author Haseena
	 *	This method will click on Access Type dropdown and will select value Public(
	 * @return Groups page
	 */
	public GroupsPage selectAccessTypeAsPublic() {
		click(Locators.XPATH, "//span[text()='Access Type']/following::a[1]");
		click(Locators.XPATH, "//a[@title='Public']");
		return this;
	}
	
	/**
	 * @author Haseena
	 *	This method will click on Access Type dropdown and will select value Private(
	 * @return Groups page
	 */
	public GroupsPage selectAccessTypeAsPrivate() throws InterruptedException {
		Actions scrollDown= new Actions(getDriver());
	    scrollDown.sendKeys(Keys.PAGE_DOWN).perform();
	    Thread.sleep(1000);
		WebElement elemAccessTypeSelected = locateElement(Locators.XPATH, "//span[text()='Access Type']/../following-sibling::div/div/div/div/a"); //driver.findElement(By.xpath("//span[text()='Access Type']/../following-sibling::div/div/div/div/a"));
		clickUsingJs(elemAccessTypeSelected);
		click(Locators.XPATH, "//span[text()='Access Type']/../following-sibling::div/following::a[text()='Private']");
		return this;
	}
	
	/**
	 * @author Haseena
	 *	This method will upload an image from the given location
	 * @return Groups page
	 */
	public GroupsPage uploadImage(String imageFile) throws InterruptedException, AWTException {
		fileUploadWithJs(locateElement(Locators.XPATH, "//button[text()='Upload Image']"), imageFile);
		return this;
	}

	
	/**
	 * @author Haseena
	 *	This method will click on clickSaveAndNext on Groups page
	 * @return Groups page
	 */
	public GroupsPage clickSaveAndNext() {
		click(Locators.XPATH,"//span[text()='Save & Next']/parent::button");
		return this;
	}
	
	/**
	 * @author Haseena
	 *	This method will click on Next on Groups page
	 * @return Groups page
	 */
	public GroupsPage clickNext() {
		click(Locators.XPATH,"//span[text()='Next']");
		return this;
	}
	
	/**
	 * @author Haseena
	 *	This method will click on Done on Groups page
	 * @return Groups page
	 */
	public GroupsPage clickDone() {
		click(Locators.XPATH,"//span[text()='Done']");
		return this;
	}
	
	/**
	 * @author Haseena
	 *	This method will search for a group using group name on Groups page
	 * @return Groups page
	 */
	public GroupsPage searchGroupUsingName(String strGroupName) {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search this list...']"),strGroupName);
		verifyDisplayed(locateElement(Locators.XPATH, "//a[text()='"+ strGroupName + "']"));
		return this;
	}
	
	/**
	 * @author Haseena
	 *	This method will Click on the Dropdown icon and Select EditGroup on Groups page
	 * @return Groups page
	 */
	public GroupsPage selectEditGroup(String strGroupName) {
		String xpathMoreActionsDrop = "//a[text()='" + strGroupName + "']/ancestor::tbody/tr[1]/td[last()]/span/div/a";
		WebElement eleMoreActionsDrop =locateElement(Locators.XPATH, xpathMoreActionsDrop);
//		clickUsingJs(eleMoreActionsDrop);
		click(Locators.XPATH, xpathMoreActionsDrop);
		click(Locators.XPATH, "//a[@title='Edit Group']");
		return this;
	}
	
	/**
	 * @author Haseena
	 *	This method will Enter description as <value> 
	 * @return Groups page
	 */
	public GroupsPage typeGroupDescription(String strGroupDescription) {
		clearAndType(locateElement(Locators.XPATH, "//span[text()='Description']/parent::label/following-sibling::textarea"),strGroupDescription);
		return this;
	}
	
	/**
	 * @author Haseena
	 *	In Information field, change the font into <Verdana>
	 * @return Groups page
	 */
	public GroupsPage selectFontType(String strFontName) {
		String xpathFontName = "//span[text()='" + strFontName + "']";			//"//span[text()='Verdana']"
		click(Locators.XPATH, "//label[text()='Font']//following::input[@name='font']");
		click(Locators.XPATH, xpathFontName);
		return this;
	}
	
	
	/**
	 * @author Haseena
	 *	In Information field, Change the font size to <18>
	 * @return Groups page
	 */
	public GroupsPage selectFontSize(String strFontSize) throws InterruptedException {
		click(Locators.XPATH, "//label[text()='Font Size']//following::input[@name='font-size']");
		String xpathFontSizeParent = "//span[text()='" + strFontSize + "']/../../..";		//"//span[text()='18']/../../.."
		WebElement elemFontSize = locateElement(Locators.XPATH,xpathFontSizeParent);
		Coordinates cordFontSize = ((Locatable)elemFontSize).getCoordinates();
		cordFontSize.onPage();
		cordFontSize.inViewPort();
		Thread.sleep(1000);
		
		String xpathFontSize = "//span[text()='" + strFontSize + "']";		//"//span[text()='18']"
		click(Locators.XPATH, xpathFontSize);
//		driver.findElement(By.xpath(xpathFontSize)).click();
		return this;
	}
	
	/**
	 * @author Haseena
	 *	clickSaveAfterEdit
	 * @return Groups page
	 */
	public GroupsPage clickSaveAfterEdit() throws InterruptedException {
		clickUsingJs(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
		return this;
	}
	
	/**
	 * @author Haseena
	 *	Click on the link with group name strGroupName from search results
	 * @return Groups page
	 */
	public GroupsPage clickOnGroupAfterSearch(String strGroupName) {
		String xpathElemGroupLink = "//a[text()='" + strGroupName + "']";
		WebElement groupLinkSearched = locateElement(Locators.XPATH,xpathElemGroupLink) ;//driver.findElement(By.xpath(xpathElemGroupLink));
//		wait.until(ExpectedConditions.elementToBeClickable(groupLinkSearched));
		groupLinkSearched.click();
		return this;
	}
	
	/* All Verification steps: */
	/**  @author Haseena
	 * Verify the Alert message(These required fields must be completed: Access
	 * Type, Name)
	 */	
	public void verifyAlertforGroupsWithoutMndtryFlds() {
		
		String expectedErrorMsg = "These required fields must be completed: Access Type";
		WebElement elemErrorMessage = getDriver().findElement(By.xpath("//ul[@class='errorsList']/li"));
		Boolean boolError = elemErrorMessage.isDisplayed();
		if (boolError) {
			Assert.assertEquals(elemErrorMessage.getText(), expectedErrorMsg);
			reportStep("Error message component is displayed when mandatory fields are not provided", "pass");
		} else {
			reportStep("Error message component is NOT displayed when mandatory fields are not provided", "fail");
		}
	}
	
	/**  @author Haseena
	 * Verify the Alert message(These required fields must be completed: Access
	 * Type, Name)
	 */	
	public void verifyGroupName(String strGroupName) {
		String xpathGrpName = "//span[text()='"+strGroupName+"']";
		Boolean boolNewGroup = getDriver().findElement(By.xpath(xpathGrpName)).isDisplayed();
		if (boolNewGroup) {
			System.out.println("New group " + strGroupName + " is created successfully!");
		} else {
			System.out.println("New group " + strGroupName + " is NOT created successfully!");
		}
	}
	
	/**  @author Haseena
	 * Verify if edited group name is displayed correctly
	 */	
	public void verifyEditedGroupName(String strGroupName) {
		WebElement elemSuccessMsg = locateElement(Locators.XPATH, "//span[text()='success']/../following-sibling::div/div/span") ; //driver.findElement(By.xpath("//span[text()='success']/../following-sibling::div/div/span"));
		String strExpectedMsg = "Group \"" + strGroupName + "\" was saved.";
		Boolean boolEditGroup = elemSuccessMsg.isDisplayed();
		if (boolEditGroup) {
			String strSuccessMessage = elemSuccessMsg.getText();
			System.out.println(strSuccessMessage);
			Assert.assertEquals(strSuccessMessage, strExpectedMsg);
			System.out.println("Group " + strGroupName + " is edited successfully!");
		} else if (boolEditGroup){
			System.out.println("New group " + strGroupName + " is NOT edited successfully!");
		}
	}
}
