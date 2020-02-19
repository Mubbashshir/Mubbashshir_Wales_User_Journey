/**
 * 
 */
package com.nhs.testrunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @Mubbashshir Mohiuddin
 *  */
@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\User\\eclipse-workspace\\NHSWalesUserJourney\\src\\test\\resource\\features",
                 glue = {"com.nhs.teststeps"},
plugin={ "json:target/cucumber.json",
"html:target/cucumber-reports"})
public class TestRunner {
}


