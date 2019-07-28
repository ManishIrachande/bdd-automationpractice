package com.automationpractice.webpages;

import com.automationpractice.pagefactory.LoginPage;
import com.automationpractice.pagefactory.RegisterPage;
import com.automationpractice.testbase.TestBase;
import com.automationpractice.utility.Util;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Manishkumar Irachande
 **/


public class RegisterTest extends TestBase {

    public String email = null;

    @Test(priority = 2)
    public void userShouldNavigateAccountPage()  {

        RegisterPage registerPage = new RegisterPage();
        Util util = new Util();
        email = "mj" + util.generateRandomNumber() + "@gmail.com";
        registerPage.clickOnLoginTab();
        registerPage.enterEmailAddress(email);
        registerPage.clickOnCreateAccountTab();
        registerPage.clickOnGenderTab();
        registerPage.enterFirstName("Manish");
        registerPage.enterLastName("Irachande");
        registerPage.enterPassword("12345678");
        registerPage.enterDayOfBirth("7");
        registerPage.enterMonthOfBirth("2");
        registerPage.enterYearOfBirth("1991");
        registerPage.clickOnNewletterBox();
        registerPage.enterCompanyName("MMMMM");
        registerPage.enterAddress1("121, Rugby Avenue");
        registerPage.enterCityName("Wembley");
        registerPage.enterStateName("14");
        registerPage.enterPostalCode("56666");
        registerPage.clickOnCountryTab("21");
        registerPage.enterPhoneNumber("656565");
        registerPage.enterAddress2("121, Rugby Avenue");
        registerPage.clickOnRegisterTab();
        Assert.assertTrue(registerPage.verifyMyAccountMessage());
        util.takescreenShotFileName("m1");
    }

    @Test(priority = 3)
    public void userShouldNavigateToSignInPage()  {
        LoginPage loginPage = new LoginPage();
        Util util = new Util();
        loginPage.clickOnLoginTab();
        loginPage.enterEmailAddress(email);
        loginPage.enterPassword("12345678");
        loginPage.clickOnSignInTab();
        Assert.assertTrue(new RegisterPage().verifyMyAccountMessage());
        util.takescreenShotFileName("m2");
    }

    @Test(priority = 1)
    public void userShouldNotNavigateWithBlankField() {
        RegisterPage registerPage = new RegisterPage();
        Util util = new Util();
        registerPage.clickOnLoginTab();
        registerPage.enterEmailAddress("");
        registerPage.clickOnCreateAccountTab();
        Assert.assertTrue(registerPage.getInvalidMessage().equals("Invalid email address."));
        util.takescreenShotFileName("ma12");
    }

}
