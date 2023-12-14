package com.swaglab.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//swaglab//feature//swaglab.feature", glue ="com.swaglab.step",
plugin = "json:Report/Cucumber.json")



public class Test_Runner {
	
	
	

}
