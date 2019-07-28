package com.automationpractice.pagefactory;

import com.automationpractice.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Manishkumar Irachande
 **/


public class LoginPage extends Util {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    @FindBy(id = "email")
    WebElement _email;


    @FindBy(id = "passwd")
    WebElement _password;


    @FindBy(xpath = "//p[@class='submit']//span[1]")
    WebElement _signIn;

    @FindBy(xpath = "//a[@class='login']")
    WebElement _loginTab;

    public void clickOnLoginTab() {
        log.info("Click On Login Tab");
        clickOnElement(_loginTab);
    }

    public void enterEmailAddress(String emal) {
        log.info("Enter Email");
        sendTextToElement(_email, emal);

//    public  void enterEmail(String grn){ //Random Method for different Email
//        log.info("Enter Email");
//        sendTextToElement((_email),generateRandomNumber()+("mj@gmail.com"));
    }

    public void enterPassword(String psd) {
        log.info("Enter Password");
        sendTextToElement(_password, psd);
    }

    public void clickOnSignInTab() {
        log.info("Click on Sign In Tab");
        clickOnElement(_signIn);

    }
}
