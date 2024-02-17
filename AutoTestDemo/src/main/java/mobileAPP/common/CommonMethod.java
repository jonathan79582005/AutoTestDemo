package mobileAPP.common;

import mobileAPP.element.LogInPageElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethod extends BaseMethod{

    LogInPageElement logInPageElement = new LogInPageElement();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void login (String loginname, String password) {

        wait.until(ExpectedConditions.invisibilityOfElementLocated(logInPageElement.emailAddress));

        driver.findElement(logInPageElement.emailAddress).click();
        driver.findElement(logInPageElement.emailAddress).sendKeys(loginname);
        driver.findElement(logInPageElement.button_SignIn).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(logInPageElement.password));
        driver.findElement(logInPageElement.password).click();
        driver.findElement(logInPageElement.password).sendKeys(password);
        driver.findElement(logInPageElement.button_SignIn).click();

    }
}
