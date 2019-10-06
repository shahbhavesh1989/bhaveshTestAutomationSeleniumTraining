$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TaggedScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Tagged scenarios",
  "description": "",
  "id": "tagged-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "tagged-scenarios;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "This is smoke only tag test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsStepDef.this_is_smoke_only_tag_test()"
});
formatter.result({
  "duration": 1026834500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "tagged-scenarios;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "This is e2e only tag test",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 9
    }
  ],
  "location": "TagsStepDef.this_is_e_e_only_tag_test(int)"
});
formatter.result({
  "duration": 5219900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "",
  "id": "tagged-scenarios;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "This is test having no tag",
  "keyword": "Given "
});
formatter.match({
  "location": "TagsStepDef.this_is_test_having_no_tag()"
});
formatter.result({
  "duration": 1367700,
  "status": "passed"
});
formatter.uri("Testscenario.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search Functionality",
  "description": "",
  "id": "google-search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verification of search functionality",
  "description": "",
  "id": "google-search-functionality;verification-of-search-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open the Chrome browser and launch the google url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter some text in search box",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I hit return key",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "google should display search results",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.i_open_the_Chrome_browser_and_launch_the_google_url()"
});
formatter.result({
  "duration": 106323442000,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.i_enter_some_text_in_search_box()"
});
formatter.result({
  "duration": 14165234100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.i_hit_return_key()"
});
formatter.result({
  "duration": 10794977400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.google_should_display_search_results()"
});
formatter.result({
  "duration": 4772592600,
  "status": "passed"
});
});