Feature: Search
Description: Alex, an elite user of TestMeApp, purchase most of his products from TestMeApp.Being an elite user,he gets lot of rewards and offers.One day Alex logins in TestMeApp and use search functionality to purchase Head Phone. He found that the search engine is very fast and accurate and purchase is done in just a min


Scenario Outline: Search for the product
Given user opens signinnn page in TestMeApp
When user enters usernameee as "<uname1>"
And user enters passworddd as "<psd1>"
And click loginnn
And user opens the home page after login
And user clicks on search button
And user enters productname as "Head"
And user clicks product
Then user clicks finddetails button

Examples:
|uname1|psd1|
|Lalit7|lalith123|
