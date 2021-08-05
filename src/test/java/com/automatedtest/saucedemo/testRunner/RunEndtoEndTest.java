package com.automatedtest.saucedemo.testRunner;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/com/automatedtest/saucedemo/PurchaseProduct.feature",dryRun=false,
plugin = {"pretty","html:target/cucumber-report/Regression-htmltest",
		"json:target/cucumber-report/RegressionTestReport/RegressionTestResults.json"}, 
glue="com.automatedtest.saucedemo.stepdefinitions",tags={"@End2EndScenario"
		+ ""})

public class RunEndtoEndTest {

}

