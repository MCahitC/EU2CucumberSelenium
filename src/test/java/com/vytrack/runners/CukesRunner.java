package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //this annotation will run our feature files with Junit
@CucumberOptions(
        plugin = {"json:target\\cucumber.json",
        "html:target/default-html-reports",
        "rerun:target/rerun.txt"},
        features = "src\\test\\resources\\features",
        glue = "com\\vytrack\\step_definitions",
        dryRun = false ,                                //dry run checks if we have defined step definitions for each scenario without us having to exit the full java code each time which can be very long
                                                        //if dry run = false then it will execute all the java code
        tags = "@wip"
        //tags allows us to choose specific scenarios we want to run, using the tags we put here and corresponding tags in the feature file.
                                                        //if you want to run everything in the feature file just add a tag at the top of the feature file
                                                        // use "and" "or" syntax to define more than one tag to run
)
public class CukesRunner {
}
