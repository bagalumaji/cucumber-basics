package com.bagal.pages;

import com.bagal.pageactions.PageAction;
import org.openqa.selenium.By;

public class IndexPage extends BasePage {
    private final static By LOGIN_LINK = By.id("LoginLink");

    @Override
    public boolean isPageLoaded() {
        return PageAction.isDisplayed(LOGIN_LINK);
    }

    public void clickOnLoginLink(){
        PageAction.waitForElementToBeVisibleAndClick(LOGIN_LINK);
    }
}
