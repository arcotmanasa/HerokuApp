$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AddElements.feature");
formatter.feature({
  "name": "Add remove elements and count",
  "description": "  Add elements and count",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AddElements"
    }
  ]
});
formatter.scenario({
  "name": "Add remove elements and count",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AddElements"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "a page path \"https://the-internet.herokuapp.com/add_remove_elements/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.AddElements.a_page_path(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on AddElement button add 10 buttons",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AddElements.click_on_AddElement_button_add_buttons(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "count and validate number of elements should be 10",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AddElements.count_and_validate_number_of_elements_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AddElements.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});