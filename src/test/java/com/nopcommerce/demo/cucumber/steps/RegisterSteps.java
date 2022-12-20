package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class RegisterSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {

    }
    @And("^I click on Male tab$")
    public void iClickOnMaleTab() {
    }


    @And("^I select Year$")
    public void iSelectYear() {
        new RegisterPage().selectYear("1978");
    }

    @And("^I enter Email$")
    public void iEnterEmail() {
        new RegisterPage().enterEmail("Nimesh@gmail.com");
    }

    @And("^I enter Company name$")
    public void iEnterCompanyName() {
        new RegisterPage().enterCompanyname("Delta");
    }
    @And("^I enter First name \"([^\"]*)\"$")
    public void iEnterFirstName(String Firstname)  {
        new RegisterPage().enterFirstname("Nimesh");

    }
    @And("^I enter Last name \"([^\"]*)\"$")
    public void iEnterLastName(String Lastname){
        new RegisterPage().enterLastname("Gajjar");
    }

    @And("^I selcet Day \"([^\"]*)\"$")
    public void iSelcetDay(String day){
        new RegisterPage().selectDay("16");
    }

    @And("^I select Month \"([^\"]*)\"$")
    public void iSelectMonth(String month){
        new RegisterPage().selectMonth("April");
    }

    @And("^I select Year \"([^\"]*)\"$")
    public void iSelectYear(String year){
        new RegisterPage().selectYear("1978");
    }

    @And("^I enter Email \"([^\"]*)\"$")
    public void iEnterEmail(String email){
        new RegisterPage().enterEmail("Nimesh@gmail.com");
    }

    @And("^I enter Company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String companyname){
        new RegisterPage().enterCompanyname("Delta");
    }
    @And("^I click on Newsletter$")
    public void iClickOnNewsletter() {
    }
    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password){
        new RegisterPage().enterPassword("RadheShyam@99");
    }

    @And("^I enter Confirm \"([^\"]*)\"$")
    public void iEnterConfirm(String comfirm){
        new RegisterPage().enterConfirmPassword("RadheShyam@99");
    }
    @Then("^registration successful$")
    public void registrationSuccessful() {
    }
    }




