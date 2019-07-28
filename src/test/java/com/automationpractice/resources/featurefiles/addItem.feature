@addItemPage
Feature: Add an Item to the Cart

  Scenario: User should able to add Item into Cart
    Given I am on home page
    When I click on women Tab
    And I click on an item
    And I get SKU code of the product
    And I click on Add Cart
    And I close pop up window showing basket preview
    And I click on Cart
    Then I should see Correct SKU added to the basket
