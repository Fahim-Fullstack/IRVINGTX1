
Feature: Create a New Account in Dell

@newAccount
Scenario Outline: Dell New Account Validation
 
    Given open  url
    When click Signin button
    Then Create an account 
    And Send "<FirstName>" , "<LastName>", "<Email>" , "<Password>"
    And click Create account button
    
   Examples:  
   
| FirstName | LastName | Email 								 	| Password 	|
| dell      | Laptop	 | fahim.acca99@yahoo.com | Demo123045 |