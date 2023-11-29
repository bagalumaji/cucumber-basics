package com.bagal.pages;

import com.bagal.pageactions.PageAction;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final By TEXT_BOX_USER_NAME =By.id("uid");
    private static final By TEXT_BOX_PASSWORD =By.id("passw");
    private static final By BTN_LOGIN =By.name("btnSubmit");


    @Override
    public boolean isPageLoaded() {
        return PageAction.isDisplayed(TEXT_BOX_USER_NAME);
    }

    public void performLoginToApplication(String userName, String password){

    }

    private LoginPage typeUserName(String userName){

        return this;
    }
    private LoginPage typePassword(String password){

        return this;
    }

    private void clickOnLoginButton(){
        PageAction.waitForElementToBeVisibleAndClick(BTN_LOGIN);
    }
}
