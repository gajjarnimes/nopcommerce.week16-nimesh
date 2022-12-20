package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ComputersPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement desktopMenu;
    @CacheLookup
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement selectByValue;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildYourOwn;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;
    @CacheLookup
    @FindBy(xpath = "//label[text()='400 GB [+$100.00]']")
    WebElement selectHDD;
    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']")
    WebElement selectOS;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommander;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyTotal;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyCartMsg;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeMsg;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]\");////a[@class='ico-cart']")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 cart-button']")
    WebElement clickOnGoToCart;
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement verifyTotal1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcome;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickOnCheckoutAsGuest;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement sendTextToFirstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement sendTextToLastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement sendTextToEmail;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Company")
    WebElement sendTextToCompany;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement sendTextToCity;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement sendTextToAddress1;
    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address2")
    WebElement sendTextToAddress2;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement sendTextToPostalCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement sendTextToPhoneNumber;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement clickOnNextDayAir;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement clickOnContinueTab;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement clickOnCreditCard;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement clickOnMasterCard;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement verifyText1;
    public String getVerifyText1() {
        return getTextFromElement(verifyText1);
    }
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[2]")
    WebElement verifyText2;
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement verifyText3;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement conform;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement verifyText4;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyText5;
    @CacheLookup
    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button")
    WebElement continueButton3;
    public String getVerifyText2() {
        log.info("getVerifyText2" + verifyText2.toString());
        return getTextFromElement(verifyText2);
    }
    public void clickOnComputer() {
        log.info("clickOnComputer" + computerMenu.toString());
        clickOnElement(computerMenu);
    }

    public void clickOnDesktop() {
        log.info("clickOnDesktop" + desktopMenu.toString());
        clickOnElement(desktopMenu);
    }
    public void getSelectByValue(String value) {
        log.info("getSelectByValue" + selectByValue.toString());
        selectByValueFromDropDown(selectByValue, value);
    }

    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }

    public void getVerifyBuildYourOwn() {
        log.info("getVerifyBuildYourOwn" + verifyBuildYourOwn.toString());
        getTextFromElement(verifyBuildYourOwn);
    }
    public void selectProcessorByValue(String value) {
        log.info("selectProcessorByValue" + selectProcessor.toString());
        selectByValueFromDropDown(selectProcessor, value);
    }

    public void selectRamByValue(String value) {
        log.info("selectRamByValue" + selectRam.toString());
        selectByValueFromDropDown(selectRam, value);
    }
    public void clickOnHDD400GB() {
        log.info("clickOnHDD400GB" + selectHDD.toString());
        clickOnElement(selectHDD);
    }

    public void clickOnOsVistaPremium() {
        log.info("clickOnOsVistaPremium" + selectOS.toString());
        clickOnElement(selectOS);
    }
    public void clickOnSoftwareTotalCommander() {
        log.info("clickOnSoftwareTotalCommander" + totalCommander.toString());
        clickOnElement(totalCommander);
    }
    public void verifyTotalPrice() {
        log.info("verifyTotalPrice" + verifyTotal.toString());
        getTextFromElement(verifyTotal);
    }

    public void clickOnAddToCartButton() {
        log.info("clickOnAddToCartButton" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public void  verifyCaryMessage() {
        log.info("verifyCaryMessage" +verifyCartMsg.toString());
        getTextFromElement(verifyCartMsg);
    }
    public void closeMessageBar() {
        log.info("closeMessageBar" + closeMsg.toString());
        clickOnElement(closeMsg);
    }
    public void mouseHoverOnElementShoppingCart() {
        log.info("mouseHoverOnElementShoppingCart" + mouseHoverOnShoppingCart.toString());
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    public void clickOnGoToCart() {
        log.info("clickOnGoToCart" + clickOnGoToCart.toString());
        clickOnElement(clickOnGoToCart);
    }
    public void verifyShoppingCartMessage(){
        log.info("verifyShoppingCartMessage" + shoppingCartMessage.toString());
        getTextFromElement(shoppingCartMessage);
    }
    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(By.xpath("//input[@value='1']"));
        quantity.clear();
    }

    public void sendTextToQuantityField() {
        log.info("sendTextToQuantityField" + sendTextToQuantity.toString());
        sendTextToElement(sendTextToQuantity, "2");
    }

    public void clickOnUpdateShoppingCartButton() {
        log.info("clickOnUpdateShoppingCartButton" + clickOnUpdateShoppingCart.toString());
        clickOnElement(clickOnUpdateShoppingCart);
    }
    public void verifyTotal1(){
        log.info("verifyTotal1" + verifyTotal1.toString());
         getTextFromElement(verifyTotal1);
    }
    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        log.info("clickOnCheckBoxIAgreeWithTermsAndCondition" + clickOnCheckbox.toString());
        clickOnElement(clickOnCheckbox);
    }
    public void clickOnCheckOutButton() {
        log.info("clickOnCheckOutButton" + clickOnCheckout.toString());
        clickOnElement(clickOnCheckout);
    }
    public String verifyWelcomeText(){
        log.info("verifyWelcomeTex" + verifyWelcome.toString());
        return getTextFromElement(verifyWelcome);
    }

    public void clickOnCheckOutAsGuest() {
        log.info("clickOnCheckOutAsGuest" + clickOnCheckoutAsGuest.toString());
        clickOnElement(clickOnCheckoutAsGuest);
    }
    public void sendTextToFirstNameField(String name) {
        log.info("sendTextToFirstNameField" + name + sendTextToFirstName.toString());
        sendTextToElement(sendTextToFirstName, name);
    }
    public void sendTextToLastNameField(String lastName) {
        log.info("sendTextToLastNameField" + lastName + sendTextToLastName.toString());
        sendTextToElement(sendTextToLastName, lastName);
    }
    public void sendTextToEmailField(String email) {
        log.info("sendTextToEmailField" + email + sendTextToEmail.toString());
        sendTextToElement(sendTextToEmail, email);
    }
    public void sendTextToCompanyField(String company) {
        log.info("sendTextToCompanyField" + company + sendTextToCompany.toString());
        sendTextToElement(sendTextToCompany, company);
    }
    public void selectCountryFromDropDownList() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "158");
    }
    public void sendTextToCityField(String city) {
        log.info("sendTextToCityField" + city + sendTextToCity.toString());
        sendTextToElement(sendTextToCity, city);
    }
    public void sendTextToAddressLine1(String address) {
        log.info("sendTextToAddressLine1" + address + sendTextToAddress1.toString());
        sendTextToElement(sendTextToAddress1, address);
    }
    public void sendTextToAddressLine2(String address) {
        log.info("sendTextToAddressLine2" + address +sendTextToAddress2.toString());
        sendTextToElement(sendTextToAddress2, address);
    }
    public void sendTextToPostcode(String postcode) {
        log.info("sendTextToPostcode" + postcode + sendTextToPostalCode.toString());
        sendTextToElement(sendTextToPostalCode, postcode);
    }
    public void sendTextToPhoneNumberField(String number) {
        log.info("sendTextToPhoneNumberField" +number + sendTextToPhoneNumber.toString());
        sendTextToElement(sendTextToPhoneNumber, number);
    }
    public void clickOnContinueButton() {
        log.info("clickOnContinueButton" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }
    public void clickOnNextDayAirButton() {
        log.info("clickOnNextDayAirButton" + clickOnNextDayAir.toString());
        clickOnElement(clickOnNextDayAir);
    }
    public void clickOnContinueButtonAgain() {
        log.info("clickOnContinueButtonAgain" + clickOnContinueTab.toString());
        clickOnElement(clickOnContinueTab);
    }
    public void clickOnCreditCardButton() {
        log.info("clickOnCreditCardButton" + clickOnCreditCard.toString());
        clickOnElement(clickOnCreditCard);
    }
    public void selectClickOnContinue1() {
        log.info("selectClickOnContinue1" + continueButton.toString());
        clickOnElement(continueButton);
    }
    public void selectMasterCardFromCreditCardDropdown(String value) {
        log.info("selectMasterCardFromCreditCardDropdown" + clickOnMasterCard.toString());
        selectByValueFromDropDown(clickOnMasterCard,value);
    }
    public void sendTextTOCardHolderName(String name) {
        log.info("sendTextTOCardHolderName" + cardHolderName.toString());
        sendTextToElement(cardHolderName, name);
    }
    public void sendTextTOCardNumber(String num) {
        log.info("sendTextTOCardNumber" + cardNumber.toString());
        sendTextToElement(cardNumber, num);
    }
    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "9");
        selectByValueFromDropDown(By.id("ExpireYear"), "2026");
    }

    public void sendTextToCardCode(String code) {
        log.info("sendTextToCardCode" + cardCode.toString());
        sendTextToElement(cardCode, code);
    }
    public void clickOnContinueButton2() {
        log.info("clickOnContinueButton2" + continueButton2.toString());
        clickOnElement(continueButton2);
    }
    public String getVerifyText3() {
        log.info("getVerifyText3" + verifyText3.toString());
        return getTextFromElement(verifyText3);
    }
    public void clickOnConformButton() {
        log.info("clickOnConformButton" + conform.toString());
        clickOnElement(conform);
    }
    public String getVerifyText4() {
        log.info("getVerifyText4" + verifyText4.toString());
        return getTextFromElement(verifyText4);
    }
    public String getVerifyText5() {
        log.info("getVerifyText5" + verifyText5.toString());
        return getTextFromElement(verifyText5);
    }
    public void clickOnContinueButton3() {
        log.info("clickOnContinueButton3" + continueButton3.toString());
        clickOnElement(continueButton3);
    }

}
