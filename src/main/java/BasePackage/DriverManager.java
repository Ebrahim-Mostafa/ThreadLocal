package BasePackage;

import org.openqa.selenium.WebDriver;

public class DriverManager {
//    private static ThreadLocal<DriverClass> driver = new ThreadLocal<DriverClass>();
//
//    public static DriverClass getDriver() {
//        return driver.get();
//    }
//
//    public static void setDriver(DriverClass drive) {
//        driver.set(drive);
//    }
private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }
}
