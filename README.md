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
Step 2 : Run the feature file at from location src/test/resources/bdd/features/test.feature 
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
        into src/test/java/com/codepair/processor/cucumber/stepdefinitions/TestSteps.java
        and modify for any random implememtation 

        Step 4 : Execute src/test/java/com/codepair/processor/cucumber/ItemProcessorBddRunner.java
        to ensure your BDD Step File is called and getting excuted