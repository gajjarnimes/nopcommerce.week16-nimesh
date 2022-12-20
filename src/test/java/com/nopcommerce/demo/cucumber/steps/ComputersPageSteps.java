package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputersPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class ComputersPageSteps {
    @And("^I select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String orderby){
        new ComputersPage().getSelectByValue(orderby);
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String addtocart){
        new ComputersPage().clickOnAddToCart();
    }
   @And("^I verify the Text \"([^\"]*)\"$")
    public void iVerifyTheText(){
       new ComputersPage().getVerifyBuildYourOwn();}

    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String selectprocessor){
        new ComputersPage().selectProcessorByValue(selectprocessor);
    }

    @And("^I select HDD radio \"([^\"]*)\"$")
    public void iSelectHDDRadio(String hdd){
        new ComputersPage().clickOnHDD400GB();
    }

    @And("^I select OS radio \"([^\"]*)\"$")
    public void iSelectOSRadio(String os){
        new ComputersPage().clickOnOsVistaPremium();
    }

    @And("^I Check Two Check boxes \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCheckTwoCheckBoxesAnd(String ms, String commander){
        new ComputersPage().clickOnSoftwareTotalCommander();
    }

    @And("^I verify the price\"([^\"]*)\"$")
    public void iVerifyThePrice(String totalprice){
        new ComputersPage().verifyTotalPrice();
    }

    @And("^I click on \"([^\"]*)\" Button$")
    public void iClickOnButton(){
        new ComputersPage().clickOnAddToCartButton();
    }

    @And("^I verify the Message \"([^\"]*)\" on Top green Bar After that close the bar$")
    public void iVerifyTheMessageOnTopGreenBarAfterThatCloseTheBar(String message){
        new ComputersPage().verifyCaryMessage();
    }

    @And("^I click on the cross button$")
    public void iClickOnTheCrossButton() {
    }

    @And("^I MouseHover on \"([^\"]*)\"$")
    public void iMouseHoverOn(String shoppingcart){
        new ComputersPage().mouseHoverOnElementShoppingCart();
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String gotocart){
        new ComputersPage().clickOnGoToCart();

    }

    @And("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String message){
        new ComputersPage().verifyShoppingCartMessage();
    }

    @And("^I change the Qty to \"([^\"]*)\"$")
    public void iChangeTheQtyTo(String change){
        new ComputersPage().sendTextToQuantityField();
    }

    @And("^I verify the Total \"([^\"]*)\"$")
    public void iVerifyTheTotal(String total){
        new ComputersPage().verifyTotal1();
    }

    @And("^I click on Checkbox \"([^\"]*)\"$")
    public void iClickOnCheckbox(String checkbox){
        new ComputersPage().clickOnCheckBoxIAgreeWithTermsAndCondition();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String welcometext){
        new ComputersPage().verifyWelcomeText();
    }

    @And("^I click on \"([^\"]*)\" Tab$")
    public void iClickOnTab(String guest){
        new ComputersPage().clickOnCheckOutAsGuest();
    }

    @And("^I fill the all mandatory field$")
    public void iFillTheAllMandatoryField() {
    }

    @And("^I click on Radio Button \"([^\"]*)\"$")
    public void iClickOnREadioButton(String radio){
        new ComputersPage().clickOnNextDayAirButton();
    }

    @And("^I select Radio Button \"([^\"]*)\"$")
    public void iSelectRadioButton(String creditCard){
        new ComputersPage().clickOnCreditCardButton();
    }

    @And("^I select \"([^\"]*)\" From select credit card dropdown$")
    public void iSelectFromSelectCreditCardDropdown(String mastercard){
        new ComputersPage().selectMasterCardFromCreditCardDropdown(mastercard);
    }

    @And("^I fill all the details$")
    public void iFillAllTheDetails() {
    }

    @And("^I verify \"([^\"]*)\"is \"([^\"]*)\"$")
    public void iVerifyIs(String paymentmethod){
        new ComputersPage().getVerifyText1();
    }

    @And("^I verify \"([^\"]*)\" is \"([^\"]*)\"$")
    public void iVerifyIs(String shippingmethod, String Nextdayair){
        new ComputersPage().getVerifyText2();
    }

    @And("^I verify Total is \"([^\"]*)\"$")
    public void iVerifyTotalIs(String total){
        new ComputersPage().getVerifyText3();
    }
}
