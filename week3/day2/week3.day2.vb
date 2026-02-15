3:00 to 4:00 ---> Inheritance
4:00 to 4:20 ---> BreakOut
4:20 to 4:30 ---> Break
4:30 to 5:10 ---> Polymorphism
5:10 to 5:30 ---> BreakOut
5:30 to 6:00 ---> Advanced xpath

Inheritance:
Definition of Inheritance:

Inheritance is a fundamental principle in object-oriented programming that allows a class to inherit attributes and behaviors (methods) from another class.
This uses extends keyword
Advantages of Inheritance:

Reusability: Inheritance promotes the reuse of existing code without having to rewrite it.
Readability: It makes the code more simple by establishing clear relationships between classes.
Hierarchy: Establishes parent-child relationships between Classes and Interfaces, making the structure easier to understand and maintain.
Types of Inheritance:

Single: A class inherits from one parent class.
Multiple: A class inherits behaviors from more than one class, typically achieved through interfaces in Java.
Multilevel: A class inherits from a child class, creating a multilevel chain.
Hierarchical: Multiple classes inherit from a single parent class.
Hybrid: A combination of multilevel and hierarchical inheritance.

Java Examples:
Integer extends Number
RuntimeException extends Exception
List extends Collection
Selenium WebDriver Examples: - ChromeDriver extends ChromiumDriver - EdgeDriver extends ChromiumDriver - ChromiumDriver extends RemoteWebDriver Alt text

Interview Question
Could you explain Inheritance concept in Java? Answer: Definition, Types, Advantages, Examples
Give realtime examples in Java, Selenium
Explain where have you applied Inheritance in your Framework?

Polymorphism:
Definition

Polymorphism in Java is a concept by which we can perform a single action in different ways.
It is derived from two Greek words: "poly" and "morphs". "Poly" means many and "morphs" means forms.
Types - compile-time polymorphism - runtime polymorphism. Compile-time polymorphism is achieved by method overloading, while runtime polymorphism is achieved by method overriding. - It allows objects of different classes to be treated as objects of a common super class for seamless interaction, typically through the use of method overriding within an inheritance hierarchy. - This enables Java programs to be written more abstractly, promoting scalability and maintainability.

Overloading: - It refers to the ability to create multiple methods of the same name with different implementations. -Calls to an overloaded method will run a specific implementation of that method appropriate to the context, based on the number and type of arguments passed.

Java Examples:

Methods like add() can be overloaded to accept different types of arguments.
Similarly, substring() in the String class is overloaded to accept different starting and ending points for the substring.
println()
Selenium WebDriver Examples:

The frame() method in Selenium WebDriver is overloaded to allow different types of arguments like an integer (index of the frame), a String (name or ID of the frame), or a WebElement.
Advantages of Overloading:

Flexibility: Allows methods to handle different data types and numbers of arguments.
Readability: It can make the code more readable since the same method name can be used for similar actions on different types of input.
Reduces Complexity: Developers can use the same method name to perform similar actions, which simplifies code organization and maintenance.
Overriding

Method overriding in Java occurs when a subclass has a method with the same name, return type, and parameters as a method in its superclass.
It's a key feature of runtime polymorphism and allows a subclass to provide a specific implementation for a method that is already provided by its parent class
Examples:

equals() of String class is overriden from the Object class
toString() of String class is overriden from the Object class

Advanced Xpath:
1)Parent to Child:
syn:Basic Xpath of parent/Child TagName
eg)//p[@class='top']/input
2)GrandParent to GrandChild:
syn:Basic Xpath of Grandparent//GrandChild TagName
eg)(//form[@id='login']//input)[2]
3)Child to Parent:
syn: Basic xpath for child/parent::tagname of parent
//input[@class='decorativeSubmit']/parent::p
4)GrandChild to GrandParent:
syn: Basic xpath for Grandchild/ancestor::tagname of GrandParent
//input[@id='password']/ancestor::form
5)Elder to youngerSiblings:
syn:Basic xPath for elder/following-sibling::younger sibling tagName
eg)//label[text()='Username']/following-sibling::input
6)younger to ElderSiblings:
syn:Basic xPath for Younger/preceding-sibling::Elder sibling tagName
//input[@id='username']/preceding-sibling::label
7)Elder to younger cousin:
syn:Basic xpath for ElderCousin/following::tagname of the younger cousin
eg)//input[@class='inputLogin']/following::label
8)Younnger to Elder Cousin:
syn:Basic xpath for the younger cousin/preceding::tagname of the ElderCousin
eg)//input[@id='password']/preceding::input


 