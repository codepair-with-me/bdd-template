package com.codepair.processor.cucumber;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Cucumber runner class
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/bdd/features",
        plugin = {"pretty"},
        strict = true,
        monochrome = true,
        glue = {"com/codepair/processor/cucumber/stepdefinitions"},
        tags = {"not @ignore"})
public class ItemProcessorBddRunner {
}
