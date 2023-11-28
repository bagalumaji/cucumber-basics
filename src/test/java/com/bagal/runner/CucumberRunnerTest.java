package com.bagal.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"com.bagal.steps"},
        plugin = {"html:target/report/index.html"
        }
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
