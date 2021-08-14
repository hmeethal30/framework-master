package com.framework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class VerizonHomePage extends SeleniumBase {

	public VerizonHomePage btnShop() {
		click(Locators.XPATH, "//button[text()='Shop']");
		return this;
	}

	public VerizonHomePage labelAccessories() {
		// click(Locators.XPATH, "(//a[@aria-label='Accessories menu list'])[3]");
		clickUsingJs(locateElement(Locators.XPATH, "(//a[@aria-label='Accessories menu list'])[3]"));
		return this;
	}

	public VerizonHomePage shopAllAccessories() {
		// click(Locators.XPATH, "(//a[@aria-label='Shop all accessories'])[3]");
		clickUsingJs(locateElement(Locators.XPATH, "(//a[@aria-label='Shop all accessories'])[3]"));
		return this;
	}

	public VerizonHomePage AccessoriesTypes() {
		// click(Locators.XPATH, "//*[text()='Bands']");
		clickUsingJs(locateElement(Locators.XPATH, "//*[text()='Bands']"));
		return this;
	}

	public VerizonHomePage AccessoriesSelection() {
		// click(Locators.XPATH, "//*[text()='Bands']");
		clickUsingJs(locateElement(Locators.XPATH, "((//div[contains(@class,'Tile__TileWrapper')])[1]//a)[2]"));
		return this;
	}

	public VerizonHomePage clickContinue() {
		// click(Locators.XPATH, "//*[text()='Bands']");
		clickUsingJs(locateElement(Locators.XPATH, "//div[text()='Continue']"));
		return this;
	}

	public VerizonHomePage clickCheckOut() {
		// click(Locators.XPATH, "//*[text()='Bands']");
		clickUsingJs(locateElement(Locators.XPATH, "(//button[text()='Checkout'])[2]"));
		return this;
	}

	public VerizonHomePage guestCheckOut() {
		// click(Locators.XPATH, "//*[text()='Bands']");
		scrollToViewElement("//a[text()='Checkout as Guest']");
		clickUsingJs(locateElement(Locators.XPATH, "//a[text()='Checkout as Guest']"));
		return this;
	}

	public VerizonHomePage shippingInformation() {
		type(locateElement(Locators.XPATH, "//input[@name='businessName']"), "Testleaf");
		type(locateElement(Locators.XPATH, "//input[@name='firstName']"), "Ragu");
		type(locateElement(Locators.XPATH, "//input[@name='lastName']"), "keerthi");
		type(locateElement(Locators.XPATH, "//input[@name='address1']"), "1 verizon way");
		type(locateElement(Locators.XPATH, "//input[@name='address2']"), "Sylvyan County");
		type(locateElement(Locators.XPATH, "//input[@name='city']"), "Florida");
		selectDropDownUsingText(locateElement(Locators.XPATH, "//select[@id='state']"), "CO");
		type(locateElement(Locators.XPATH, "//input[@name='zipcode']"), "30009");

		type(locateElement(Locators.XPATH, "//input[@name='email']"), "test.sylvyan@gmail.com");
		type(locateElement(Locators.XPATH, "//input[@name='phoneNumber']"), "9632587421");
		clickUsingJs(locateElement(Locators.XPATH, "//button[text()='Update']"));

		return this;
	}

	public VerizonHomePage shippingMethod(int x) {
		//List<WebElement> radioBtn = locateElements(Locators.XPATH, "(//input[@name='shippingRadio'])");

		for (int i = 1; i <= locateElements(Locators.XPATH, "(//input[@name='shippingRadio'])").size(); i++) {
			if (x == 1) {
				clickUsingJs(locateElement(Locators.XPATH, "(//input[@name='shippingRadio'])[1]"));
				break;
			} else if (x == 2) {
				clickUsingJs(locateElement(Locators.XPATH, "(//input[@name='shippingRadio'])[2]"));
				break;
			} else {
				clickUsingJs(locateElement(Locators.XPATH, "(//input[@name='shippingRadio'])[3]"));
				break;
			}
		}
		clickUsingJs(locateElement(Locators.XPATH, "//button[text()='Update']"));
		return this;
	}

	public VerizonHomePage billingAddress() throws InterruptedException {
		Thread.sleep(5000);
		//waitForDisapperance(element);
		boolean val = verifySelected(locateElement(Locators.XPATH, "//span[@class=' checkboxOnlySpan']"));
		if (val) {

			clickUsingJs(locateElement(Locators.XPATH, "//button[text()='Update']"));
		} else {
			clickUsingJs(locateElement(Locators.XPATH, "//span[@class=' checkboxOnlySpan']"));
			clickUsingJs(locateElement(Locators.XPATH, "//button[text()='Update']"));
		}

		return this;
	}
	
	public VerizonHomePage paymentInformation() throws InterruptedException {
		Thread.sleep(5000);
		clickUsingJs(locateElement(Locators.XPATH, "//input[@value='newcard']"));
		type(locateElement(Locators.XPATH, "//input[@name='card_number']"), "3456574354745667");
		selectDropDownUsingText(locateElement(Locators.XPATH, "//select[@id='card_month']"), "12");
		selectDropDownUsingText(locateElement(Locators.XPATH, "//select[@id='card_year']"), "2023");
		type(locateElement(Locators.XPATH, "//input[@name='card_zip']"), "30009");
		type(locateElement(Locators.XPATH, "//input[@name='card_cvc']"), "111");
		clickUsingJs(locateElement(Locators.XPATH, "//button[text()='Confirm payment']"));			
		return this;
	
	
	

}
	
}
