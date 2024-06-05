package BackgroundPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Background", glue= {"BackgroundPackage"},
monochrome = true,
plugin = {"json:target/cucumber.json"}
//plugin = {"pretty", "html:target/HtmlReport/report.html"}
//plugin = {"pretty", "json:target/JsonReport/Report.json"},
//plugin = {"pretty", "junit:target/xmlReport/Report.xml"}
//plugin = {"pretty", "junit:target/xmlReport/Report.xml","json:target/JsonReport/Report.json","html:target/HtmlReport/report.html"}
//tags = "(@regression) or @regression"
)
public class TestRunnerClassBackgroundDemo {

	
}
