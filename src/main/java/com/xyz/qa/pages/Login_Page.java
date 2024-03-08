package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.xyz.qa.base.TestBase;

public class Login_Page extends TestBase {

    // Page Factory - Object Repository:
    @FindBy(xpath="//button[contains(text(),'Customer Login')]")
    WebElement customerLoginBtn;
    
    @FindBy(xpath="//select[@id='userSelect']")
    WebElement namedropdown;

    @FindBy(xpath="//button[normalize-space()='Login']")
    WebElement loginButton;  
    
    @FindBy(xpath="//button[normalize-space()='Logout']")
    WebElement logoutButton;

    // Initializing the Page Objects:
    public Login_Page(){
        PageFactory.initElements(driver, this);
    }
    
    // Method to perform customer login
    public void customerLogin(){
        customerLoginBtn.click();
    }
    
    
    public String loginPageTitle() {
        return driver.getTitle();
    }
    
    // Method to select a customer from the dropdown
    public void selectCustomer(String customerName){
        Select select = new Select(namedropdown);
        select.selectByVisibleText(customerName);
    }
    
    // Method to click the login button
    public void clickLoginButton(){
        loginButton.click();
    }
    
    // Method to login as a customer and return the customer account page
    public C_AccountPage loginAsCustomer(String customerName) {
        customerLogin();
        selectCustomer(customerName);
        clickLoginButton();
        return new C_AccountPage();
    }           
}
