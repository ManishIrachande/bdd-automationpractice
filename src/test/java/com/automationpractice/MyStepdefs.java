package com.automationpractice;

import com.automationpractice.pagefactory.AddItemPage;
import com.automationpractice.pagefactory.LoginPage;
import com.automationpractice.pagefactory.RegisterPage;
import com.automationpractice.utility.Util;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Manishkumar Irachande
 **/


public class MyStepdefs {

    String p_SKU = null;
    String email = null;

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
    new RegisterPage().clickOnLoginTab();
    }

    @And("^I enter email address \"([^\"]*)\" into email field$")
    public void iEnterEmailAddressIntoEmailField(String _email) {
        email = _email+ Util.generateRandomNumber()+"@gmail.com";
        new RegisterPage().enterEmailAddress(email);
    }

    @And("^Click On Account Tab$")
    public void clickOnAccountTab() {
        new RegisterPage().clickOnCreateAccountTab();
    }

    @Then("^I should Navigate To Register Page$")
    public void iShouldNavigateToRegisterPAge() {
    }


    @And("^I Click On Gender Button$")
    public void iClickOnGenderButton() {
        new RegisterPage().clickOnGenderTab();

    }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String fnam) {
        new RegisterPage().enterFirstName(fnam);
    }

    @And("^I enter Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String lnam) {
        new RegisterPage().enterLastName(lnam);
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String psw) {
        new RegisterPage().enterPassword(psw);
    }

    @And("^I enter Day Of Birth \"([^\"]*)\"$")
    public void iEnterDayOfBirth(String db) {
        new RegisterPage().enterDayOfBirth(db);
    }

    @And("^I enter Month of Birth \"([^\"]*)\"$")
    public void iEnterMonthOfBirth(String mb) {
        new RegisterPage().enterMonthOfBirth(mb);
    }

    @And("^I enter Year Of Birth \"([^\"]*)\"$")
    public void iEnterYearOfBirth(String yb) {
        new RegisterPage().enterYearOfBirth(yb);
    }

    @And("^I click on News Letter Box$")
    public void iClickOnNewsLetterBox() {
        new RegisterPage().clickOnNewletterBox();

    }

    @And("^I enter Company Name \"([^\"]*)\"$")
    public void iEnterCompanyName(String cnam) {
        new RegisterPage().enterCompanyName(cnam);
    }

    @And("^I enter Address \"([^\"]*)\"$")
    public void iEnterAddress(String ads) {
        new RegisterPage().enterAddress1(ads);
    }

    @And("^I enter City Name \"([^\"]*)\"$")
    public void iEnterCityName(String cty) {
        new RegisterPage().enterCityName(cty);
    }

    @And("^I enter State Name \"([^\"]*)\"$")
    public void iEnterStateName(String snam) {
        new RegisterPage().enterStateName(snam);
    }

    @And("^I enter Post Code \"([^\"]*)\"$")
    public void iEnterPostCode(String pcod) {
        new RegisterPage().enterPostalCode(pcod);

    }

    @And("^I enter Country Name \"([^\"]*)\"$")
    public void iEnterCountryName(String cnam) {
        new RegisterPage().clickOnCountryTab(cnam);
    }

    @And("^I enter Mobile Number \"([^\"]*)\"$")
    public void iEnterMobileNumber(String pnum) {
        new RegisterPage().enterPhoneNumber(pnum);
    }

    @And("^I click On Register Tab$")
    public void iClickOnRegisterTab()  {
        new RegisterPage().clickOnRegisterTab();

    }

    @Then("^I should should Register my account$")
    public void iShouldShouldRegisterMyAccount() {
        Assert.assertTrue(new RegisterPage().verifyMyAccountMessage());


    }


    @And("^I enter Second Address \"([^\"]*)\"$")
    public void iEnterSecondAddress(String add2) {
        new RegisterPage().enterAddress2(add2);

    }

    @Then("^Message should pop up Invalid email address$")
    public void messageShouldPopUpInvalidEmailAddress() {

    }

    @And("^I click on Sign In tab$")
    public void iClickOnSignInTab()  {
        new LoginPage().clickOnSignInTab();

    }


    @When("^I click on women Tab$")
    public void iClickOnWomenTab() {
        new AddItemPage().clickOnWomenTab();

    }

    @And("^I click on an item$")
    public void iClickOnAnItem() {
        new AddItemPage().clickOnProductView();

    }

    @And("^I get SKU code of the product$")
    public void iGetSKUCodeOfTheProduct() {
        AddItemPage addItemPage = new AddItemPage();
         p_SKU = addItemPage.getProductSKU().substring(6,12);
    }

    @And("^I click on Add Cart$")
    public void iClickOnAddCart() {
        new AddItemPage().clickOnAddCart();

    }

    @And("^I close pop up window showing basket preview$")
    public void iClosePopUpWindowShowingBasketPreview() {
        new AddItemPage().clickOnClosePopUpWindow();

    }

    @And("^I click on Cart$")
    public void iClickOnCart() {
        new AddItemPage().clickOnCartProduct();

    }

    @Then("^I should see Correct SKU added to the basket$")
    public void iShouldSeeCorrectSKUAddedToTheBasket() {
        AddItemPage addItemPage = new AddItemPage();
        Assert.assertTrue(addItemPage.getCartSKU().endsWith(p_SKU));
    }

    @And("^I sign out from my account$")
    public void iSignOutFromMyAccount() {
        new RegisterPage().clickOnSignOutTab();

    }

    @Then("^I should login Successfully with same email$")
    public void iShouldLoginSuccessfullyWithSameEmail() {
        Assert.assertTrue(new RegisterPage().verifyMyAccountMessage());

    }

    @When("^I enter email address \"([^\"]*)\" into email field on Login Page$")
    public void iEnterEmailAddressIntoEmailFieldOnLoginPage(String arg0) {
        new LoginPage().enterEmailAddress(email);
    }
}
