package com.automationpractice.utility;

import com.automationpractice.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Manishkumar Irachande
 **/


public class Util extends BasePage {


    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void sendTextToElement(By by, String str) {
        driver.findElement(by).sendKeys(str);

    }

    public String getTextFromElement(By by) {

        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {

        return element.getText();
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);

    }

    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();

    }

    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

    }

    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void selectByVisibleTextFromDropDownMenu(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }

    public void selectByVisibleTextFromDropDownMenu(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }

    public void selectByValueFromDropDownMenu(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }

    public void selectByValueFromDropDownMenu(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);

    }

    public void selectByIndexFromDropDownMenu(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

    }

    public void selectByIndexFromDropDownMenu(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }


    public void scrollUpDown(int i) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + i + ")");
    }

    public void scrollLeftRight(int i) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + i + ",0)");
    }


    public static int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);
    }

    public void mouseOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void clickAndHold(WebElement element) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
    }

    public void clickAndHold(By by) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(by)).build().perform();
    }

    public void dragAndDropElement(WebElement fromElement, WebElement toElement) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(fromElement, toElement).release().perform();
    }

    public void dragAndDropElement(WebElement element) {
        Actions actions = new Actions(driver);
        driver.switchTo().frame(1);
        actions.dragAndDropBy(element, 135, 40).build().perform();
    }

//    public void waitUntilElementToBeClickable(By by, int timeout) {
//        WebDriverWait wait = new WebDriverWait(driver, timeout);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
//
//
//    }
//
//    public void waitUntilPresenceOfElementLocated(By by, int timeout) {
//        WebDriverWait wait = new WebDriverWait(driver, timeout);
//        wait.until(ExpectedConditions.presenceOfElementLocated(by));
//
//
//    }
//
//    public void waitUntilVisibilityOfElementLocated(By by, int timeout) {
//        WebDriverWait wait = new WebDriverWait(driver, timeout);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//
//
//    }

    public boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }


    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public List<WebElement> webElementList(By by) {
        return driver.findElements(by);
    }

    public void clearTextFromField(WebElement element) {
        element.clear();


    }

    public void takescreenShotFileName(String fileName) {

        String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\com\\automationpractice\\screenshot\\";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {

            FileUtils.copyFile(scr1, new File(filePath + fileName + ".jpg"));
        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }
}
