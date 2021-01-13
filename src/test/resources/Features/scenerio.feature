#Author: vijay Kumar <vijay8689@hotmail.com>
#Dated :13/1/2021
#Summary :Exercise calculation check 



Feature: Exercise values calculation check
Description: Exercise calculation check


Background: User logged in Exercise application
Given user naviagte to Exercise app
When user enters userid and password
And user click on login button 
Then user navigated to dashboard screen
 

  Scenario: Exercise1 screen validation 
    When user navigated to values screen 
    Then Verify count of 6 fields values appears on screen
    And Verify values on screen greater than 0
    And Verify total balance is correct based on values listed on screen
    And Verify values currency format
    
    #And Verify total balance matches the sum of values
    # i haven't created stepdefination for above step because . I see it is similar as 3rd condition
    #(Need to verify the total balance is correct based on the values listed on the screen )
    
    
    
    


 