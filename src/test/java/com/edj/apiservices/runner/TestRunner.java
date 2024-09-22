package com.edj.apiservices.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"com.edj.apiservices.stepdefinitions"},
        plugin = {"pretty"},
        publish = true,
        tags = "@smoke" // This will be overridden by the Gradle command
)
public class TestRunner {
    // No additional configurations are necessary for basic setup
}
