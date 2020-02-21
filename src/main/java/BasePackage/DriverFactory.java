package BasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class DriverFactory {
    static WebDriver createInstance(String browser) {
        WebDriver driver = null;
            if (browser.equalsIgnoreCase("Chrome")) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
        if (browser.equalsIgnoreCase("firefox")) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }
        if (browser.equalsIgnoreCase("Safari")) {
        driver = new SafariDriver();
        return driver;

    }
        return driver;

//    public static DriverClass createInstance() {
//        DriverClass driver = new DriverClass();
//        return driver;
//    }
 /**   private DriverFactory() {
        //Do-nothing..Do not allow to initialize this class from outside
    }

    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance() {
        return instance;
    }
    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
    {
        @Override
        public WebDriver initialValue() {
//            return new ChromeDriver();
            return new FirefoxDriver(); // can be replaced with other browser drivers
//            return new SafariDriver();

        }
    };

//    public WebDriver getDriver() // call this method to get the driver object and launch the browser
//    {
//        return driver.get();
//    }

//    public void removeDriver() // Quits the driver and closes the browser
//    {
//        driver.get().quit();
//        driver.remove();
//    }**/
}
}
