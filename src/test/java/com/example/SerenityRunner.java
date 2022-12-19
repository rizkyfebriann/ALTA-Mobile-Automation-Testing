package com.example;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    plugin = {"json:build/cucumber.json", "pretty", "html:build/result"},
    features = "src/test/resources/features/",
    glue = "com.example",
    stepNotifications = true,
    tags = "")
public class SerenityRunner {}
