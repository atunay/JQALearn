Feature: E-commerce website
  As a registered user
  I want to select a goods to add them to the cart's list
  So that I can purchase them later

  Background:
    Given I am logged in

  Scenario: Selecting a good
    Given I am on the dashboard page
    When I select a good by clicking the "Add to cart" button
    And I click the "Cart" icon on the page
    Then I should be redirected to the cart page

  Scenario: Checking the list of selected goods
    Given I am on the cart page and see my selected goods list
    When I click the "Checkout" button
    Then I should be redirected to the purchase information page

  Scenario: Entering personal purchase data
    Given I am on the purchase information page
    When I enter my first name, last name, and postal code
    And I click the "Continue" button
    Then I should be redirected to the overview page

  Scenario: Checking all necessary information about purchase
    Given I am on the overview page
    And I see my selected goods list
    When I click the "Finish" button
    Then I should be redirected to the finish page and purchase complete