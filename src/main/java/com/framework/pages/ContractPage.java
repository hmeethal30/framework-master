package com.framework.pages;

import com.framework.selenium.api.design.Locators;

import static org.testng.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.framework.selenium.api.base.SeleniumBase;

public class ContractPage extends SeleniumBase {
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
	
	public ContractPage selectContractDropDown() {
		click(Locators.XPATH, "//div[@role='navigation']//button[1]");
		return this;
	}
	
	public ContractPage clickNewContract() {
		clickUsingJs(locateElement(Locators.XPATH,"//span[@class='slds-truncate']/following::span[text()='New Contract']"));
		return this;
	}
	
	public ContractPage selectAccountNAme() {
		click(Locators.XPATH, "//span[text()='Account Name']/parent::label/following-sibling::div/div/div/div/input");
		click(Locators.XPATH,"//span[text()='Account Name']/parent::label/following::li/a/div/div[@title='Brinda']");
	    return this;
	}
		
	public ContractPage selectContStartDate() {
		click(Locators.XPATH, "//span[text()='Contract Start Date']/parent::label/following-sibling::div/a[@class='datePicker-openIcon display']");
		click(Locators.XPATH, "//td[contains(@class,'uiDayInMonthCell')]/span[text()='27']");
	    return this;
	}
		
    public ContractPage selectContractTerm() {
    	clearAndType(locateElement(Locators.XPATH, "//span[text()='Contract Term (months)']/parent::label/following-sibling::input"),"6");
    	return this;
    }
	    
	public ContractPage clickSave() {
		click(Locators.XPATH, "//button[@title='Save']/span[text()='Save']");
	    return this;
	}
	
	public ContractPage verifyContractNo() {
		String[] strContractNo = getElementText(locateElement(Locators.XPATH, "//span[contains(@class,'toastMessage')]")).split("\"");
	    boolean equals = getElementText(locateElement(Locators.XPATH, "//h1/div[contains(@class,'slds-page-header__title')]/span[@class='uiOutputText']")).equals(strContractNo[1]);
	    Assert.assertEquals(equals, true);
	    return this;
	    }
	    
	    //11.Get the difference between  the Contract Start Date and End Date and Check it matches the Contract Term."
	    public ContractPage verifyContractDiff() throws ParseException {	
				String strStartDate = getElementText(locateElement(Locators.XPATH, "//span[contains(@title,'Contract Start Date')]/following-sibling::div/div/span[@class='uiOutputDate']"));
	    		String strEndDate = getElementText(locateElement(Locators.XPATH, "//span[contains(@title,'Contract End Date')]/following-sibling::div/div/span[@class='uiOutputDate']"));
	    		
	    		Date strStartDte = simpleDateFormat.parse(strStartDate);
	    		Date strEndDte = simpleDateFormat.parse(strEndDate);
	    		int months =  (strStartDte.getMonth() - strEndDte.getMonth());

	    		if(months == 6) {
	    			System.out.println("The diff in contract start date and end date is 6 months");
	    		} else {
	    			System.out.println("The diff in contract start date and end date is not as expected");
	    		}   
	    		return this;
	    }
	    
	    public ContractPage typeContractNo() {
	    	clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search this list...' and @name='Contract-search-input']"), "00000123");
	    	return this;
	    }
	    
	    public int getRecordRow() throws InterruptedException {
	    	int row = 1;
	    	Thread.sleep(5000);
	        List<WebElement> eleCobtractTbl = locateElements(Locators.XPATH, "//table[contains(@class,'slds-table--resizable-cols uiVirtualDataTable')]/tbody/tr");
	        System.out.println("table size:"+eleCobtractTbl.size());
	        if(eleCobtractTbl.size()>0) {
	        	for(WebElement contractRow : eleCobtractTbl) {
	        		String strContractNo = getAttribute(locateElement(Locators.XPATH, "//table[contains(@class,'slds-table--resizable-cols uiVirtualDataTable')]/tbody/tr/th/span/a"), "title");
	        		if(strContractNo.equalsIgnoreCase("00000124") ) {
	        			System.out.println("Done");
	        			break;
	        		}
	        		row=row+1;
	        	}
	        } else {
	        	row = 0;
	        }
			return row;
	    }
	    
	    public ContractPage selectRecordEdit() throws InterruptedException {
	    	int row = getRecordRow();
	    	if(row != 0) {
	    		click(Locators.XPATH, "(//table[contains(@class,'slds-table--resizable-cols uiVirtualDataTable')]/tbody/tr/td/following::a[@role='button'])["+row+"]");
	    		click(Locators.XPATH, "//a[contains(@title,'Edit')]");
	    	}
	    	return this;
	    }
	    
	    public ContractPage selectRecordDelete() throws InterruptedException {
	    	int row = getRecordRow();
	    	if(row != 0) {
	    		click(Locators.XPATH, "(//table[contains(@class,'slds-table--resizable-cols uiVirtualDataTable')]/tbody/tr/td/following::a[@role='button'])["+row+"]");
	    		click(Locators.XPATH, "//a[contains(@title,'Delete')]");
	    	}
	    	return this;
	    }
	    public ContractPage selectStatus() {
	    	try {
	    		click(Locators.XPATH, "//span[text()='Status']/parent::span/following-sibling::div");
	    		clickUsingJs(locateElement(Locators.XPATH, "//li/a[@title='Activated']"));
	    	} catch (Exception e) {
	    		System.out.println(e.getMessage());
	    	}
	    	return this;
	    	
	    }
	    
	    public ContractPage selectOwnerExpirationNotice() {
	    	try {
	    	click(Locators.XPATH, "//span[text()='Owner Expiration Notice']/parent::span/following-sibling::div");
	    	click(Locators.XPATH, "//li/a[@title='30 Days']");
	    	} catch (Exception e) {
	    		System.out.println(e.getMessage());
	    	}
	    	return this;
	   }
	    
	    public void verifyStatus(String message) {
	    	try {
	    	String strMsg = getElementText(locateElement(Locators.XPATH, "//span[contains(@class,'toastMessage')]"));
	    	boolean equalsIgnoreCase = strMsg.equalsIgnoreCase(message);
	    	Assert.assertEquals(equalsIgnoreCase, true);
	    	} catch (Exception e) {
	    		System.out.println(e.getMessage());
	    	}
	    }
	    
	    public ContractPage confirmDelete() {
	    	click(Locators.XPATH, "//button[@title='Delete']");
	    	return this;
	    }
	    
	    public void verifyErrMsg(String strErrMsg) {
	    	try {
	    		String strerrMsg = getElementText(locateElement(Locators.XPATH, "//ul[@class='errorsList']/li"));
		        boolean equalsIgnoreCase = strerrMsg.equalsIgnoreCase(strErrMsg);
		        assertEquals(equalsIgnoreCase, true);
	    	} catch(Exception e) {
	    		System.out.println(e.getMessage());
	    	}
	    }
	    
	    public void verifySortOrder () {
	    	List<WebElement> eleContract = locateElements(Locators.XPATH, "//th/span/a");
	        List<String> strContractNos = null;
	        for(WebElement Contract : eleContract) {
	        	strContractNos.add(Contract.getAttribute("title"));
	        }
	        Collections.sort(strContractNos);
	    }

}
