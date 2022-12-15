package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.baseclass.BaseClass;
import com.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		         plugin = {"pretty","json:target/Output.json"},
		         snippets = SnippetType.CAMELCASE,
		         dryRun = false,
		         features="src\\test\\resources\\Features",
                 glue="com.stepdefinition",
                 monochrome =true
		
		)
public class RunnerClass extends BaseClass{

	@AfterClass
	public static void jsonReport() {

		Reporting.generateJVM(getProjectPath()+"\\target\\Output.json");
	}
}
