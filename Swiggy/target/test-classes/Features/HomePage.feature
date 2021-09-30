Feature: SignIn in swiggy application
Scenario: signin in swiggy application with register mob number
Given user lauanch the swiggy application "url"
And user valiadtes the page tittle
When user click on locateMe button
Then user valiadtes the page tittle
When user clicks on sigin button
Then login page should be displayed 
And user enters the phone number
And user click on loginbutton
Then enter otp page will open


Scenario: signin in swiggy application with un-register mob number
Given user lauanch the swiggy application "url"
And user valiadtes the page tittle
When user click on locateMe button
Then user valiadtes the page tittle
When user clicks on sigin button
Then login page should be displayed 
And user enters the unregister phone number
And user click on loginbutton
Then signup should be displayed