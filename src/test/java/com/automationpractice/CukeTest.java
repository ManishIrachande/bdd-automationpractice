package com.automationpractice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Manishkumar Irachande
 **/

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty","html:target/cucumber-reports"},
        tags = "@registerPage,@addItemPage",
        monochrome = true
)



public class CukeTest {
}
