Feature: Validate the Testcases 1 & 2 given in the Email 

@Testcase1
Scenario Outline:
Launch the Application and validate the login with valid and invalid credentials 
	Given User launches the application and clicks on "Form Authentication" 
	When User provides the username and password for "<Usertype>" 
	Then for valid credendtial login successfully else fail with an expected error 
	Examples: 
		|Usertype                |
		|Validuser               |
		|Invalidusername         |
		|Invalidpassword         |
		|InvaliduserAndPassword  |

@Testcase2	
Scenario:
Launch the Application and validate the Dynamic loading Page
	Given User launches the application and clicks on "Dynamic Loading" 
	When User selects the element and clicks on start 
	Then Validate the progress bar and once completed validate the final message
	

