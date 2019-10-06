Feature: Tagged scenarios

@Smoke
Scenario:
    Given This is smoke only tag test

@Smoke @Regression
Scenario:
    Given This is smoke or regression tag test

@E2E
Scenario:
    Given This is e2e only tag test

Scenario:
    Given This is test having no tag