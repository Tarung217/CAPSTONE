package com.xyz.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.Manager_OAPage;

public class Manager_OATc extends TestBase {
    Manager_OAPage openAccountPage;
    
    public Manager_OATc() {
        super();
    }
    
    @BeforeMethod
    public void setUp() {
        initialization();
        openAccountPage = new Manager_OAPage(); 
    }
    
    @Test
    public void OpenAccount() {
        // Click on Bank Manager Login
        openAccountPage.clickBankManagerLoginButton();
        
        // Click on Open Account
        openAccountPage.clickOpenAccountButton();
        
        // Select customer name from dropdown
        openAccountPage.selectCustomerName("Ron Weasly");
        
        // Select currency from dropdown
        openAccountPage.selectCurrency("Dollar");
        
        // Click on Process button
        openAccountPage.clickProcessButton();
        
      
        // Click OK on the alert
        openAccountPage.acceptAlert();
    }
    
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
