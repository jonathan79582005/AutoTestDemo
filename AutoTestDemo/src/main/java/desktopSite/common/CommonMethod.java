package desktopSite.common;

import desktopSite.element.LogInPageElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethod extends BaseMethod{

    LogInPageElement logInPageElement = new LogInPageElement();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );

    public void logIn (String loginName, String password) {

        wait.until(ExpectedConditions.invisibilityOfElementLocated(logInPageElement.emailAddress));

        driver.findElement(logInPageElement.emailAddress).click();
        driver.findElement(logInPageElement.emailAddress).sendKeys(loginName);
        driver.findElement(logInPageElement.button_SignIn).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(logInPageElement.password));
        driver.findElement(logInPageElement.password).click();
        driver.findElement(logInPageElement.password).sendKeys(password);
        driver.findElement(logInPageElement.button_SignIn).click();
    }
}
