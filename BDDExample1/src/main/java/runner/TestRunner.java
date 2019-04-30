package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\VJIT\\eclipse\\BDDExample1\\src\\main\\java\\com\\cg\\feature\\login.feature"
		,glue= {"stepDefinition"}
		//
		
		)

public class TestRunner {

}
