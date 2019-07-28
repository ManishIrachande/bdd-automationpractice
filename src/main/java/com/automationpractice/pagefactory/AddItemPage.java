package com.automationpractice.pagefactory;

import com.automationpractice.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Manishkumar Irachande
 **/


public class AddItemPage extends Util {


    private static final Logger log = LogManager.getLogger(AddItemPage.class.getName());

    @FindBy(xpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]")
    WebElement _womentTab;

    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-item-of-tablet-line']//a[@class='product-name'][contains(text(),'Printed Summer Dress')]")
    WebElement _quickView;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement _addCart;

    @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]")
    WebElement _assertCart;

    @FindBy(xpath = "//p[@id='product_reference']")
    WebElement _assertModelDemo5;

    @FindBy(xpath = "//span[@class='cross']")
    WebElement _closPopUp;

    @FindBy(xpath = "//b[contains(text(),'Cart')]")
    WebElement _cartItem;

    @FindBy(xpath = "//small[@class='cart_ref']")
    WebElement __assertDemo5;

    public void clickOnWomenTab() {
        log.info("I click On Women Tab");
        clickOnElement(_womentTab);
    }

    public void clickOnProductView() {
        log.info("I click On Cart View");
        clickOnElement(_quickView);
    }

    public void clickOnAddCart() {
        log.info("I click On Add Cart View");
        clickOnElement(_addCart);
    }

    public void clickOnClosePopUpWindow() {
        log.info("I click on close button");
        clickOnElement(_closPopUp);
    }

    public void clickOnCartProduct() {
        log.info("I click on Cart Product button");
        clickOnElement(_cartItem);
    }

    public String getAddCartText() {
        log.info("I Validate Text");
        return getTextFromElement(_assertCart);
    }

    public String getProductSKU() {
        log.info("I Validate Text Model Demo 5");
        return getTextFromElement(_assertModelDemo5);
    }

    public String getCartSKU() {
        log.info("I Validate Demo 5");
        return getTextFromElement(__assertDemo5);
    }
}
