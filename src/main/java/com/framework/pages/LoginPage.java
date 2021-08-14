package com.framework.pages;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;

public class LoginPage extends SeleniumBase {

	public LoginPage typeUserName() {
		type(locateElement(Locators.NAME, "username"), getValueFromConfig("username"));
		return this;
	}

	public LoginPage typePassword() {
		type(locateElement(Locators.ID, "password"), getValueFromConfig("password"));
		return this;
	}

	public HomePage clickLogin() {
		click(Locators.ID, "Login");
		return new HomePage();
	}

}
