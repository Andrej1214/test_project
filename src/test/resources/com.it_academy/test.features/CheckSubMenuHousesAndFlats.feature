Feature:As a user I want to see items of submenu 'Дома и квартиры'

  Scenario: Checking submenu 'Дома и квартиры'
    Given the user opens onliner website
    When the user moves on the "Дома и квартиры" section
    Then submenu with categories cities, number of rooms, price range is displayed