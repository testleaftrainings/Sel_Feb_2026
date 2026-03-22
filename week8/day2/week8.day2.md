2:40 to 3:00 --->ExtentReports
3:00 to 4:00 --->ExtentReportIntegration
4:00 to 4:10 --->Break
4:10 to 5:10 --->HybridFramework
5:10 to 5:40 --->BreakOut
5:40 to 6:00 --->Recap

PreRequisites:
-Add AventStack library in pom.xml
  -ExtentHtmlReporter
  -ExtentReports
  -ExtentTest

   throw and throws keyword:
throw is used to throw an exception at a specific point in a code
throws is used to declare that a method acn throw certain exceptions, allowing the calling method to handle them appropriately
 


Framework:
 -An architect having 8+years of experience
   IDE,TOOL,LANGUAGE,LIBRARIES
1)Description:(Overview of framework)
 -Hybrid(Testng+Bdd)
 -Design pattern:POM
 -Selenium Webdriver-UI 
 -Project Management tool--->Maven--->eay mangement of dependencies
 -libraries:
   -ApachePoi--->ExcelIntegration
   -cOmmons-IO--->ScreenShot
   -AventStack-ExtentReports
   -Testng--->TEts executions
   -Cucumber--->supports BDD
 -Exception Handling---used try/Catchblock
 -retryAnalyzer->retries the failed testcases
 -version control-Git

2)Components of Framework:
  1)com.framework.selenium.api.design:
    a)Browser:all the browser related activities are defined
    b)Element:all the element related activities are defined
 2)com.framework.selenium.api.base:
   a)DriverInstance:define the driver in THreadlocal class to avoid the conflicts when working with cross browser testing and in parallel mode.
   b)Selenium Base:implements the browser and element interface,so it is called as wrapperclass which has the reusable methods.
 
3)com.framework.testNG.api.base:
  a)ProjectSpecificMethods:all the pre conditions,postconditions and dataprovider is defined.
  b)RetryEngine:uses retry Analyser-->retries the failed testcases.
4)com.framework.utils:
  a)DataLibrary:ExcelIntegration
  b)Reporter:ExtentReports
5)Com.leaftaps.pages:
 All the pages are defined as java class and the actions in the page are written as the methods.
6)5)Com.leaftaps.testcases:
 -execution class

3)Execution flow:
  
   @BeforeSuite---->startReports()--->Reporter
    @bEForeTest---->setValues()--->testcases
     @Before Class--->testCaseDetails()---->Reporter
      @DatapRovider---sendData()--->PSM
       @BeforeMethod--->precondns()--->PSM
        @Test---->testcases
        @AfterMethod--->nil
      @AfterClass--->nil
    @AftertEST---->nil
@AfterSuite---->stopReports()---->Reporter

4)Hierarchy:
  
