package com.bagal.steps.login;

import com.bagal.pages.IndexPage;
import com.bagal.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("user navigates to the website")
    public void userNavigatesToTheWebsite() {
        boolean pageLoaded = new IndexPage().isPageLoaded();
        Assert.assertTrue(pageLoaded);

    }

    @When("user click on login link")
    public void userClickOnLoginLink() {
        LoginPage loginPage = new IndexPage().clickOnLoginLink();
        Assert.assertTrue(loginPage.isPageLoaded());
    }

    @And("user enter username")
    public void userEnterUsername() {
       new LoginPage().typeUserName("jsmith");
    }

    @And("user enter password")
    public void userEnterPassword() {
        new LoginPage().typePassword("demo1234");
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
       new LoginPage().clickOnLoginButton();
    }

    @Then("user landing on home page")
    public void userLandingOnHomePage() {
        System.out.println("home page");

    }

    @And("user enter {string} username")
    public void userEnterUsername(String username) {
        new LoginPage().typeUserName(username);
    }

    @And("user enter {string} password")
    public void userEnterPassword(String password) {
        new LoginPage().typePassword(password);
    }
}
