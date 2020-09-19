package com.cedaniel200.app.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/restar.feature"},
        glue = {"com.cedaniel200.app.stepdefinitions"}
)
public class Restar {
}
