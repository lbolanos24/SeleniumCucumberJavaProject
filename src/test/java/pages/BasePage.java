package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    
    static{
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
         wait = new WebDriverWait(driver,driver.manage().timeouts().getImplicitWaitTimeout());
    }

    public BasePage(WebDriver driver){
        BasePage.driver=driver;
        wait = new WebDriverWait(driver, driver.manage().timeouts().getImplicitWaitTimeout());
    }

    public static void navigateTo (String url){
        driver.get(url);
        wait.getClass();
    }
}
