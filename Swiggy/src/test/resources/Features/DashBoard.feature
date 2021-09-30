Feature: Swiggy DashBoard Validation

Scenario: Login Button Validation
    Given user lauanch the swiggy application "url"
    And user valiadtes the page tittle
   Then user click on login button
    And login page should be displayed 
    
    
Scenario: SignUp Button Validation
    Given user lauanch the swiggy application "url"
    And user valiadtes the page tittle
   Then user click on signUp button
    And signup should be displayed
    
Scenario: findFood Button Validation without selecting location
    Given user lauanch the swiggy application "url"
    And user valiadtes the page tittle
   Then user click on findFood button
   And  and user validate the meassage for deleviery location 
   
Scenario: locateMe Button Validation without selecting location
    Given user lauanch the swiggy application "url"
    And user valiadtes the page tittle
   When user click on locateMe button
   Then user valiadtes the page tittle