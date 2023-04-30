package com.planetpope.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private int x;
    private int y;
    private int sum;
    @Given("x={int}")
    public void x(Integer int1) {
        x = int1;
    }
    @Given("y={int}")
    public void y(Integer int2) {
        y = int2;
    }
    @When("x and y are added")
    public void x_and_y_are_added() {
        Calculator calc = New Calculator();
        sum = calc.add(x,y);
    }
    @Then("the value should be {int}")
    public void the_value_should_be(Integer int3) {
        assertEquals(int3, sum);
    }
}
