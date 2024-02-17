package desktopSite.element;

import org.openqa.selenium.By;

public class LogInPageElement {

    public By emailAddress = By.xpath("//input[@type = 'email']");
    public By password = By.xpath("//input[@id = 'labeled-input-password']");
    public By button_SignIn = By.xpath("//button[@id = 'signInSubmit']");

}
