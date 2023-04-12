package stepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (strict = true,
        features = {"src/test/resources/features/EComm.feature"},
        tags = {"@smokeTest"},
        plugin = {"pretty","html:target/HtmlReports", "json:target/JSONReports/reports.json", "junit:target/JUnitReports/reports.xml"},
        monochrome = true)

public class TestRunnerPurchase {
}

