package com.xyz.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.Manager_ACPage;

public class Manager_ACTc extends TestBase {
    Manager_ACPage addCustomerPage;
    
    public Manager_ACTc() {
        super();
    }
    
    @BeforeMethod
    public void setUp() {
        initialization();
        addCustomerPage = new Manager_ACPage(); 
    }
    
    @Test
    public void AddCustomer() {
        // Click on Bank Manager Login
        addCustomerPage.clickBankManagerLoginButton();
        
        // Click on Add Customer
        addCustomerPage.clickAddCustomerButton();
        
        // Enter customer details
        addCustomerPage.enterFirstName("Tarun");
        addCustomerPage.enterLastName("Gour");
        addCustomerPage.enterPostCode("47401");
        
        // Click on Add Customer button
        addCustomerPage.clickSubmitButton();
        
       
        addCustomerPage.acceptAlert();
    }
    
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
