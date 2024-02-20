package desktopSite.script;

import desktopSite.common.BaseMethod;
import desktopSite.common.CommonMethod;
import desktopSite.element.HomePageElement;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HomePageScript extends BaseMethod {

    HomePageElement homePageElement = new HomePageElement();
    CommonMethod commonMethod = new CommonMethod();
    Assertion assertion = new Assertion();

    @Test
    public void check_ModuleTitle() throws Exception{
        boolean isTodaysBestDealExist = driver.findElement(homePageElement.title_TodaysBestDeals).isDisplayed();
        boolean isYouMayAlsoLikeExist = driver.findElement(homePageElement.title_YouMayAlsoLike).isDisplayed();
        boolean isCategoryExist = driver.findElement(homePageElement.title_Categories).isDisplayed();

        assertion.assertTrue(isTodaysBestDealExist);
        assertion.assertTrue(isYouMayAlsoLikeExist);
        assertion.assertTrue(isCategoryExist);
    }

    @Test
    public void check_LogIn_Function() throws Exception {
        driver.findElement(homePageElement.button_SignIn).click();
        commonMethod.logIn("","");
    }

    @Test
    public void check_Search_Function() throws Exception{
        driver.findElement(homePageElement.searchBar).click();
        driver.findElement(homePageElement.searchBar).sendKeys("RTX");
        driver.findElement(homePageElement.searchBar).sendKeys(Keys.ENTER);
    }
}
