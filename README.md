# SauceDemo Automation using Selenium/Java/Cucumber #

Test scenarios are described in the feature files located here ./src/test/resources/com/saucedemo. This is where the scenarios defined in Gherkin format
 
Step definition (./src/test/java/com/automatedtest/saucedemo/stepdefinitions): This files stores the mapping between each step of scenarios defined in the feature file.
 
Page Objects (./src/test/java/com/automatedtest/saucedemo/pages): Web elements in each page defined in the page object model
 
Browser driver (./src/test/java/com/automatedtest/saucedemo/browserDriver): Test is running in chrome and chrome driver defined here. This can be extended in order to run test in different browsers
 
Configurations (./src/test/java/com/automatedtest/saucedemo/config): Environment configurations details defined in this file
 
Helper (./src/test/java/com/automatedtest/saucedemo/helper): re-usable methods are defined in the helper file.
 

## Running tests ##

1) Using mvn
```console
$ mvn test
```

2)    Test runner : Test can be run from “testRunner” file ( Right click on testRunner – RunEndtoEndTest -> Run as -> Junit Test
 
3)    Feature file : Test can be run from feature file
 
4)    To do-  Jenkins : Test can run from Jenkins by calling test runner

 
## Reporting - TBD ##


## Installation ##

You need to have [Java 8 JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) installed along with [maven](https://maven.apache.org/download.cgi).

To run the tests locally with Chrome, install ChromeDriver from [here](http://chromedriver.chromium.org), add its location to your system PATH and add webdriver.chrome.driver=path/to/the/driver to your local variables.

To install all dependencies, run 

```console
$ mvn clean install
```



This test will run in chrome

Note: In macbook the following command may be useful xattr -d com.apple.quarantine chromedriver
