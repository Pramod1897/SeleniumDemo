package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\lenovo\\eclipse-workspace\\com\\src\\test\\java\\features\\nametest.feature"
		,glue= {"seleniumgluecode/"}
)






public class testrunner {

}
