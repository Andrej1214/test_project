package com.it_academy.test.pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    public BasePage() {
       Configuration.pageLoadTimeout = 60000;
       Configuration.screenshots = true;
    }
}
