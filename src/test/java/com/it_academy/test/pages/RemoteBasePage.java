package com.it_academy.test.pages;

import com.codeborne.selenide.Configuration;

public class RemoteBasePage {
    public RemoteBasePage() {
        Configuration.remote = "http://192.168.0.113:4444";
        Configuration.browser = "chrome";
        Configuration.pageLoadTimeout = 60000;
    }
}
