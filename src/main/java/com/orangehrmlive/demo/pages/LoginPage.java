package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement verifyLogin;
    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameField;
    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashBoard;

    public String getVerifyLogin() {
        log.info("Verifying Login Text: " + verifyLogin.toString());
        return getTextFromElement(verifyLogin);

    }

    public void enterUsername(String email) {
        log.info("Enter User Name: " + email.toString());
        sendTextToElement(usernameField, email);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on Login Button: " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public void enterPassword(String password) {
        log.info("Enter Password: " + password);
        sendTextToElement(passwordField, password);
    }

    public void LoginToApplication(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickOnLoginButton();
    }

    public String verifyLogin() {
        log.info("Verifying Login: " + dashBoard.toString());
        return getTextFromElement(dashBoard);
    }

}
