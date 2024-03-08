package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.xyz.qa.base.TestBase;

public class Withdraw_Page extends TestBase {

    // Page Factory - Object Repository:
    @FindBy(xpath="//input[@placeholder='amount']")
    WebElement withdrawAmountInput;
    
    @FindBy(xpath="//button[normalize-space()='Withdraw']")
    WebElement withdrawButton;
    
    @FindBy(xpath="//span[@class='error ng-binding']")
    WebElement withdrawStatusMessage;
    
 

    // Initializing the Page Objects:
    public Withdraw_Page(){
        PageFactory.initElements(driver, this);
    }
    
    // Method to enter withdraw amount
    public void enterWithdrawAmount(String amount) {
     //   withdrawAmountInput.clear(); // Clear the input field 
        withdrawAmountInput.sendKeys(amount);
    }
    
    // Method to click on withdraw button
    public void WithdrawButton() {
        withdrawButton.click();
    }
    
    // Method to retrieve the withdraw status message
    public String getWithdrawStatusMessage() {
        return withdrawStatusMessage.getText();
    }
    
   
    }

