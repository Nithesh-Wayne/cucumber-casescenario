$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/skeleton/cartadd.feature");
formatter.feature({
  "name": "add to cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search for the product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens signinnnn page in TestMeApp",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters usernameeee as \"\u003cuname1\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters passwordddd as \"\u003cpsd1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click loginnnn",
  "keyword": "And "
});
formatter.step({
  "name": "user opens the home page after loginn",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on search buttonn",
  "keyword": "And "
});
formatter.step({
  "name": "user enters productnamee as \"Head\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks productt",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks finddetailss button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks addtocart button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "uname1",
        "psd1"
      ]
    },
    {
      "cells": [
        "Lalit7",
        "lalith123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search for the product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens signinnnn page in TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "Addtocart2.user_opens_signinnnn_page_in_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters usernameeee as \"Lalit7\"",
  "keyword": "When "
});
formatter.match({
  "location": "Addtocart2.user_enters_usernameeee_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters passwordddd as \"lalith123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Addtocart2.user_enters_passwordddd_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click loginnnn",
  "keyword": "And "
});
formatter.match({
  "location": "Addtocart2.click_loginnnn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens the home page after loginn",
  "keyword": "And "
});
formatter.match({
  "location": "Addtocart2.user_opens_the_home_page_after_loginn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on search buttonn",
  "keyword": "And "
});
formatter.match({
  "location": "Addtocart2.user_clicks_on_search_buttonn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters productnamee as \"Head\"",
  "keyword": "And "
});
formatter.match({
  "location": "Addtocart2.user_enters_productnamee_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks productt",
  "keyword": "And "
});
formatter.match({
  "location": "Addtocart2.user_clicks_productt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks finddetailss button",
  "keyword": "And "
});
formatter.match({
  "location": "Addtocart2.user_clicks_finddetailss_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks addtocart button",
  "keyword": "Then "
});
formatter.match({
  "location": "Addtocart2.user_clicks_addtocart_button()"
});
formatter.result({
  "status": "passed"
});
});