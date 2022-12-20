package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement male;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement Firstname;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement Lastname;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Day')]")
    WebElement Day;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Month')]")
    WebElement Month;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Year')]")
    WebElement Year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement Email;

    @CacheLookup
    @FindBy(id = "Company")
    WebElement Companyname;

    @CacheLookup
    @FindBy(id = "Newsletter")
    WebElement Newsletter;

    @CacheLookup
    @FindBy(id="Password")
    WebElement Password;

    @CacheLookup
    @FindBy(id="ConfirmPassword")
    WebElement ConfirmPassword;

    @CacheLookup
    @FindBy(id="register-button")
    WebElement Register;

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }
    public void clickOnmaletab(){
        clickOnElement(male);
        log.info("clicking on Male Tab"+male.toString());
    }
    public void enterFirstname(String firstname){
        sendTextToElement(Firstname,firstname);
        log.info("FirstName"+Firstname.toString());
    }
    public void enterLastname(String lastname){
        sendTextToElement(Lastname,lastname);
        log.info("LastName"+Lastname.toString());
    }
    public void selectDay(String day){
        sendTextToElement(Day,day);
        log.info("Day"+Day.toString());
    }
    public void selectMonth(String month){
        sendTextToElement(Month,month);
        log.info("Month"+Month.toString());
    }
    public void selectYear(String year){
        sendTextToElement(Year,year);
        log.info("Year"+Year.toString());
    }
    public void enterEmail(String email) {
        sendTextToElement(Email,email);
        log.info("Email" + Email.toString());
    }

    public void enterCompanyname(String companyname){
        sendTextToElement(Companyname,companyname);
        log.info("Company"+Companyname.toString());
    }
    public void clickOnNewsletter(){
        clickOnElement((Newsletter));
        log.info("Newsletter"+Newsletter.toString());
    }
    public void enterPassword(String password){
        sendTextToElement(Password,password);
        log.info("Password"+Password.toString());
    }
    public void enterConfirmPassword(String confirmpassword){
        sendTextToElement(ConfirmPassword,confirmpassword);
        log.info("ConfirmPassword"+ConfirmPassword.toString());
    }
    public void clickOnRegisger(){
        clickOnElement(Register);
        log.info("Register"+Register.toString());
    }


}
