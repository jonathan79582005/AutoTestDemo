package desktopSite.element;

import org.openqa.selenium.By;

public class ProductDetailPageElement {

    public By price = By.xpath("(//ul[@class = 'price'])[1]");
    public By button_AddToCart = By.xpath("//button[@class = 'btn btn-primary btn-wide'][text() = 'Add to cart ']");
    public By button_NoThanks = By.xpath("//button[@type = 'button'][text() = 'No, thanks']");


}
