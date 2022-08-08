package com.it_academy.test.parallel;

import com.codeborne.selenide.WebDriverRunner;
import com.it_academy.parallel.WebDriverFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class OnChromeTest {
    @Test
    public void testExistingOnlinerMenu() {
        WebDriver webDriver = WebDriverFactory.setDriver("chrome");
        WebDriverRunner.setWebDriver(webDriver);
        open("https://www.onliner.by/");
        WebDriverRunner.closeWebDriver();
    }
}
