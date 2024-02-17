package desktopSite.script;

import desktopSite.common.BaseMethod;
import desktopSite.element.CartPageElement;
import desktopSite.element.HomePageElement;
import desktopSite.element.ProductDetailPageElement;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CartPageScript extends BaseMethod {

    HomePageElement homePageElement = new HomePageElement();
    ProductDetailPageElement productDetailPageElement = new ProductDetailPageElement();
    CartPageElement cartPageElement = new CartPageElement();

    Assertion assertion = new Assertion();

    @Test
    public void check_SecureCheckOutButton() {

        driver.findElement(homePageElement.item_TodaysBestDeal).click();
        driver.findElement(productDetailPageElement.button_AddToCart).click();
        driver.findElement(productDetailPageElement.button_NoThanks).click();

        boolean isElementExist = driver.findElement(cartPageElement.button_SecureCheckOut).isDisplayed();

        assertion.assertTrue(isElementExist);
    }


}
