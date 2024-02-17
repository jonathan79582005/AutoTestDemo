package mobileAPP.script;

import mobileAPP.common.BaseMethod;
import mobileAPP.element.HomePageElement;
import mobileAPP.element.ProductDetailPageElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class ProductDetailPageScript extends BaseMethod {

    HomePageElement homePageElement = new HomePageElement();
    ProductDetailPageElement productDetailPageElement = new ProductDetailPageElement();
    Assertion assertion = new Assertion();

    @Test
    public void check_PriceIsExist() {
        driver.findElement(homePageElement.item_TodaysBestDeal).click();
        boolean isElementExist = driver.findElement(productDetailPageElement.price).isDisplayed();
        assertion.assertTrue(isElementExist);

    }
}
