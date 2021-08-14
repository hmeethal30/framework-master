package com.framework.testcase;

import com.framework.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class Assignment_CreateAndVerifyReport extends ProjectSpecificMethods {
    String previewPath;
    @BeforeTest
    public void setTestDetails() {
        testcaseName = "Verify create report";
        testDescription = "This is a test to verify report creation";
        authors = "Haseena";
        category = "Assignment";
        excelFileName = "Assignment20210814";
        previewPath = "C:/Users/amhas/Pictures/sample images/report1.jpg";
    }

    @Test
    public void testCreateReport() throws InterruptedException, AWTException {
        new LoginPage()
                .typeUserName()
                .typePassword()
                .clickLogin()
                .clickApplauncher()
                .clickViewAll()
                .clickService()
                .clickReports()
                .clickNewReportClassic()
                .clickOnLeads()
                .savePreviewImage(previewPath)
                .clickOnCreate()

        ;

    }
}
