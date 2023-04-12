Feature: Successful buying the goods
  As a registered user
  I want to select and buy items from the web.

  @smokeTest
  Scenario: Successful buying the items
    Given I am on the login page
    When I enter my name and password
    And I click login button
    Then I should be redirected on the dashboard page


    Given I am on the dashboard
    And I select the goods
    When I click the icon on the corner
    Then I should be on the cart page


    Given I am on the cart page and see my selected goods list
    When I click the button
    Then I should be redirected to the purchase information page


    Given I am on the purchase information page
    When I enter my first name, last name, and postal code
    Then I should be redirected to the overview page


    Given I am on the overview page
    When I see my selected goods list
    Then I should be redirected to the finish page and purchase complete