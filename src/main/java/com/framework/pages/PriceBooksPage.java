<<<<<<< HEAD
package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;

public class PriceBooksPage extends SeleniumBase {

	public EditPriceBooksPage clickNewPB() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(locateElement("//div[@title='New']"));
		return new EditPriceBooksPage();
	}

	public PriceBooksPage verifyPriceBookCreated() {
		WebElement pricebookcreatedname = locateElement("//span[@class=\"uiOutputText\"]");
		if (pricebookcreatedname.getText().equalsIgnoreCase(getValueFromConfig("pricebooknames"))) {
			System.out.println("price book created");

		} else {
			System.out.println("not landed in proper page to check");
		}
		return this;

	}
}
=======
package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;

public class PriceBooksPage extends SeleniumBase {

	public EditPriceBooksPage clickNewPB() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(locateElement("//div[@title='New']"));
		return new EditPriceBooksPage();
	}

	public PriceBooksPage verifyPriceBookCreated() {
		WebElement pricebookcreatedname = locateElement("//span[@class=\"uiOutputText\"]");
		if (pricebookcreatedname.getText().equalsIgnoreCase(getValueFromConfig("pricebooknames"))) {
			System.out.println("price book created");

		} else {
			System.out.println("not landed in proper page to check");
		}
		return this;

	}
}
>>>>>>> 9529103d6d51341f8de5c8d21d5a06d95ff8f512
