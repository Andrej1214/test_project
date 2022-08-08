package com.it_academy.test.cucumber.steps;

import com.codeborne.selenide.Screenshots;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ScreenShotHooks {
    @After
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                Allure.addAttachment("Failed step", new FileInputStream(Screenshots.takeScreenShotAsFile()));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
