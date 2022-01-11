$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/CumrSelm/CucrSelm/src/main/java/features/ErrorMessage.feature");
formatter.feature({
  "line": 1,
  "name": "Calculator And Tools Funtions",
  "description": "",
  "id": "calculator-and-tools-funtions",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Calculator error message funtion",
  "description": "",
  "id": "calculator-and-tools-funtions;calculator-error-message-funtion",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enter the url \"https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on menu item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on how much i borrow link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enter only the living expense field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on the how much i borrow button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Then User can view error  message \"Based on the details you\u0027ve entered, we\u0027re unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/",
      "offset": 15
    }
  ],
  "location": "Steps.open_the_browser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.click_on_menu_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.click_on_how_much_i_borrow_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.enter_only_the_living_expense_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.click_on_the_how_much_i_borrow_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Based on the details you\u0027ve entered, we\u0027re unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500",
      "offset": 35
    }
  ],
  "location": "Steps.then_User_can_view_error_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});