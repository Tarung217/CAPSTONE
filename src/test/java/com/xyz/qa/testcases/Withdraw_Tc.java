package com.xyz.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.C_AccountPage;
import com.xyz.qa.pages.Withdraw_Page;
import com.xyz.qa.pages.Login_Page;


public class Withdraw_Tc extends TestBase {
    Login_Page loginPage;
    C_AccountPage accountPage;
    Withdraw_Page withdrawPage;
    
    public Withdraw_Tc() {
        super();
    }
    
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new Login_Page(); 
        accountPage = loginPage.loginAsCustomer("Ron Weasly"); 
    }
    
    @Test 
    public void withdrawAmount() {
        withdrawPage = accountPage.clickWithdrawButton();
        withdrawPage.enterWithdrawAmount("100"); 
        withdrawPage.WithdrawButton();
        
     }
    @AfterMethod
    public void tearDown() {
    driver.close();   
    
}}
