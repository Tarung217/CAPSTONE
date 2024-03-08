package com.xyz.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.C_AccountPage;
import com.xyz.qa.pages.Deposit_Page;
import com.xyz.qa.pages.Login_Page;

public class Deposit_Tc extends TestBase {
    Login_Page loginPage;
    C_AccountPage accountPage;
    Deposit_Page depositPage;
    
    public Deposit_Tc() {
        super();
    }
    
     @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new Login_Page(); 
        accountPage = loginPage.loginAsCustomer("Harry Potter"); 
    }
    
    @Test 
    public void depositAmount() {
        
        depositPage = accountPage.clickDepositButton();
        depositPage.enterDepositAmount("10000"); 
        depositPage.clickDepositButton();
        
    }
    
    
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
