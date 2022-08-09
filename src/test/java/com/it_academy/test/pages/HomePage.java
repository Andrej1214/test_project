package com.it_academy.test.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class HomePage extends BasePage {
    private static final String ELEMENT_OF_MAIN_MENU_LINK_PATTERN =
            "//div//ul[@class='b-main-navigation']//span[contains(text(),'%s')]";
    private static final String ELEMENT_SUBMENU_LINK_PATTERN =
            "//div[contains(@class,'__dropdown-column_') and .//a[contains(text(),'%s')]]";

    public void openOnlinerWebsite() {
        open("http://www.onliner.by");
    }

    public void movePointerOnElementOfMainMenu(String value) {
        $x(format(ELEMENT_OF_MAIN_MENU_LINK_PATTERN, value)).shouldBe(visible, ofSeconds(300)).hover();
    }
    public boolean verifySubmenuNewsIsDisplayed() {
        return $x(format(ELEMENT_SUBMENU_LINK_PATTERN,"Новости"))
                .shouldBe(visible, ofSeconds(300)).isDisplayed();
    }

    public boolean verifySubmenuAvtobaracholkaIsDisplayed() {
        return $x(format(ELEMENT_SUBMENU_LINK_PATTERN,"Автобарахолка"))
                .shouldBe(visible, ofSeconds(300)).isDisplayed();
    }

    public boolean verifySubmenuDomaIKvartiryIsDisplayed() {
        return $x(format(ELEMENT_SUBMENU_LINK_PATTERN,"Дома и квартиры"))
                .shouldBe(visible, ofSeconds(300)).isDisplayed();
    }
}
