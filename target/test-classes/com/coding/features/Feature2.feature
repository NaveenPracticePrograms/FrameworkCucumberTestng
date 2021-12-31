Feature: Validate the Testcases 3 & 4 given in the Email 

@Testcase3	
Scenario:
Launch the Application and validate the Multiple Windows 
	Given User launches the application and clicks on "Multiple Windows" 
	When User clicks on the link on multiple page window
	Then User should log the URL of the newly opened tab
	And User close the newly opened tab 
	And User logs and validates the title of the current page 
	
@Testcase4	
Scenario:
Launch the Application and validate the Drag And Drop 
	Given User launches the application and clicks on "Drag and Drop" 
	When User Should drag box A and drops it on box b
	Then Validate whether the box drop is success and take a screenshot	