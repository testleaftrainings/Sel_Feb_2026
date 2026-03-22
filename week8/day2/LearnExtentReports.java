import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		//set up the report path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		//maintain the history
		reporter.setAppendExisting(true);
		//instantiate the ExtentReports
		ExtentReports extent=new ExtentReports();
		//attach the file to the reporter
		extent.attachReporter(reporter);
		
		//create a testcase and assign all the testcase detials
		ExtentTest test=extent.createTest("createLead", "Create lead with mandotaory details");
		//assign the values for the testcase
		test.assignAuthor("Saranya");
		test.assignCategory("Regression testing");
		//attach the steplevel status
		test.pass("lead has created sucessfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/homepage.png").build());
		test.fail("lead is not created sucessfully");
		//mandotary step
		extent.flush();
		System.out.println("completed");
	}

}
