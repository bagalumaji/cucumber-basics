package com.bagal.driver;

import com.bagal.factories.DriverFactory;

import java.util.Objects;

public final class Driver {
    private Driver(){}

    public static void initDriver(){
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(DriverFactory.getDriver());
            DriverManager.getDriver().get("https://demo.testfire.net/index.jsp");
        }
    }

    public static void quitDriver(){
    if(Objects.nonNull(DriverManager.getDriver())){
        DriverManager.getDriver().quit();
        DriverManager.unload();
    }
    }
}
