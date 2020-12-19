package com.letsonlycode.kambv;

import com.letsonlycode.kambv.FizzBuzz;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzStepdefs {

    FizzBuzz fizzBuzz;
    String result;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        fizzBuzz = new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int num) {
        result = fizzBuzz.play(num);
    }

    @Then("^The result is Fizz$")
    public void theResultIsFizz() {

    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String expectedResult) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(expectedResult, result);
    }
}
