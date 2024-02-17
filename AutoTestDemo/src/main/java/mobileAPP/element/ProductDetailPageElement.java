package mobileAPP.element;

import org.openqa.selenium.By;

public class ProductDetailPageElement {

    public By price = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]");
    public By button_AddToCart = By.xpath("//android.view.ViewGroup[@content-desc=\"ADD TO CART\"]/android.widget.TextView");
    public By button_NoThanks = By.xpath("");
}
