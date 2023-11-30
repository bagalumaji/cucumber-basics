package com.bagal.pages;

import com.bagal.constants.HomePageConstants;
import com.bagal.pageactions.PageAction;
import com.bagal.utils.XpathUtil;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private static final String HELLO_USER_NAME_XPATH="//h1[normalize-space()='Hello %s']";
    @Override
    public boolean isPageLoaded() {
        return PageAction.isDisplayed(By.xpath(XpathUtil.createXpath(HELLO_USER_NAME_XPATH,HomePageConstants.JOHN_SMITH)));
    }
}
