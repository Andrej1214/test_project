package com.it_academy.test.remote;

import com.codeborne.selenide.WebDriverRunner;
import com.it_academy.parallel.remote.RemoteWebDriverFactory;
import com.it_academy.test.pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class RemoteInFirefoxTest {
    private HomePage homePage = new HomePage();

    @BeforeClass
    public static void setUp() {
        RemoteWebDriverFactory.setDriver("firefox");
        WebDriver webDriver = RemoteWebDriverFactory.getDriver();
        WebDriverRunner.setWebDriver(webDriver);
    }

    @Test
    public void testExistingSubMenuNews() {
        homePage.openOnlinerWebsite();
        homePage.movePointerOnElementOfMainMenu("Новости");
        assertThat(homePage.displayedSubmenuNews()).as("Submenu 'Новости' is not displayed").isTrue();
    }

    @Test
    public void testExistingSubMenuHousesAndFlats() {
        homePage.openOnlinerWebsite();
        homePage.movePointerOnElementOfMainMenu("Дома и квартиры");
        assertThat(homePage.displayedSubmenuDomaIKvartiry())
                .as("Submenu 'Дома и квартиры' is not displayed").isTrue();
    }

    @AfterClass
    public static void closeWebDriver() {
        WebDriverRunner.closeWebDriver();
    }
}
