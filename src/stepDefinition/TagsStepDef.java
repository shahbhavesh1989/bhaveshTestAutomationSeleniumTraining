package stepDefinition;

import cucumber.api.java.en.Given;

public class TagsStepDef {

    @Given("^This is smoke only tag test$")
    public void this_is_smoke_only_tag_test() {}

    @Given("^This is smoke or regression tag test$")
    public void this_is_smoke_or_regression_tag_test() {}

    @Given("^This is e(\\d+)e only tag test$")
    public void this_is_e_e_only_tag_test(int arg1) {}

    @Given("^This is test having no tag$")
    public void this_is_test_having_no_tag() {}
}
