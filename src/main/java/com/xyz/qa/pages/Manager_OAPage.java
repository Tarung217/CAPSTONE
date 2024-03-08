package com.xyz.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.xyz.qa.base.TestBase;

public class Manager_OAPage extends TestBase {

    // Page Factory - Object Repository:
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginButton;

    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountButton;

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerNameDropdown;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropdown;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement processButton;

    // Initializing the Page Objects:
    public Manager_OAPage() {
        PageFactory.initElements(driver, this);
    }

    // Method to click the bank manager login button
    public void clickBankManagerLoginButton() {
        bankManagerLoginButton.click();
    }

    // Method to click the open account button
    public void clickOpenAccountButton() {
        openAccountButton.click();
    }

    // Method to select a customer name from the dropdown
    public void selectCustomerName(String customerName) {
        Select customerDropdown = new Select(customerNameDropdown);
        customerDropdown.selectByVisibleText(customerName);
    }

    // Method to select a currency from the dropdown
    public void selectCurrency(String currency) {
        Select currencyDropdownSelect = new Select(currencyDropdown);
        currencyDropdownSelect.selectByVisibleText(currency);
    }

    // Method to click the process button to open the account
    public void clickProcessButton() {
        processButton.click();
    }

    // Method to get the text of the alert message
    public String getAlertMessageText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    // Method to accept the alert
    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
