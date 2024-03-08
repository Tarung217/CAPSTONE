package com.xyz.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.C_AccountPage;
import com.xyz.qa.pages.Login_Page;

public class C_AccountTc extends TestBase {
    Login_Page loginPage;
    C_AccountPage accountPage;
    
    public C_AccountTc() {
        super();
    }
    
    
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new Login_Page();
        accountPage = loginPage.loginAsCustomer("Harry Potter");
    }
    
    
    @Test
    public void verifyCustomerAccountDetails() {
        String headerName = accountPage.getHeaderName();
        Assert.assertEquals(headerName, "XYZ Bank");

        String customerName = accountPage.getCustomerName();
        Assert.assertEquals(customerName, "Harry Potter");
        
      
    }
    
  
}
