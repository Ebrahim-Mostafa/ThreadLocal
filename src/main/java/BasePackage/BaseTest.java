package BasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static RemoteWebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void Setup(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
//            driver = DriverFactory.getInstance().getDriver();
//           DriverClass driver = DriverFactory.createInstance();
            DriverManager.setWebDriver(driver);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
//          driver = DriverFactory.getInstance().getDriver();
            driver = new FirefoxDriver();
//          DriverClass driver = DriverFactory.createInstance();
            DriverManager.setWebDriver(driver);
        } else if (browser.equalsIgnoreCase("Safari")) {
//            System.setProperty("webdriver.safari.noinstall", "true");
//            driver = DriverFactory.getInstance().getDriver();
            driver = new SafariDriver();
//            DriverClass driver = DriverFactory.createInstance();
            DriverManager.setWebDriver(driver);
        }
    }

    @Test
    public void getup() {
        //driver = DriverFactory.getInstance().getDriver();
        DriverManager.getDriver().manage().deleteAllCookies();
        DriverManager.getDriver().get("https://www.google.com/");
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        DriverManager.getDriver().manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);
    }

    @AfterTest
    public void teardown() {
//        DriverFactory.getInstance().getDriver().quit();
//        driver.quit();
        DriverManager.getDriver().quit();
    }
}
