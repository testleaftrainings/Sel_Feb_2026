2:45 to 3:30 --->Hooks Implementation and tags
3:30 to 3:40 --->Break
3:40 to 4:10 --->Explicit Wait
4:10 to 4:50 --->Constructor
4:50 to 5:00 --->Break
5:00 to 6:00 --->POM Introduction
                 Seq & Parallel Execution


Steps to implement Hooks:
Create a package called hooks and create a class called HooksImplementation
Create 2 methods preCondition() and postCondition() and annotate with @Before and @After
The HooksImplementatio class should extends BaseClass
In the Runner class inside glue attribute mention hooks package as well glue ={"steps","hooks"}
Tags:
It is used to categorize the scenarios

tags="@smoke" )// only smoke scenarios will be executed tags="not @smoke") // to exclude a scenario from execution tags="@smoke or @functional")// To run scenarios that have either of the tags tags="@functional and @regression" )//To run scenarios which has both the tags


ExplicitWait:
1)it is condn based wait
2)it polls for every 500ms in the dom,if the condn is satisfied it proceeds immediately.
3)if the condn is not satisfied,it polls until the time specified,after it throws timeout exception.

Login page:
 -enteruname
 -enterpwd
 -click login
Welcome page
 -click crmsfa
homepage
 -click leads
 MyLeads
  -createlead
Createleadpage
 -enter cname
 -enterfname
 -enterlname
 -click createlead
viewlEADS
-VERIFYLEADS
Steps to Implement POM:
Create a new Project and have all the dependencies inside the pom.xml
Create 3 packages inside src/main/java
base Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition() and annotate with @BeforeMethod and @AfterMethod Create static driver as a global variable
pages Create 6 classes for each page Each Classes inside pages package should extends ProjectSpecificMethods Create methods for each action inside each page Inside each method add return statement according to the page navigation if an action stays in the sama page -> return this if an action takes you to another page -> return new Page();
testcases
All classes inside the testcase package should extend ProjectSpecificMethods Create a class called RunLogin Create a method called runLogin and annotate with @Test Create object for LoginPage and call the method and execute
