package mobileAPP.script;

import mobileAPP.common.BaseMethod;
import mobileAPP.common.CommonMethod;
import mobileAPP.element.HomePageElement;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HomePageScript extends BaseMethod {

    HomePageElement homePageElement = new HomePageElement();
    CommonMethod commonMethod = new CommonMethod();
    Assertion assertion = new Assertion();

    @Test
    public void check_ModuleTitle() {
        boolean isTodaysBestDealExist = driver.findElement(homePageElement.title_TodaysBestDeals).isDisplayed();
        boolean isYouMayAlsoLikeExist = driver.findElement(homePageElement.title_YouMayAlsoLike).isDisplayed();
        boolean isCategoryExist = driver.findElement(homePageElement.title_Categories).isDisplayed();

        assertion.assertTrue(isCategoryExist);
        assertion.assertTrue(isTodaysBestDealExist);
        assertion.assertTrue(isYouMayAlsoLikeExist);
    }

    @Test
    public void check_LogIn_Function() {
        driver.findElement(homePageElement.button_SignIn).click();
        commonMethod.login("jonathan.j.shen@newegg.com", "Aa123456");
    }

    @Test
    public void check_Search_Function() throws Exception {
        driver.findElement(homePageElement.searchBar).click();
        driver.findElement(homePageElement.searchBar).sendKeys("RTX");
        driver.findElement(homePageElement.searchBar).sendKeys(Keys.ENTER);
    }
}
