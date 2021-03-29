package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/Login.feature",
		glue="stepDefinitions",	
		monochrome=true,
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"}
		//tags= {"@SanityTest, @RegressionTest"}
		//tags= {"@RegressionTest","@End2End"}
		//tags= {"~@End2End"}
		//tags= {"~@End2End","~@SanityTest"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
