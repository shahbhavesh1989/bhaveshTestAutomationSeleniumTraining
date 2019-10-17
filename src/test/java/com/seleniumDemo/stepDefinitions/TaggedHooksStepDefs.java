/**
 * 
 */
package com.seleniumDemo.stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.*;
import cucumber.api.java.en.*;

/**
 * @author bhaveshs
 *
 */

public class TaggedHooksStepDefs {
	
/*
 * Order of execution will be as following:
 *  1. @Before global hook having order of execution (like order = 0, order = 1 etc.) - this runs in increment order, means value 0 would run first and 1 would be after 0.
 *  2. @Before global hook without any order of execution (no order specified)
 *  3. @Before local hooks that are tagged to scenario (like "@First", "@Second" etc.)
 *  4. Feature file scenario test steps.
 *  5. @After local hooks that are tagged to scenario (like "@First", "@Second" etc.)
 *  6. @After global hook without any order of execution (no order specified)
 *  7. @After global hook with order of execution (like order = 1, order = 0 etc.) - this runs in decrement order (opposite of @Before). Value 1 would run first and 0 would be after 1.
 *
 * NOTE: This order will be followed for each scenario of the feature file as and where applicable.
 *
 */
	
	WebDriver driver;
	
	//Global Hook without any order of execution
	@Before
	public void setup() {
		System.out.println("");
		System.out.println("I am setup() method from @Before without any execution order specified");
	}
	
	//Global Hook without any order of execution
	@After
	public void tearDown() {
		System.out.println("");
		System.out.println("I am tearDown() method from @After without any execution order specified");
	}
	
	//Execution Order Global Hook
	@Before(order=0)
	public void setup1() {
		System.out.println("");
		System.out.println("I am setup(1) method from @Before(order=0)");
	}
	
	//Execution Order Global Hook
	@After(order=0)
	public void tearDown1() {
		System.out.println("");
		System.out.println("I am tearDown1() method from @After(order=0)");
	}
	
	//Execution Order Global Hook
	@Before(order=1)
	public void setup2() {
		System.out.println("");
		System.out.println("I am setup2() method from @Before(order=1)");
	}
	
	//Execution Order Global Hook
	@After(order=1)
	public void tearDown2() {
		System.out.println("");
		System.out.println("I am tearDown2() method from @After(order=1)");
	}
	
	//Local Hook - for scenario that is tagged with @First AND @Third
	@Before ("@First")
	public void setup3() {
		System.out.println("");
		System.out.println("I am setup3() method from @Before ({\"@First\"})");
	}
	
	//Local Hook - for scenario that is tagged with @First AND @Third
	@After ("@First")
	public void tearDown3() {
		System.out.println("");
		System.out.println("I am tearDown3() method from @After ({\"@First\"})");
	}
	
	//Local Hook - for scenario that is tagged with only @Second
	@Before ("@Second")
	public void setup4() {
		System.out.println("");
		System.out.println("I am setup4() method from @Before (\"@Second\")");
	}
	
	//Local Hook - for scenario that is tagged with only @Second
	@After ("@Second")
	public void tearDown4() {
		System.out.println("");
		System.out.println("I am tearDown4() method from @After (\"@Second\")");
	}
		
	@Given("^I am a cucumber tag first test step$")
	public void i_am_a_cucumber_tag_first_test_step() {
			  System.out.println("");
              System.out.println("i_am_a_cucumber_tag_first_test_step");
	}

	@Given("^I am a cucumber tag second test step$")
	public void i_am_a_cucumber_tag_second_test_step() {
		System.out.println("");
		System.out.println("i_am_a_cucumber_tag_second_test_step");
	}

	@Given("^I am a cucumber tag third test step$")
	public void i_am_a_cucumber_tag_third_test_step() {
		System.out.println("");
		System.out.println("i_am_a_cucumber_tag_third_test_step");
	}

	@Given("^I am a cucumber tag fourth test step$")
	public void i_am_a_cucumber_tag_fourth_test_step() {
		System.out.println("");
		System.out.println("i_am_a_cucumber_tag_fourth_test_step");
	}

	@Given("^I am a cucumber tag fifth test step$")
	public void i_am_a_cucumber_tag_fifth_test_step() {
		System.out.println("");
		System.out.println("i_am_a_cucumber_tag_fifth_test_step");
	}

	@Given("^I am a cucumber tag sixth test step$")
	public void i_am_a_cucumber_tag_sixth_test_step() {
		System.out.println("");
		System.out.println("i_am_a_cucumber_tag_sixth_test_step");
	}

	@Given("^I am a cucumber tag seventh test step$")
	public void i_am_a_cucumber_tag_seventh_test_step() {
		System.out.println("");
		System.out.println("i_am_a_cucumber_tag_seventh_test_step");
	}

	@Given("^I am a cucumber tag eighth test step$")
	public void i_am_a_cucumber_tag_eighth_test_step() {
		System.out.println("");
		System.out.println("i_am_a_cucumber_tag_eighth_test_step");
	}

	@Given("^I am a cucumber tag ninth test step$")
	public void i_am_a_cucumber_tag_ninth_test_step() {
		System.out.println("");
		System.out.println("i_am_a_cucumber_tag_ninth_test_step");
	}

	@Given("^I am a cucumber tag tenth test step$")
	public void i_am_a_cucumber_tag_tenth_test_step() {
		System.out.println("");
		System.out.println("i_am_a_cucumber_tag_tenth_test_step");
	}
}