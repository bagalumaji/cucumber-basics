package com.bagal.pageactions;

import com.bagal.factories.WaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

public final class PageAction {
    private PageAction(){}

    public static void waitForElementToBeVisibleAndClick(By locator){
        WaitFactory.waitForElementToBeVisible(locator).click();
    }
    public static void waitForElementToBeVisibleAndClick(By locator,int timeout){
        WaitFactory.waitForElementToBeVisible(locator,timeout).click();
    }
    public static void waitForElementToBeVisibleAndType(By locator,String value){
        WaitFactory.waitForElementToBeVisible(locator).sendKeys(value);
    }
    public static void waitForElementToBeVisibleAndType(By locator,String value,int timeout){
        WaitFactory.waitForElementToBeVisible(locator,timeout).sendKeys(value);
    }
    public static boolean isDisplayed(By locator){
        try{
            return WaitFactory.waitForElementToBeVisible(locator).isDisplayed();
        }catch (TimeoutException e){
            return false;
        }
    }

    public static boolean isDisplayed(By locator,int timeout){
        try{
            return WaitFactory.waitForElementToBeVisible(locator,timeout).isDisplayed();
        }catch (TimeoutException e){
            return false;
        }
    }
}
