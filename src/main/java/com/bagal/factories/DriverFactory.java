package com.bagal.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.bagal.utils.PropertyUtil.getValue;
import static java.lang.Integer.parseInt;

public final class DriverFactory {
    private DriverFactory(){}

    public static WebDriver getDriver(){
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(parseInt(getValue("pageloadtimeout"))));
        return driver;
    }
}
