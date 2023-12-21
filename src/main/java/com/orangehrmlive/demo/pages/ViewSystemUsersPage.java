package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
    WebElement adminClick;
    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    WebElement verifySystemUserText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement verifyAddUser;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement selectAdminDrop;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]")
    WebElement selectAdmin;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement enterEmpName;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Goutam  Ganesh')]")
    WebElement enterEmpName1;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input[1]")
    WebElement enterUsername;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectStatus;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement selectDisable;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]")
    WebElement selectEnable;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement enterPassword;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement enterConfirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement clickOnSave;

    public void clickAdminLink() {
        log.info("Clicking on Admin: " + adminClick.toString());
        clickOnElement(adminClick);
    }

    public String getSystemUserText() {
        log.info("Verifying System User Text: " + verifySystemUserText.toString());
        return getTextFromElement(verifySystemUserText);
    }

    public void clickAddButton() {
        log.info("Clicking on Add button: " + addButton.toString());
        clickOnElement(addButton);
    }

    public String AddUser() {
        log.info("Verifying User added text: " + verifyAddUser.getText());
        return getTextFromElement(verifyAddUser);
    }

    public void selectAdminRole() throws InterruptedException {
        log.info("Selecting Admin from Admin dropdown: " + selectAdmin.toString());
        clickOnElement(selectAdminDrop);
        Thread.sleep(1000);
        clickOnElement(selectAdmin);
        Thread.sleep(1000);
    }

    public void enterEmp() throws InterruptedException {
        log.info("Entering Employee name: " + enterEmpName1.toString());
        sendTextToElement(enterEmpName, "G");
        Thread.sleep(1000);
        clickOnElement(enterEmpName1);
    }

    public void enterUser() {
        log.info("Entering User: " + enterUsername.toString());
        sendTextToElement(enterUsername, "SanaIldi");
    }

    public void selectDisableOption() throws InterruptedException {
        log.info("Selecting Status Disable: " + selectDisable.toString());
        clickOnElement(selectStatus);
        Thread.sleep(1000);
        clickOnElement(selectDisable);
        Thread.sleep(1000);
    }

    public void selectEnableOption() throws InterruptedException {
        log.info("Selecting Status Enable: " + selectEnable.toString());
        clickOnElement(selectStatus);
        Thread.sleep(1000);
        clickOnElement(selectEnable);
        Thread.sleep(1000);
    }

    public void enterPass() {
        log.info("Entering Password: " + enterPassword.toString());
        sendTextToElement(enterPassword, "Abc_12345");
    }

    public void enterConfirmPass() {
        log.info("Entering Confirm Password: " + enterConfirmPassword.toString());
        sendTextToElement(enterConfirmPassword, "Abc_12345");
    }

    public void clickOnSaveButton() {
        log.info("Clicking on Save: " + clickOnSave.toString());
        clickOnElement(clickOnSave);
    }

}
