Feature: login page checking
Scenario: login testing
Given user is logging in
When title of login page is something
Then user enters username and password
Then click on login button
Then user is on home page



Feature: logout page checking
Scenario: logout testing
Given user is logout  in
When title of logout page is something
Then user enters username and password
Then click on logout button
Then user is on home page