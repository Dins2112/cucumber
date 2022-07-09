package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
/**
 * 
 * @author Dell
 * @CreationDate 26/06/2022
 *	@Description TestRunnerClass
 */
 
@RunWith(Cucumber.class)
@CucumberOptions(snippets=SnippetType.CAMELCASE,strict = true, dryRun=false,		
plugin= {"pretty","json:target/cucumber.json"},features ="src/test/resources",glue="com.stepdefinition")

public class TestRunnerClass {
	
	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMreport(System.getProperty("user.dir")+"\\target\\cucumber.json");

	}
	
	
	
}
