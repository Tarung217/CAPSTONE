package com.xyz.qa.testcases ;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xyz.qa.base.TestBase;
import com.xyz.qa.pages.Login_Page;

public class Login_Tc extends TestBase {
    Login_Page loginPage;
    
    public Login_Tc() {
        super();
    }
  
       @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new Login_Page(); 
    }
    
     @Test 
    public void loginTest() {
        loginPage.customerLogin();
        loginPage.selectCustomer("Ron Weasly");
        loginPage.clickLoginButton();
       
    }
    
     @AfterMethod
     public void tearDown() {
         driver.close();
     }


}
