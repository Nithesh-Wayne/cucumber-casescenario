Feature: Signinscenario

Scenario Outline: Login
Given user opens signinn page in TestMeApp
When user enters usernamee as "<uname>"
And user enters passwordd as "<psd>"
Then click loginn

Examples:
|uname|psd|
|lalitha|password123|
