package com.it_academy.test.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true,
        glue = "com.it_academy.test.cucumber.steps",
        features = "src/test/resources/com.it_academy.test.features"
)
public class CucumberRunnerTest {
}
