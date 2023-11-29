package com.bagal.factories;

import com.bagal.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public final class WaitFactory {
    private WaitFactory() {
    }

    public static WebElement waitForElementToBeVisible(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForElementToBeVisible(By locator, int timeout) {
        return getWait(timeout).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private static WebDriverWait getWait() {
            return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
    }
    private static WebDriverWait getWait(int timeout) {
           return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));
    }
}
