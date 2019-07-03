Feature: add to cart

Scenario Outline: Search for the product
Given user opens signinnnn page in TestMeApp
When user enters usernameeee as "<uname1>"
And user enters passwordddd as "<psd1>"
And click loginnnn
And user opens the home page after loginn
And user clicks on search buttonn
And user enters productnamee as "Head"
And user clicks productt
And user clicks finddetailss button
Then user clicks addtocart button

Examples:
|uname1|psd1|
|Lalit7|lalith123|