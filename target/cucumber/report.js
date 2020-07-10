$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/alsoEnergy.feature");
formatter.feature({
  "name": "Testing of avaliability of google",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Validate the google is up",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navigates to \"https://www.google.com/\" google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.navigates_to_google_homepage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that page status code is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_that_page_status_code_is(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the current url is \"https://www.google.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_the_current_url_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the current page title is \"Google\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_the_current_page_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verfiy the search button is available",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verfiy_the_search_button_is_available()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});