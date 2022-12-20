package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.Computer;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerSteps {
    @When("^I click on Computer$")
    public void iClickOnComputer() {
        new Computer().clickOnComputer();
    }

    @And("^I click on Desktopmenu$")
    public void iClickOnDesktopmenu() {
        new Computer().clickOnDesktopMenu();
    }

    @Then("^sort product Z To A$")
    public void sortProductZToA() {
        new Computer().sortProductZToA();
    }
}
