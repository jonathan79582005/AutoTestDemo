package mobileAPP.element;

import org.openqa.selenium.By;

public class HomePageElement {

    public By searchBar = By.xpath("//android.view.ViewGroup[@content-desc=\"Search Newegg\"]/android.widget.TextView");

    public By title_TodaysBestDeals = By.xpath("//android.view.ViewGroup[@content-desc=\"TODAY'S BEST DEALS\"]/android.widget.TextView");
    public By title_YouMayAlsoLike = By.xpath("//android.view.ViewGroup[@content-desc=\"YOU MAY ALSO LIKE\"]/android.widget.TextView");
    public By title_Categories = By.xpath("");

    public By button_Search = By.xpath("");
    public By button_ShoppingCart = By.xpath("//android.widget.FrameLayout[@content-desc=\"Cart, tab, 4 out of 5\"]/android.widget.ImageView");
    public By button_SignIn = By.xpath("//android.view.ViewGroup[@content-desc=\"SIGN IN\"]/android.widget.TextView");
    public By button_GetStart = By.xpath("//android.view.ViewGroup[@content-desc='GET STARTED']");
    public By option_United_States = By.xpath("//android.view.ViewGroup[@content-desc='United States']/android.widget.TextView");
    public By button_Done = By.xpath("//android.view.ViewGroup[@content-desc=\"DONE\"]/android.widget.TextView");

    public By item_TodaysBestDeal = By.xpath("//android.view.ViewGroup[@content-desc=\"Save 27%\"]/android.view.ViewGroup[1]");
}
