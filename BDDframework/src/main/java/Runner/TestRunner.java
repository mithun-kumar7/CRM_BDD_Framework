package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features= "E:\\Java_code\\BDDframework\\src\\main\\java\\features\\TaggedHooks.feature",
	glue= {"stepDefination"},
	format= {"pretty","html:test-outout","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},	//to generate different types of reporting
	monochrome = true,	//display the console output in a proper readable format
	strict = true, //it will check if any step is not defined in step definition file
	dryRun = false //to check the mapping is proper between feature file and step definition file
			//tags = {"@RegressionTest"}		
		)

public class TestRunner {

}


	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	// To escape particular tags= {"~@RegressionTest"}