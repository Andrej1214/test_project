package com.it_academy.test.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class HomePage extends BasePage {
    private static final String ELEMENT_OF_MAIN_MENU_LINK_PATTERN =
            "//div//ul[@class='b-main-navigation']//span[contains(text(),'%s')]";
    private static final String AVTOBARACHOLKA_SUBMENU_LINK_PATTERN =
            "//div[contains(@class,'__dropdown-column_') and .//a[contains(text(),'Автобарахолка')]]";
    private static final String DOMA_I_KVARTIRY_SUBMENU_LINK_PATTERN =
            "//div[contains(@class,'__dropdown-column') and .//a[contains(text(),'Продажа')]]";
    private static final String NEWS_SUBMENU_LINK =
            "//div[contains(@class,'__dropdown-wrapper') and .//a[contains(text(),'Кошелек')]]";

    public void openOnlinerWebsite() {
        open("http://www.onliner.by");
    }

    public void movePointerOnElementOfMainMenu(String value) {
        $x(format(ELEMENT_OF_MAIN_MENU_LINK_PATTERN, value)).shouldBe(visible, ofSeconds(300)).hover();
    }
    public boolean verifySubmenuNewsIsDisplayed() {
        return $x(NEWS_SUBMENU_LINK).shouldBe(visible, ofSeconds(300)).isDisplayed();
    }

    public boolean verifySubmenuAvtobaracholkaIsDisplayed() {
        return $x(AVTOBARACHOLKA_SUBMENU_LINK_PATTERN).shouldBe(visible, ofSeconds(300)).isDisplayed();
    }

    public boolean verifySubmenuDomaIKvartiryIsDisplayed() {
        return $x(DOMA_I_KVARTIRY_SUBMENU_LINK_PATTERN).shouldBe(visible, ofSeconds(300)).isDisplayed();
    }
}
