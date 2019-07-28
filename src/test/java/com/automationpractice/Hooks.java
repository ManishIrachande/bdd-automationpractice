package com.automationpractice;

import com.automationpractice.basepage.BasePage;
import com.automationpractice.browserselector.BrowserSelector;
import com.automationpractice.loadproperty.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

/**
 * Created by Manishkumar Irachande
 **/


public class Hooks extends BasePage {

    BrowserSelector selector = new BrowserSelector();
    LoadProperty property = new LoadProperty();

    String browser = property.getProperty("browser");
    String baseUrl = property.getProperty("baseUrl");

    @Before
    public void setUp(){
        selector.browseSelector(browser);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
        @After()
        public void tearDown(){
        driver.quit();
    }
}
