package com.xyz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xyz.qa.base.TestBase;

public class Manager_CPage extends TestBase {

    // Page Factory - Object Repository:
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginButton;

    @FindBy(xpath = "//button[normalize-space()='Customers']")
    WebElement customersButton;

    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement searchCustomerInput;

    @FindBy(xpath = "//td[normalize-space()='Hermoine']")
    WebElement firstName;

    

    @FindBy(xpath = "//button[normalize-space()='Delete']")
    WebElement deleteButton;

    // Initializing the Page Objects:
    public Manager_CPage() {
        PageFactory.initElements(driver, this);
    }

    // Method to click the bank manager login button
    public void clickBankManagerLoginButton() {
        bankManagerLoginButton.click();
    }

    // Method to click the customers button
    public void clickCustomersButton() {
        customersButton.click();
    }

    // Method to search for a customer using the search input field
    public void searchCustomer(String customerName) {
        searchCustomerInput.sendKeys(customerName);
    }

    // Method to get the first name of the customer
    public String getFirstName() {
        return firstName.getText();
    }

  

    // Method to click the delete button to delete the customer
    public void clickDeleteButton() {
        deleteButton.click();
        
    }
}
