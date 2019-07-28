Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<middlename>" and "<lastname>"
Then Close the browser

Examples:
	| username							  | password | firstname  | middlename | lastname |
	| mithunkr0123@gmail.com  | mi321		 | Tom 	 	  	| Peter  		 | chutiya  |
	| mithunkr0123@gmail.com  | mi321		 | David 	  	| Dsouza  	 | dobra 		|