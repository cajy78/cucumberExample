@Swiggy
Feature: Dishes or Restaurant search

	@Sanity
  Scenario: Search for restaurant or dishes
    Given user accesses swiggy website
    When user selects search and enteres dish or restaurant names
    Then results should display either dishes or restaurants in location
    And user enters location
