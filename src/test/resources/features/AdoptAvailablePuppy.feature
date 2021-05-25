gFeature: Adoption process

  @priority_1
  Scenario: User should be able to adopt Topsy
    Given user has opened http://puppies.herokuapp.com/ page in the browser
    Then user should see "Brook" puppy available on the page
    And user clicks View Details Button by "Brook" puppy
    And user should see a puppy's photo displayed on the page
    And user clicks on Adopt Me! button
    And user clicks Complete the Adoption Button
    And user fills out fields with the following information
      | Name     | Address                             | Email          | Payment Type |
      | John Doe | 333 Michigan St., Chicago, IL 60000 | john@gmail.com | Check        |
    Then place oder button should be displayed
