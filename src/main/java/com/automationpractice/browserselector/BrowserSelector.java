package com.automationpractice.browserselector;

import com.automationpractice.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Manishkumar Irachande
 **/


public class BrowserSelector extends BasePage {

    public void browserSelector(String browser) {

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\src\\test\\java\\com\\automationpractice\\resources\\webdriver\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.dir") + "\\src\\test\\java\\com\\automationpractice\\resources\\webdriver\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver",
                    System.getProperty("user.dir") + "\\src\\test\\java\\com\\automationpractice\\resources\\webdriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();

        } else {
            System.out.println("Wrong Browser Selected");
        }

    }
}

