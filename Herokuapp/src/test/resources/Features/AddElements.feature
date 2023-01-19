@AddElements
Feature: Add remove elements and count
  Add elements and count

  @tag1
  Scenario: Add remove elements and count
    Given a page path "https://the-internet.herokuapp.com/add_remove_elements/"
    When click on AddElement button add 10 buttons
    Then count and validate number of elements should be 10
    And close the browser
  
