#Amazon Website Automation Suite Information

### Testng files Description

-LoginTest.xml:- In this file we define different test scenarios related to login like valid login or invalid login

-SearchTest.xml:- In this file we define different test scenarios related to search like valid search or invalid search

-HomePageTabsTests.xml:- In this file we basically we define test scenarios to test homepage like their tabs etc.

-AddtoCartPage.xml:- In this file we test the scenarios realted to add the product in cart or we can say wish listing
                     the product
                     
 
### Package Description

-com.SeleniumProject.pages:- It Is the repository of all the webpages we have to tests

-com.SeleniumProject.util:- It contains the additional classes required for some of features like screenshot etc.

-com.SeleniumProject.tests:- It contains all the tests to be performed and required assertions


### Tests file Description

-AddToCartTest.java:- It handles all the tests operation related to Add the Product in cart

-BaseTest.java:- It is the main class in which we handle all the pre-requisite required for running all the test cases

                 like---> Browser initialization, Getting system properties from property file,
                 
                          Defining after and before method
                          
-HomePageTabsTests.java:- It handles all the tests operation related to test HomePage tabs ,mouse operations

-LoginTest.java:- It handles all the tests operation related to Login functionality

-SearchTest.java:- It handles all the tests operation related to Searches using search tab on homepage of website  


### JRE System Library
    
This is Java Runtime Environment Library which contains all the files related to java like java complier etc required for java programming or java operation


### Maven Dependencies

This contains some of dependencies required to run the suite on maven or handling some of the functionalities like for report creation for test cases we have extent report dependency for maven.


### Drivers Folder

This folder contain all the browser driver required for browser related operation like launching of browser etc.


### FailedScreenshots Folder

This folder contain the screenshots of the failed test cases in jpg format

### Reports

This is the folder where the report of the suite with required information are created by extent report dependency

###Resources

This are the folder where we define our configuration file and in that file we define property related to drivers,URLs required on which we perform our automation etc.

###pom.xml 

It is the heart of our project because all the dependency and plugins required for our maven project is define in that

###testng.xml

It is also important file as for running suite through testng all our test files are define in that and also parameters,groups etc are define in that like in our suite we use Browsers parameter are define in that only.

###Some other files define under com.SeleniumProject.utils

-Data.java:- It is our data provider file where all our test data are define

-Screenshots.java:- It is a file where we code to how to take a screenshot

                                
 
 
                     