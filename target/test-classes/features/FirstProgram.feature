
Feature: Application Login


Background:
Given setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site



@RegressionTest
Scenario: Admin Page default login

Given User is on Netbanking landing page
When User login into application with "admin" and password "098723"
Then Home Page is displayed
And Card are displayed


@RegressionTest  @SmokeTest
Scenario: User Page default login

Given User is on Netbanking landing page
When User login into application with user and password 098723
Then Home Page is displayed
And Card are displayed



@SmokeTest
Scenario Outline: User Page default login

Given User is on Netbanking landing page
When User login into application with "<Username>" and password "<Password>"
Then Home Page is displayed
And Card are displayed

Examples:
| Username    | Password |
| debituser   | hello@1  |
| credituser  | crdpass  |



@SmokeTest
Scenario Outline: Admin Page default sign up

Given User is on Practice landing page
When User Signup into application
 | sonu |
 | kumar |
 |contatct@gmai.com|
 |789098765|
Then Home Page is displayed
And Card are displayed









