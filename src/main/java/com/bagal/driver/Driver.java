package com.bagal.driver;

import com.bagal.factories.DriverFactory;
import com.bagal.utils.PropertyUtil;

import java.util.Objects;

public final class Driver {
    private Driver(){}

    public static void initDriver(){
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(DriverFactory.getDriver());
            DriverManager.getDriver().get(PropertyUtil.getValue("url"));
        }
    }

    public static void quitDriver(){
    if(Objects.nonNull(DriverManager.getDriver())){
        DriverManager.getDriver().quit();
        DriverManager.unload();
    }
    }
}
