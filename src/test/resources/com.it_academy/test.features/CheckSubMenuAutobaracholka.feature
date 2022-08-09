Feature:As a user I want to see items of submenu 'Автобарахолка'

  Scenario: Checking submenu 'Автобарахолка'
    Given the user opens onliner website
    When the user moves on the "Автобарахолка" section
    Then submenu with categories division by price, by city and brand is displayed