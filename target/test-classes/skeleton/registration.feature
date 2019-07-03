Feature: Registration

Scenario: Registration with valid credentials
Given user opens signup page in TestMeApp
When user enters username as "Lalit6"
And user enters firstname as "Lalith"
And user enters lastname as "Suresh"
And user enters password as "lalith123"
And user enters confirmpassword as "lalith123"
And user selects gender
And user enters email as "lalith123@gmail.com"
And user enters mobilenumber as "9876543210"
And user enters dob as "05/18/1997"
And user enters address as "AnnaNagar,Chennai"
And user enters answer as "Chennai"
Then user clicks register