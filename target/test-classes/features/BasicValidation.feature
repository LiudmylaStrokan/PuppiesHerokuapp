Feature: Basic validation

  Background:
    Given User have opened fake bar bar challenge
@regression
  Scenario: Validate the Reset Button
    Then user should be able to see and click on Reset Button
@regression
  Scenario: Validate the Weight Button
    Then user should be able to see and click on Weight Button
@regression
  Scenario: Validate the measure results field is displayed
    Then user should see the measure results field

