3:00 to 3:30 ---> Set
3:30 to 4:15 ---> Alerts
4:15 to 4:25 ---> Break
4:25 to 5:30 ---> Frames
5:30 to 6:00 ---> BreakOut

Set:
1)it is an unordered collection,the order of an element depends on implementaion classes
    Implementation Classes:
    1)HashSet-->uses Hashing Algorithm(Random order)
    2)LinkedhashSet--->insertion order
    3)TreeSet---->ASCII order
2)it will not allow the duplicates
3)get() is not available in set.

    int num[]={1,2,3,4,2};
    index--->4--->2(List)
    set--->{1,2,3,4}
Alerts:
-cannot be ignored
-are not inspectable
-java script functions
What is an Alert in Selenium?
An Alert in Selenium WebDriver is a small message box that appears on the screen to give the user information or ask for permission to perform an operation.
It's typically a JavaScript-based window that can show warnings, ask for confirmations, or prompt for information.
Why are Alerts Used?
Alerts are used in web applications to:

Notify users: Provide important information or warnings.
Get confirmations: Confirm user actions before proceeding.
Collect input: Gather information or feedback from users.
Types of Alerts
Modal Alerts: These are traditional JavaScript alerts that are not part of the HTML DOM.
Simple Alert: Displays an information message with an OK button.
Confirmation Alert: Presents a message with OK and Cancel buttons to accept or reject an option.
Prompt Alert: Offers an input field along with OK and Cancel buttons, allowing user input.
Non-Modal Alert (Sweet Alert): These are more modern, customizable alerts that are part of the HTML DOM and can be inspected.
Handling Alerts in Selenium
Focus Transfer: To interact with an alert, Selenium transfers focus to the alert box using driver.switchTo().alert().
Return Type: The return type for this operation is the Alert interface.
Implementation Class: Selenium implements this functionality through the RemoteAlert class.
Alert Interface Actions
accept(): Clicks the 'OK' button on the alert.
dismiss(): Clicks the 'Cancel' button, used for dismissing the alert.
getText(): Retrieves the text displayed on the alert box.
sendKeys(String keysToSend): Sends a string input to the alert, used in prompt alerts.
Special Case: Handling Sweet Alerts
Sweet Alerts are part of the HTML content and can be handled like any other web element. They require standard methods for interacting with web elements, unlike traditional JavaScript alerts.
Exceptions Related to Alerts in Selenium:
NoAlertPresentException: This exception is thrown when an operation is attempted on an alert, but there is no alert present.
UnhandledAlertException: This exception is thrown when there is an alert that Selenium is unable to handle, either because it wasn’t expected, or because the driver cannot interact with it.
