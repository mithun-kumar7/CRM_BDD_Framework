Feature: Free CRM Login Feature


#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on login button
#Then user is on home page


#with Examples Keyword
#	Scenario: Free CRM Login Test Scenario
	
#	Given user is already on Login Page
#	When title of login page is Free CRM
#	Then user enters "mithunkr0123@gmail.com" and "9620@shruthi"
#	Then user clicks on login button
#	Then user is on home page
#	Then Close the browser

#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser


Examples:
	| username								 | password 		|
	| mithunkr0123@gmail.com	 | mi321				|
	| tom     								 | test456 			| 