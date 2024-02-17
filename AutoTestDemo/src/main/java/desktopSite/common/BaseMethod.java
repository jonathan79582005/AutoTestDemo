package desktopSite.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseMethod {

    public WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void set(){
        driver.get("https://www.newegg.com/");
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
