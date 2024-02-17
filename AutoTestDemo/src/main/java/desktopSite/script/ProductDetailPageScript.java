package desktopSite.script;

import desktopSite.common.BaseMethod;
import desktopSite.element.HomePageElement;
import desktopSite.element.ProductDetailPageElement;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class ProductDetailPageScript extends BaseMethod {

    HomePageElement homePageElement = new HomePageElement();
    ProductDetailPageElement productDetailPageElement = new ProductDetailPageElement();
    Assertion assertion = new Assertion();

    @Test
    public void check_PriceIsExist() {
        driver.findElement(homePageElement.item_TodaysBestDeal).click();
        boolean isElmentExist = driver.findElement(productDetailPageElement.price).isDisplayed();
        assertion.assertTrue(isElmentExist);
    }
}
