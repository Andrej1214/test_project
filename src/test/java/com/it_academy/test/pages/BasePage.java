package com.it_academy.test.pages;

import com.codeborne.selenide.Configuration;

public class BasePage {
    public BasePage() {
       Configuration.pageLoadTimeout = 60000;
       Configuration.screenshots = true;
       Configuration.reportsFolder = "target/allure-results";
    }
}
