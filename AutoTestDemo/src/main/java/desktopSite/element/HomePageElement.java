package desktopSite.element;

import org.openqa.selenium.By;

public class HomePageElement {

    public By searchBar = By.xpath("//input[@type = 'search']");

    public By title_TodaysBestDeals = By.xpath("");
    public By title_YouMayAlsoLike = By.xpath("");
    public By title_Categories = By.xpath("");

    public By button_Search = By.xpath("//button[@class = 'ico ico-search']");
    public By button_ShoppingCart = By.xpath("//a[@title = 'Shopping Cart']");
    public By button_SignIn = By.xpath("//i[@class = 'ico ico-user header2021-nav-icon']");

    public By item_TodaysBestDeal = By.xpath("(//div[@class = 'grid-col radius-m bg-gradient-lightblue'])[1]");

}
