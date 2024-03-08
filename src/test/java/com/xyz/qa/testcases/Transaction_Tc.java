package com.xyz.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.C_AccountPage;
import com.xyz.qa.pages.Withdraw_Page;
import com.xyz.qa.pages.Login_Page;
import com.xyz.qa.pages.Deposit_Page;
import com.xyz.qa.pages.Transaction_Page;

public class Transaction_Tc extends TestBase {
	public static long IMPLICIT_WAIT = 30;
    Login_Page loginPage;
    C_AccountPage accountPage;
    Withdraw_Page withdrawPage;
    Deposit_Page depositPage;
    Transaction_Page transactionPage;
    
    public Transaction_Tc() {
        super();
    }
    
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new Login_Page(); 
        accountPage = loginPage.loginAsCustomer("Hermoine Granger"); 
    }
    
    @Test
    public void Transactions() {
        
        transactionPage = accountPage.clickTransactionButton();
        transactionPage.setStartDate("01-01-2015 00:00");
        transactionPage.setEndDate("07-03-2015 00:00");
      
    }
    @AfterMethod
    public void tearDown() {
    driver.close();
}
}