<<<<<<< HEAD
package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;



public class LeadsPage extends SeleniumBase {
	
	//Click New button
		public CreateNewLeadPage createLead() throws InterruptedException {	
			clickUsingJs(locateElement(Locators.XPATH,"//div[@title='New']"));
			Thread.sleep(5000);
			System.out.println("clicked New button");
			return new CreateNewLeadPage();
		}
		


}
=======
package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.selenium.api.design.Locators;



public class LeadsPage extends SeleniumBase {
	
	//Click New button
		public CreateNewLeadPage createLead() throws InterruptedException {	
			clickUsingJs(locateElement(Locators.XPATH,"//div[@title='New']"));
			Thread.sleep(5000);
			System.out.println("clicked New button");
			return new CreateNewLeadPage();
		}
		


}
>>>>>>> 9529103d6d51341f8de5c8d21d5a06d95ff8f512
