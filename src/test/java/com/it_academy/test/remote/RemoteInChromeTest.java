package com.it_academy.test.remote;

import com.codeborne.selenide.WebDriverRunner;
import com.it_academy.parallel.remote.RemoteWebDriverFactory;
import com.it_academy.test.pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoteInChromeTest {
    private HomePage homePage = new HomePage();

    @BeforeClass
    public static void setUp() {
        RemoteWebDriverFactory.setDriver("chrome");
        WebDriver webDriver = RemoteWebDriverFactory.getDriver();
        WebDriverRunner.setWebDriver(webDriver);
    }

    @Test
    public void testExistingSubMenuNews() {
        homePage.openOnlinerWebsite();
        homePage.movePointerOnElementOfMainMenu("Новости");
        assertThat(homePage.verifySubmenuNewsIsDisplayed())
                .as("Submenu 'Новости' is not displayed").isTrue();
    }
    @Test
    public void testExistingSubMenuCarMarket() {
        homePage.openOnlinerWebsite();
        homePage.movePointerOnElementOfMainMenu("Автобарахолка");
        assertThat(homePage.verifySubmenuAvtobaracholkaIsDisplayed())
                .as("Submenu 'Автобарахолка' is not displayed").isTrue();
    }

    @AfterClass
    public static void closeWebDriver() {
        WebDriverRunner.closeWebDriver();
    }
}