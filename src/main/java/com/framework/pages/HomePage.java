package com.framework.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class HomePage extends SeleniumBase {

	public HomePage clickApplauncher() {
		click(Locators.XPATH, "//div[@role='navigation']//button[1]");
		return this;
	}

	public HomePage clickViewAll() {
		click(Locators.XPATH, "//button[text()='View All']");
		return this;
	}

	public ProductPage clickProducts() {
		moveToElement(locateElement(Locators.XPATH, "//p[text()='Products']"));
		click(Locators.XPATH, "//p[text()='Products']");
		return new ProductPage();
	}

	public SalesPage clickSales() {
		click(Locators.XPATH, "//p[text()='Sales']");
		return new SalesPage();
	}

	public ServicePage clickService() {
		click(Locators.XPATH, "//p[text()='Service']");
		return new ServicePage();
	}

	/*
	 * @author Swami This method click on the Contact Request link on the App
	 * Launcher modal
	 */

	public ContactReqDashboardPage clickContactRequests() {

		clickUsingJs(locateElement(Locators.XPATH, "//p[text()='Contact Requests']"));
		return new ContactReqDashboardPage();
	}

	/*
	 * @author Selva This method clicks on the Individual on the App Launcher modal
	 */

	public IndividualsPage click_Individuals() {

		WebElement indivudual = locateElement("//p[contains(text(),'Individuals')]");
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true)", indivudual);
		click(indivudual);

		return new IndividualsPage();

	}

	public ContractPage selectContract() {
		clickUsingJs(locateElement(Locators.XPATH, "//p[@class='slds-truncate' and text()='Contracts']"));
		return new ContractPage();
	}

	public PartyConsentPage clickPartyConsent() throws InterruptedException {
		Thread.sleep(3000);

		WebElement webEle = locateElement(Locators.XPATH, "//a[@href='/lightning/o/PartyConsent/home']");
		clickUsingJs(webEle);
		return new PartyConsentPage();
	}

	public HomePage clickGlobalActionsSVGicon() {
		waitForApperance(locateElement(Locators.XPATH, "//div[@class='slds-icon-waffle']"));
		executeTheScript("arguments[0].click();",
				locateElement(Locators.XPATH, "//a[contains(@class,'globalCreateTrigger')]"));
		return this;
	}

	public CasesPage clickNewCase() {
		click(locateElement(Locators.LINK_TEXT, "New Case"));

		return new CasesPage();

	}

	public CreatePaymentPage clickPayments() throws InterruptedException {

		WebElement payments = locateElement(Locators.XPATH, "//p[text()='Payments']//ancestor::a");
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true)", payments);
		// click(payments);
		executeTheScript("arguments[0].click();", locateElement(Locators.XPATH, "//p[text()='Payments']//ancestor::a"));
		/*
		 * Thread.sleep(5000); click(Locators.XPATH,
		 * "//p[text()='Payments']//ancestor::a");
		 */
		return new CreatePaymentPage();

	}

	public NewOpportunityPage clickOpportunity() throws InterruptedException, IOException {

		WebElement webEle = locateElement(Locators.XPATH, "//a[@title='Opportunities']");
		clickUsingJs(webEle);
		Thread.sleep(5000);
		return new NewOpportunityPage();
	}

	public HomePage viewAllKeyDeals() throws IOException {

		WebElement webEle = locateElement(Locators.XPATH, "//p[text()='Sales']");
		click(webEle);
		WebElement webEle1 = locateElement(Locators.XPATH, "//span[text()='View All Key Deals']");
		clickUsingJs(webEle1);
		return this;

	}

	public LocationsPage clickLocations() {
		executeTheScript("arguments[0].scrollIntoView(true);",
				locateElement(Locators.XPATH, "//p[text()='Locations']"));
		click(Locators.XPATH, "//p[text()='Locations']");
		return new LocationsPage();
	}

	/*
	 * @author Selva This method clicks on the PriceBooks on the App Launcher modal
	 */
	public PriceBooksPage click_PriceBooks() {
		WebElement priceBooks = locateElement("//p[contains(text(),'Price Books')]");
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", priceBooks);
		priceBooks.click();
		return new PriceBooksPage();
	}

	/* @author Vallynayki This method is to invoke WorkTypeGroup on AppLauncher */

	public WorkGroupPage clickWorkGroup() {
		WebElement webEle = locateElement(Locators.XPATH, "//a[@data-label='Work Type Groups']");
		clickUsingJs(webEle);
		return new WorkGroupPage();
	}
}
