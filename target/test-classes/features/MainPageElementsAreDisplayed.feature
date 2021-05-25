Feature: Presence of Required WebElements on the Page

  Background:
    Given user has opened http://puppies.herokuapp.com/ page in the browser

  @priority_2
  Scenario: User should be able to see the Header on the main page
    Then user should see "Home of the Happy Puppy" header

  @priority_3
  Scenario: User should be able to see the search field
    Then user should see search field

