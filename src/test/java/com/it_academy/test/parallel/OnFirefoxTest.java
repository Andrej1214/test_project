package com.it_academy.test.parallel;

import com.codeborne.selenide.WebDriverRunner;
import com.it_academy.parallel.WebDriverFactory;
import com.it_academy.test.pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class OnFirefoxTest {
    private HomePage homePage = new HomePage();

    @BeforeClass
    public static void setUp(){
        WebDriver webDriver = WebDriverFactory.setDriver("firefox");
        WebDriverRunner.setWebDriver(webDriver);
    }
    @Test
    public void testExistingSubMenuNews() {
        homePage.openOnlinerWebsite();
        homePage.movePointerOnElementOfMainMenu("Новости");
        assertThat(homePage.verifySubmenuNewsIsDisplayed()).as("Submenu 'Новости' is not displayed").isTrue();
    }

    @Test
    public void testExistingSubMenuHousesAndFlats() {
        homePage.openOnlinerWebsite();
        homePage.movePointerOnElementOfMainMenu("Дома и квартиры");
        assertThat(homePage.verifySubmenuDomaIKvartiryIsDisplayed())
                .as("Submenu 'Дома и квартиры' is not displayed").isTrue();
    }
    @AfterClass
    public static void closeWebBrowser(){
        WebDriverRunner.closeWebDriver();
    }
}
