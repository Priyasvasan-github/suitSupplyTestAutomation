package com.suitsupply.automation.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Sripriya Srinivasan on 11/1/2018.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/customMade/suite/", glue = "com.suitsupply.automation.stepDefinitions")

public class RunFeaturesTest {

}
