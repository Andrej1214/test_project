package com.it_academy.test.parallel;

import com.codeborne.selenide.WebDriverRunner;
import com.it_academy.parallel.WebDriverFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class OnFirefoxTest {
    @Test
    public void testExistingOnlinerSite() {
        WebDriver webDriver = WebDriverFactory.setDriver("firefox");
        WebDriverRunner.setWebDriver(webDriver);
        open("https://www.onliner.by/");
        WebDriverRunner.closeWebDriver();
    }
}
