<<<<<<< HEAD
package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditIndividualsTest extends ProjectSpecificMethods {
	
	@BeforeTest	
	  public void setTest() { 
		testcaseName = "Edit Individuals" ; 
		testDescription = "This testcase edits an Individual";
		category = "Regression";
		authors = "Selva";
		excelFileName = "";	  
	  }
	 
	
	@Test
	public void editIndividual(){
		
		new LoginPage()		
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.click_Individuals()
		.verifyIndividualTab()
		.searchIndividual()
		.clickEdit()
		.selectSalutation()
		.enter_FirstName("Selva")
		.click_Save();
	}
}

=======
package com.framework.testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditIndividualsTest extends ProjectSpecificMethods {
	
	@BeforeTest	
	  public void setTest() { 
		testcaseName = "Edit Individuals" ; 
		testDescription = "This testcase edits an Individual";
		category = "Regression";
		authors = "Selva";
		excelFileName = "";	  
	  }
	 
	
	@Test
	public void editIndividual(){
		
		new LoginPage()		
		.typeUserName()
		.typePassword()
		.clickLogin()
		.clickApplauncher()
		.clickViewAll()
		.click_Individuals()
		.verifyIndividualTab()
		.searchIndividual()
		.clickEdit()
		.selectSalutation()
		.enter_FirstName("Selva")
		.click_Save();
	}
}

>>>>>>> 9529103d6d51341f8de5c8d21d5a06d95ff8f512
