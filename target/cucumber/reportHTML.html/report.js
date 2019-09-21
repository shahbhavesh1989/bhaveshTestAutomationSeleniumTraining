$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Testscenario.feature");
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
  "duration": 23024887600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.i_enter_some_text_in_search_box()"
});
formatter.result({
  "duration": 4203208200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.i_hit_return_key()"
});
formatter.result({
  "duration": 3199531800,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.google_should_display_search_results()"
});
formatter.result({
  "duration": 4403444100,
  "status": "passed"
});
});