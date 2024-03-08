package com.xyz.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;                                        
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.Manager_CPage;

public class Manager_CTc extends TestBase {
    Manager_CPage customersPage;
    
    public Manager_CTc() {
        super();
    }
    
    @BeforeMethod
    public void setUp() {
        initialization();
        customersPage = new Manager_CPage(); 
    }
    
    @SuppressWarnings("unused")
	@Test
    public void CustomerDetails() {
        // Click on Bank Manager Login
        customersPage.clickBankManagerLoginButton();
        
        // Click on Customers
        customersPage.clickCustomersButton();
        
        // Search for customer by name
        customersPage.searchCustomer("Hermoine");
        
        // Verify customer details
        
		String firstName = customersPage.getFirstName();
        Assert.assertEquals(firstName, "Hermoine");
        
        
   
        
       
    }
    
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}

