$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AdoptAvailablePuppy.feature");
formatter.feature({
  "line": 1,
  "name": "Adoption process",
  "description": "",
  "id": "adoption-process",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4497952478,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to adopt Topsy",
  "description": "",
  "id": "adoption-process;user-should-be-able-to-adopt-topsy",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@priority_1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user has opened http://puppies.herokuapp.com/ page in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user should see \"Brook\" puppy available on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks View Details Button by \"Brook\" puppy",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should see a puppy\u0027s photo displayed on the page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Adopt Me! button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks Complete the Adoption Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user fills out fields with the following information",
  "rows": [
    {
      "cells": [
        "Name",
        "Address",
        "Email",
        "Payment Type"
      ],
      "line": 12
    },
    {
      "cells": [
        "John Doe",
        "333 Michigan St., Chicago, IL 60000",
        "john@gmail.com",
        "Check"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "place oder button should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AdoptAvailableDogSteps.user_has_opened_http_puppies_herokuapp_com_page_in_the_browser()"
});
formatter.result({
  "duration": 2451706692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brook",
      "offset": 17
    }
  ],
  "location": "AdoptAvailableDogSteps.userShouldSeePuppyAvailableOnThePage(String)"
});
formatter.result({
  "duration": 2240941478,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brook",
      "offset": 36
    }
  ],
  "location": "AdoptAvailableDogSteps.userClicksViewDetailsButtonByPuppy(String)"
});
formatter.result({
  "duration": 2696978763,
  "status": "passed"
});
formatter.match({
  "location": "AdoptAvailableDogSteps.user_should_see_a_puppy_s_photo_displayed_on_the_page()"
});
formatter.result({
  "duration": 2185607725,
  "status": "passed"
});
formatter.match({
  "location": "AdoptAvailableDogSteps.user_clicks_on_Adopt_Me_button()"
});
formatter.result({
  "duration": 2877044496,
  "status": "passed"
});
formatter.match({
  "location": "AdoptAvailableDogSteps.user_clicks_Complete_the_Adoption_Button()"
});
formatter.result({
  "duration": 2734324121,
  "status": "passed"
});
formatter.match({
  "location": "AdoptAvailableDogSteps.user_fills_out_fields_with_the_following_information(DataTable)"
});
formatter.result({
  "duration": 9090177931,
  "status": "passed"
});
formatter.match({
  "location": "AdoptAvailableDogSteps.place_oder_button_should_be_displayed()"
});
formatter.result({
  "duration": 2250638837,
  "status": "passed"
});
formatter.after({
  "duration": 2271423875,
  "status": "passed"
});
formatter.uri("features/MainPageElementsAreDisplayed.feature");
formatter.feature({
  "line": 1,
  "name": "Presence of Required WebElements on the Page",
  "description": "",
  "id": "presence-of-required-webelements-on-the-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2593756528,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user has opened http://puppies.herokuapp.com/ page in the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "AdoptAvailableDogSteps.user_has_opened_http_puppies_herokuapp_com_page_in_the_browser()"
});
formatter.result({
  "duration": 2310569510,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User should be able to see the Header on the main page",
  "description": "",
  "id": "presence-of-required-webelements-on-the-page;user-should-be-able-to-see-the-header-on-the-main-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@priority_2"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user should see \"Home of the Happy Puppy\" header",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Home of the Happy Puppy",
      "offset": 17
    }
  ],
  "location": "MainPageElementsArePresent.user_should_see_header(String)"
});
formatter.result({
  "duration": 2139208872,
  "status": "passed"
});
formatter.after({
  "duration": 1572195077,
  "status": "passed"
});
formatter.before({
  "duration": 2658552089,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user has opened http://puppies.herokuapp.com/ page in the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "AdoptAvailableDogSteps.user_has_opened_http_puppies_herokuapp_com_page_in_the_browser()"
});
formatter.result({
  "duration": 2000524448,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should be able to see the search field",
  "description": "",
  "id": "presence-of-required-webelements-on-the-page;user-should-be-able-to-see-the-search-field",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@priority_3"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user should see search field",
  "keyword": "Then "
});
formatter.match({
  "location": "MainPageElementsArePresent.user_should_see_search_field()"
});
formatter.result({
  "duration": 2178900702,
  "status": "passed"
});
formatter.after({
  "duration": 1631387090,
  "status": "passed"
});
});