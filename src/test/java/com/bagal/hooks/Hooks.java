package com.bagal.hooks;

import com.bagal.driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup(){
        Driver.initDriver();
    }
    @After
    public void tearDown(){
        Driver.quitDriver();
    }

}
