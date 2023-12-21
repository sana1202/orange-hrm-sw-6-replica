package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement displayLogo;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement userProfileLogo;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement mouseHover;
    @CacheLookup
    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
    WebElement pIM;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul[1]/li[3]/a[1]/span[1]")
    WebElement leave;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-sidepanel-body']/ul[1]/li[8]/a[1]")
    WebElement dashboard;

    public String displayLogoHome() {
        log.info("Verifying Homepage Logo: " + displayLogo.toString());
        return getTextFromElement(displayLogo);
    }

    public void userProfileLogoClick() throws InterruptedException {
        log.info("Clicking on user profile logo: " + userProfileLogo.toString());
        Thread.sleep(500);
        clickOnElement(userProfileLogo);
    }

    public void MouseHoverLogo() throws InterruptedException {
        log.info("Clicking on Log Out: " + mouseHover.toString());
        Thread.sleep(500);
        mouseHoverToElementAndClick(mouseHover);
    }

    public void PIMClick() {
        log.info("Clicking on pIM: " + pIM.toString());
        clickOnElement(pIM);
    }

    public void LeaveClick() {
        log.info("Clicking on Leave: " + leave.toString());
        clickOnElement(leave);
    }

    public void ClickDashboard() {
        log.info("Clicking on Dashboard: " + dashboard.toString());
        clickOnElement(dashboard);
    }

}
