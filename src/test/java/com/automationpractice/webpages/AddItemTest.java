package com.automationpractice.webpages;

import com.automationpractice.pagefactory.AddItemPage;
import com.automationpractice.testbase.TestBase;
import com.automationpractice.utility.Util;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Manishkumar Irachande
 **/


public class AddItemTest extends TestBase {

    @Test
    public  void userShouldAddItemInCart() {
        AddItemPage addItemPage = new AddItemPage();
        Util util = new Util();
        addItemPage.clickOnWomenTab();
        addItemPage.clickOnProductView();
        String p_SKU = addItemPage.getProductSKU().substring(6,12);
        addItemPage.clickOnAddCart();
        addItemPage.clickOnClosePopUpWindow();
        addItemPage.clickOnCartProduct();
        Assert.assertTrue(addItemPage.getCartSKU().endsWith(p_SKU));
        util.takescreenShotFileName("m12");
    }
}
