package com.automationpractice.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Manishkumar Irachande
 **/


public class BasePage {
    public static WebDriver driver;

    public BasePage() {

        PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automationpractice\\resources\\propertiesfile\\log4j.properties");
        PageFactory.initElements(driver, this);


    }
}
