package com.it_academy.test.cucumber.steps;

import com.it_academy.test.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckingSubMenuOfMainMenuStepDefinition {
    private HomePage homePage = new HomePage();

    @Given("the user opens onliner website")
    public void theUserOpensOnlinerWebsite() {
        homePage.openOnlinerWebsite();
    }

    @When("the user moves on the {string} section")
    public void theUserMovesOnTheSection(String section) {
        homePage.movePointerOnElementOfMainMenu(section);
    }

    @Then("submenu with categories division by price, by city and brand is displayed")
    public void submenuWithCategoriesDivisionByPriceByCityAndBrandIsDisplayed() {
        assertThat(homePage.verifySubmenuAvtobaracholkaIsDisplayed())
                .as("Pointed submenu isn't displayed").isTrue();
    }

    @Then("submenu with categories cities, number of rooms, price range is displayed")
    public void submenuWithCategoriesCitiesNumberOfRoomsPriceRangeIsDisplayed() {
        assertThat(homePage.verifySubmenuDomaIKvartiryIsDisplayed())
                .as("Pointed submenu isn't displayed").isTrue();
    }
}
