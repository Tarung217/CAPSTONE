package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.xyz.qa.base.TestBase;

public class C_AccountPage extends TestBase {

    
    @FindBy(xpath="//strong[@class='mainHeading']")
    WebElement headerName;

    @FindBy(xpath="//span[@class='fontBig ng-binding']")
    WebElement customerName;

    @FindBy(xpath="//button[normalize-space()='Transactions']")
    WebElement transactionButton;

    @FindBy(xpath="//button[normalize-space()='Deposit']")
    WebElement depositButton;
    
    @FindBy(xpath="//button[normalize-space()='Withdrawl']")
    WebElement withdrawalButton;

    // Initializing the Page Objects:
    public C_AccountPage(){
        PageFactory.initElements(driver, this);
    }

    // Method to get the header name
    public String getHeaderName() {
        return headerName.getText();
    }

    // Method to get the customer name
    public String getCustomerName() {
        return customerName.getText();
    }

    // Method to click on the transaction button and return to the transaction page
    public Transaction_Page clickTransactionButton(){
        transactionButton.click();
        return new Transaction_Page();
    }
    
    // Method to click on the deposit button and return to the deposit page
    public Deposit_Page clickDepositButton(){
        depositButton.click();
        return new Deposit_Page();
    }

    // Method to click on the withdrawal button and return to the withdrawal page
    public Withdraw_Page clickWithdrawButton(){
        withdrawalButton.click();
        return new Withdraw_Page();
    }
}
