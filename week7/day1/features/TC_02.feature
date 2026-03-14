Feature: create lead for Leaftaps Application

Background:
Given Launch the browser and Load the URL

Scenario Outline: createlead  with multiple data
When Enter the username as 'democsr2'
When Enter the password as 'crmsfa'
When Click on Login button
When Click on crmsfa button
When Click on Leads link
When Click on CreateLeads link
And Enter the Company name as <companyName>
And Enter firstname as <firstName>
And Enter LastName as <lastName>
When click on CreateLead Buttons
Then ViewLeads page is displayed

Examples:
|companyName|firstName|lastName|
|Testleaf|Saranya|S|
|Qeagle|HariPrasad|R|
