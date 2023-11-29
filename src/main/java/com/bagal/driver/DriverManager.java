package com.bagal.driver;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class DriverManager {
    private DriverManager(){}
    private final static ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    static void setDriver(WebDriver driver){
        if(Objects.nonNull(driver)){
            DRIVER_THREAD_LOCAL.set(driver);
        }
    }

    public static WebDriver getDriver(){
        return DRIVER_THREAD_LOCAL.get();
    }

    public static void unload(){
        DRIVER_THREAD_LOCAL.remove();
    }

}
