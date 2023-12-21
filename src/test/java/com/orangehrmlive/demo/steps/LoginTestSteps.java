package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginTestSteps {

    @Then("^I see Welcome message$")
    public void iSeeWelcomeMessage() {
        Assert.assertEquals( "Dashboard", new LoginPage().verifyLogin());
    }

    @Then("^I see the Orange HRM Logo$")
    public void iSeeTheOrangeHRMLogo() {
        Assert.assertEquals("", new DashboardPage().verifyOrangeLogo());
    }

    @When("^I click on user profile logo$")
    public void iClickOnUserProfileLogo() throws InterruptedException {
        new HomePage().userProfileLogoClick();
    }

    @And("^I mouse hover and click on logout$")
    public void iMouseHoverAndClickOnLogout() throws InterruptedException {
        new HomePage().MouseHoverLogo();
    }

    @Then("^I am logged out and see text Login Panel$")
    public void iAmLoggedOutAndSeeTextLoginPanel() {
        Assert.assertEquals("Login", new LoginPage().getVerifyLogin());
    }

}
