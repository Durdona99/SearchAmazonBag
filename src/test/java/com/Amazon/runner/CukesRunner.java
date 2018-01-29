package com.Amazon.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin="",
		features="src/test/resources/feature/searchBag.feature",
		glue="com/Amazon/Step_definitions",
		//tags="",
		dryRun=false
		)




		
		
		
		


public class CukesRunner {

}
