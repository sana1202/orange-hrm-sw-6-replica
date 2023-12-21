package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-topbar-header']/div[1]/span[1]/h6[1]")
    WebElement dashboardPage;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement orangeLogo;

    public String VerifyDashboardPage() {
        log.info("Verifying Dashboard Page: " + dashboardPage.toString());
        return getTextFromElement(dashboardPage);
    }

    public String verifyOrangeLogo(){
        log.info("Verifying Orange HRM Logo: " + orangeLogo.toString());
        return getTextFromElement(orangeLogo);
    }

}
