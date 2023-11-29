package com.bagal.steps.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user navigates to the website")
    public void userNavigatesToTheWebsite() {
        //Driver.initDriver();
    }

    @When("user click on login link")
    public void userClickOnLoginLink() {
        System.out.println("login link");
    }

    @And("user enter username")
    public void userEnterUsername() {
        System.out.println("username");
    }

    @And("user enter password")
    public void userEnterPassword() {
        System.out.println("pass");
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        System.out.println("login button");
    }

    @Then("user landing on home page")
    public void userLandingOnHomePage() {
        System.out.println("home page");
      //  Driver.quitDriver();
    }

    @And("user enter {string} username")
    public void userEnterUsername(String username) {
        System.out.println("username = " + username);
    }

    @And("user enter {string} password")
    public void userEnterPassword(String password) {
        System.out.println("password = " + password);
    }
}
