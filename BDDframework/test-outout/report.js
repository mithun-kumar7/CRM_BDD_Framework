$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:\\Java_code\\BDDframework\\src\\main\\java\\features\\TaggedHooks.feature");
formatter.feature({
  "line": 1,
  "name": "Test Tagged Hooks",
  "description": "",
  "id": "test-tagged-hooks",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "This is First test",
  "description": "",
  "id": "test-tagged-hooks;this-is-first-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooks_StepDefination.this_is_the_first_step()"
});
formatter.result({
  "duration": 120465962,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooks_StepDefination.this_is_the_second_step()"
});
formatter.result({
  "duration": 80874,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooks_StepDefination.this_is_the_third_step()"
});
formatter.result({
  "duration": 79642,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "This is Second test",
  "description": "",
  "id": "test-tagged-hooks;this-is-second-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooks_StepDefination.this_is_the_first_step()"
});
formatter.result({
  "duration": 87852,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooks_StepDefination.this_is_the_second_step()"
});
formatter.result({
  "duration": 84979,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooks_StepDefination.this_is_the_third_step()"
});
formatter.result({
  "duration": 68969,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "This is Third test",
  "description": "",
  "id": "test-tagged-hooks;this-is-third-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooks_StepDefination.this_is_the_first_step()"
});
formatter.result({
  "duration": 76768,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooks_StepDefination.this_is_the_second_step()"
});
formatter.result({
  "duration": 80873,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooks_StepDefination.this_is_the_third_step()"
});
formatter.result({
  "duration": 63631,
  "status": "passed"
});
});