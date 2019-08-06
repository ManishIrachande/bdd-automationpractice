package com.automationpractice.testbase;

import com.automationpractice.basepage.BasePage;
import com.automationpractice.browserselector.BrowserSelector;
import com.automationpractice.loadproperty.LoadProperty;
import com.automationpractice.utility.Util;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Manishkumar Irachande
 **/


public class TestBase extends BasePage {

BrowserSelector selector = new BrowserSelector();
LoadProperty property = new LoadProperty();

String browser = property.getProperty("browser");
String baseUrl = property.getProperty("baseUrl");

@BeforeClass
    public static void setUpBeforeClass(){

    PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\java\\com\\automationpractice\\resources\\propertiesfile\\config.properties");
}
@BeforeMethod
    public void setUp(){

    selector.browserSelector(browser);
    driver.get(baseUrl);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterMethod
    public void tearDown(ITestResult testResult){
    if(testResult.getStatus()== ITestResult.FAILURE){
        new Util().takescreenShotFileName(testResult.getName());
    }

    driver.quit();
}
}
