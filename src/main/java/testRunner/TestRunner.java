
	package testRunner;
	//This is my test runner class

	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="D:\\CumrSelm\\CucrSelm\\src\\main\\java\\features\\ErrorMessage.feature",
			glue="stepDefinations",
			dryRun=true,
			monochrome=true,
			plugin= {"pretty","html:test-output"}
			)


	public class TestRunner {

	}


