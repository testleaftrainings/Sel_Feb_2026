3:00 to 3:45 --->Actions
3:45 to 4:45 --->TestNG Basics & Seq execution
4:45 to 5:05 --->Breakout
5:05 to 5:15 --->Break
5:15 to 5:45 --->Parallel  execution
5:45 to 6:00 --->Breakout

PreRequisites:
1)testNG plugins-for compile and execution of testcases
2)TestNg dependency-library developing the script.
Steps to convert the java script to testNG script:
1)remove String args[] in main method.
2)remove main and static in main method.
3)give a meaningful method name.
4)on top of the method,give @Test,import @Test from testng Annotations
steps for converting normal script to TestNG:
1)convert main mtd into normal method
 a)remove static,string args
 b)remove main and give a valid method name(mthd name should not be same as class name)
 2)add @Test before the method and import it
 how to get the reports:
 after execution,refresh the project,open the testoutput folder,do right click--->open with system editor.
 Parallel execution:
Select the required testcases and create a testng_parallel.xml
Open the xml file and add the attribute parallel ="classes"in the to run classes in parallel
Use the attribute thread-count to control the number of instances to be opened in parallel
To run mutiple tests in parallel add parallel="tests" in
Finally run the xml file
