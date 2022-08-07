package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorOperatorSteps extends BaseTest {

        @Given("user change operator to multiply")
        public void userChangeOperatorToMultiply() {
            calculatorPage.ChangeOperatorToMultiply();
        }

    @And("user input first number is {string}")
    public void userInputFirstNumberIs(String firstNumber) {
            calculatorPage.inputFirstNumber(firstNumber);
    }

    @And("user input second number is {string}")
    public void userInputSecondNumberIs(String secondNumber) {
            calculatorPage.inputSecondNumber(secondNumber);
    }

    @When("user click equal button")
    public void userClickEqualButton() {
            calculatorPage.clickEqualBtn();
    }

    @Then("the result is {int}")
    public void theResultIs(int result) {
            String finalResult = "Hasil : " + result; //variable untuk validasi dari method resultIs
            Assertions.assertEquals(finalResult, calculatorPage.resultIs());
    }

    @Given("user change operator to divide")
    public void userChangeOperatorToDivide() {
            calculatorPage.ChangeOperatorToDivider();
    }

    @Given("user change operator to minus")
    public void userChangeOperatorToMinus() {
            calculatorPage.ChangeOperatorToSubtraction();
    }

    @Given("default operator on calculator set to addition")
    public void defaultOperatorOnCalculatorSetToAddition() {
            //kosong karena default nya adalah operator penjumlahan
    }
}
