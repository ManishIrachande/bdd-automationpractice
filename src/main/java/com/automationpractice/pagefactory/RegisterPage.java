package com.automationpractice.pagefactory;

import com.automationpractice.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Manishkumar Irachande
 **/

public class RegisterPage extends Util {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath = "//a[@class='login']")
    WebElement _loginTab;

    @FindBy(id = "email_create")
    WebElement _email;

    @FindBy(xpath = "//form[@id='create-account_form']//span[1]")
    WebElement _createAccount;

    @FindBy(id = "id_gender1")
    WebElement _gender;

    @FindBy(id = "customer_firstname")
    WebElement _firstName;

    @FindBy(id = "customer_lastname")
    WebElement _lastName;

    @FindBy(id = "passwd")
    WebElement _password;

    @FindBy(id = "days")
    WebElement _day;

    @FindBy(id = "months")
    WebElement _month;

    @FindBy(id = "years")
    WebElement _year;

    @FindBy(id = "newsletter")
    WebElement _newsletter;

    @FindBy(id = "company")
    WebElement _company;

    @FindBy(id = "address1")
    WebElement _address1;

    @FindBy(id = "city")
    WebElement _city;

    @FindBy(id = "id_state")
    WebElement _state;

    @FindBy(id = "postcode")
    WebElement _postalCode;

    @FindBy(id = "id_country")
    WebElement _country;

    @FindBy(id = "phone_mobile")
    WebElement _phone;

    @FindBy(id = "alias")
    WebElement _myAddress;

    @FindBy(id = "submitAccount")
    WebElement _register;

    @FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
    WebElement _validatePopUp;

    @FindBy(xpath = "//a[@class='logout']")
    WebElement _signOut;

    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement _myAccountText;

    public void enterEmailAddress(String email) {
        log.info("Enter Email " + email);
        sendTextToElement(_email, email);
    }

    public void clickOnLoginTab() {
        log.info("Click On Login Tab");
        clickOnElement(_loginTab);
    }

    public void clickOnCreateAccountTab() {
        log.info("Click on Create Account Tab");
        clickOnElement(_createAccount);
    }

    public void clickOnGenderTab() {
        log.info("Click on Gender Box");
        clickOnElement(_gender);
    }

    public void enterFirstName(String fName) {
        log.info("Enter First Name");
        sendTextToElement(_firstName, fName);
    }

    public void enterLastName(String lName) {
        log.info("Enter Last Name");
        sendTextToElement(_lastName, lName);
    }

    public void enterPassword(String psd) {
        log.info("Enter Password");
        sendTextToElement(_password, psd);
    }

    public void enterDayOfBirth(String db) {
        log.info("Enter Day Of Birth");
        selectByValueFromDropDownMenu(_day, db);
    }

    public void enterMonthOfBirth(String mb) {
        log.info("Enter Month Of Birth");
        selectByValueFromDropDownMenu(_month, mb);
    }

    public void enterYearOfBirth(String yb) {
        log.info("Enter Year Of Birth");
        selectByValueFromDropDownMenu(_year, yb);
    }

    public void clickOnNewletterBox() {
        log.info("Click on Newsletter");
        clickOnElement(_newsletter);
    }

    public void enterCompanyName(String cty) {
        log.info("Enter Company Name");
        sendTextToElement(_company, cty);
    }

    public void enterAddress1(String add1) {
        log.info("Enter 1st Address");
        sendTextToElement(_address1, add1);
    }

    public void enterCityName(String cty) {
        log.info("Enter City Name");
        sendTextToElement(_city, cty);
    }

    public void enterStateName(String stt) {
        log.info("Enter State Name");
        selectByValueFromDropDownMenu(_state, stt);
    }

    public void enterPostalCode(String pstcde) {
        log.info("Enter Email");
        sendTextToElement(_postalCode, pstcde);
    }

    public void clickOnCountryTab(String cont) {
        log.info("Click on Country Tab");
        selectByValueFromDropDownMenu(_country, cont);

    }

    public void enterPhoneNumber(String phn) {
        log.info("Enter Phone Number");
        sendTextToElement(_phone, phn);
    }

    public void enterAddress2(String add2) {
        log.info("Enter Second Name");
        sendTextToElement(_myAddress, add2);
    }

    public void clickOnRegisterTab() {
        log.info("Click on Register Tab");
        clickOnElement(_register);

    }

    public String getInvalidMessage() {
        return getTextFromElement(_validatePopUp);
    }

    public void clickOnSignOutTab() {
        log.info("Click on Sign Out Tab");
        clickOnElement(_signOut);
    }

    public boolean verifyMyAccountMessage() {
        if (_myAccountText.isDisplayed()) {
            log.info("My Account text Displayed");
            return "MY ACCOUNT".equals(_myAccountText.getText());

        } else {
            log.info("My Account Text Not Displayed");
            return false;
        }

    }
}