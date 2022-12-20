package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Computer extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public Computer() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath =  "//a[@href='/computers']" )
    WebElement Computer;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement DesktopMenu;

    public void clickOnComputer(){
        log.info("clickOnComputer"+Computer.toString());
        clickOnElement(Computer);
    }
    public void clickOnDesktopMenu(){
        log.info("clickonDesktopMenu"+DesktopMenu.toString());
        clickOnElement(DesktopMenu);
    }
    public void sortProductZToA(){
        List<WebElement> products = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        selectByValueFromDropDown(By.xpath("//select[@name='products-orderby']"),"6");
        products = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);

    }
}
