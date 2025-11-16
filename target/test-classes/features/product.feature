Feature: product page validations

  @requiresLogin
  Scenario: verify sorting low to high
    Given user is logged into the SwagLab application
    When user sort product from low to high
    Then product should displayed in ascending order of price

  @requiresLogin
  Scenario: verify sorting of product to low to high
    Given user is logged into the SwagLab application
    When user sort the product from high to low
    Then product should displayed as descending order of price

  @requiresLogin
  Scenario Outline: verify product add to cart
    When user adds product "<product_name>" to the cart
    Then product "<product_name>" should be displayed in the cart

    Examples:
      | product_name            |
      | Sauce Labs Backpack     |
      | Sauce Labs Bolt T-Shirt |
      | Sauce Labs Bike Light   |

  @cart @requiresLogin
  Scenario: add multiple product and remove one
    When user adds multiple products to cart
      | Sauce Labs Backpack     |
      | Sauce Labs Bolt T-Shirt |
      | Sauce Labs Bike Light   |
    And user removes one product "Sauce Labs Bike Light"
    Then cart count should be updated correctly
