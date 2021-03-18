package com.codepair.bdd.stepdefinitions;

import com.codepair.TemplateImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class TemplateSteps {

    @Autowired
    TemplateImpl templateImpl;

    String response;

    @Given("{string} to my application")
    public void to_my_application(String string) {
      log.info("Running for request " + string);
    }

    @When("{string} is processed")
    public void is_processed(String string) {
        response = templateImpl.getResponse(string);
    }

    @Then("{string} is generated")
    public void is_generated(String string) {
        Assert.assertEquals("We expect actual matches expected", string, response);
    }
}
