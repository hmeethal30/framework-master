package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;

public class EditPriceBooksPage extends SeleniumBase{
	
	
	public EditPriceBooksPage enterBookName() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		type(locateElement("(//input[@class=' input'])[1]"),getValueFromConfig("pricebooknames"));
		return this;
	}
	
	public EditPriceBooksPage enterBookDesc() {
		type(locateElement("(//input[@class=' input'])[2]"),getValueFromConfig("pricebookdesc"));
		return this;
	}

	public EditPriceBooksPage checkActive() {
		click(locateElement("//span[contains(text(),'Active')]/parent::label/following-sibling::input"));
		return this;
	}
	
	public PriceBooksPage clickSave() {
		click(locateElement("(//span[contains(text(),'Save')])[3]"));
		return new PriceBooksPage();
	}
	
	public PriceBooksPage clickCancel() {
		click(locateElement("//span[contains(text(),'Cancel')]/parent::button[@title='Cancel']"));
		return new PriceBooksPage();
	}
}
