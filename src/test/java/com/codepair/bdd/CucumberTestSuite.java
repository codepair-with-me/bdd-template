package com.codepair.bdd;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Cucumber runner class
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = {"pretty"},
        strict = true,
        monochrome = true,
        glue = {"com/codepair/bdd/stepdefinitions"},
        tags = {"not @ignore"})
public class CucumberTestSuite {

}
