#Author: Adara Drisana Teixeira dos Santos
@test
Feature: Activitie

  Scenario: Create Activitie and validate
    Given I make the post with the data id 22 and title "Activity 22", so validate the return status code is 200
    When I do the GET to id of first step, so validate the title is "Activity 22" and the return status code is 200
    Then to do the GET for all, so validate the return is 200
