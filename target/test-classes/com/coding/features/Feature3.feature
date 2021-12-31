Feature: Validate the Testcases 5 given in the Email 



@Testcase5 
Scenario: 
	Launch the Application and validate the Frames 
	Given User launches the application and clicks on "Frames" 
	When User clicks on iFrame 
	Then User should be able to clear the predefined text and enter some text 
	And User should be able to make the newly entered text in bold and take a screenshot 
	
@Testcase6 
Scenario: 
	Launch the Application and validate the Javascript Alerts 
	Given User launches the application and clicks on "JavaScript Alerts" 
	When User Should clicks on js confirm link 
	Then User should cancel the alert opened and validate the alert cancelled message 
