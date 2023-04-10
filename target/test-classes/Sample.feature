Feature: To validate the login functionality of Facabook application

Scenario: To validate login with valid username and invalid password
Given To launch the chrome browser and maximize window
When To launch the url of the facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check wheather navigate to the homepage or not
Then To close the browser	

Scenario Outline: To validate the positive and negative combination of login funtionality
Given User has to launch the browser and maximize the window
When User has to hit the facebook url
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click login button
Then User has to close the browser

Examples:
|emaildatas        |passworddatas|
|selenium@gmail.com|Inmakes|
|123@gmail.com     |6548498|
|java@gmail.com    |3165498|
|inmakes@gmail.com |254686831654|
|testing@gmail.com |65469879798|



