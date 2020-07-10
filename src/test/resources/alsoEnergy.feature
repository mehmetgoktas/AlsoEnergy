@test
Feature: Testing of avaliability of google 

Scenario: Validate the google is up

Given navigates to "https://www.google.com/" google homepage
Then verify that page status code is 200
Then verify the current url is "https://www.google.com/"
Then verify the current page title is "Google"
Then verfiy the search button is available

