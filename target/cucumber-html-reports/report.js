$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/activitieApi.feature");
formatter.feature({
  "name": "Activitie",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Create Activitie and validate",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I make the post with the data id 22 and title \"Activity 22\", so validate the return status code is 200",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivitieApiStep.post(Integer,String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I do the GET to id of first step, so validate the title is \"Activity 22\" and the return status code is 200",
  "keyword": "When "
});
formatter.match({
  "location": "ActivitieApiStep.getId(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to do the GET for all, so validate the return is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivitieApiStep.getAll(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});