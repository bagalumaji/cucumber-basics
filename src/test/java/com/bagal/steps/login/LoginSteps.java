package com.bagal.steps.login;

import com.bagal.pages.HomePage;
import com.bagal.pages.IndexPage;
import com.bagal.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.bagal.utils.PropertyUtil.getValue;
import static org.testng.Assert.assertTrue;

public class LoginSteps {
    private static final LoginPage LOGIN_PAGE = new LoginPage();
    private static final IndexPage INDEX_PAGE = new IndexPage();

    @Given("user navigates to the website")
    public void userNavigatesToTheWebsite() {
        boolean pageLoaded = INDEX_PAGE.isPageLoaded();
        assertTrue(pageLoaded);

    }

    @When("user click on login link")
    public void userClickOnLoginLink() {
        LoginPage loginPage = INDEX_PAGE.clickOnLoginLink();
        assertTrue(loginPage.isPageLoaded());
    }

    @And("user enter username")
    public void userEnterUsername() {
        LOGIN_PAGE.typeUserName(getValue("username"));
    }

    @And("user enter password")
    public void userEnterPassword() {
        LOGIN_PAGE.typePassword(getValue("password"));
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        LOGIN_PAGE.clickOnLoginButton();
    }

    @Then("user landing on home page")
    public void userLandingOnHomePage() {
        boolean pageLoaded = new HomePage().isPageLoaded();
        assertTrue(pageLoaded);
    }

    @And("user enter {string} username")
    public void userEnterUsername(String username) {
        LOGIN_PAGE.typeUserName(username);
    }

    @And("user enter {string} password")
    public void userEnterPassword(String password) {
        LOGIN_PAGE.typePassword(password);
    }
}
