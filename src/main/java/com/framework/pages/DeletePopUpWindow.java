package com.framework.pages;

import org.openqa.selenium.WebElement;
import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class DeletePopUpWindow extends SeleniumBase {

	public ToastMessagesValidation popupDelete() throws InterruptedException {
		Thread.sleep(3000);
		WebElement webEle = locateElement(Locators.XPATH, "//button[@title='Delete']");
		waitForApperance(webEle);
		click(webEle);
		return new ToastMessagesValidation();

	}

}
