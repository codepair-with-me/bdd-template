# bdd-cucumber
This project contains only base setup and no functional / technical implementation.

Prime objective here is to have your system ready with required prerequisites and 
maven dependencies.

## Prerequisites

###IDE

    Intellij

###Plugins 
    
    Gherkin
    Cucumber for Java 

### Check Setup

    Step 1 : Build the project successfully (mvn clean install)
    

```java
Step 2 : Check if plugins are working 
Clean methods from TemplateSteps.java and setup again 
Run the feature file at from location src/test/resources/features/Template.feature 
which you should be able to execute and fail with below complain
        
Step undefined
You can implement missing steps with the snippets below:

 @Given("{string} to my application")
public void to_my_application(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }

@When("{string} is processed")
public void is_processed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }

@Then("{string} is generated")
public void is_generated(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }

```

    Step 3 : Then you can do basic BDD excercise to copy genearted code
    into com.codepair.bdd.stepdefinitions.TemplateSteps.java
    and modify for any random implememtation 

    Step 4 : Execute CucumberTestSuite.java
    to ensure your BDD Step File is called and getting excuted
