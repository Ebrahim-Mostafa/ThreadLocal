package SearchTest;

import BasePackage.BaseTest;
import BasePackage.DriverManager;
import SearchPage.GooglePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class GoogleRun extends BaseTest {
    public static GooglePage GP;

    @Test(priority = 1)
    public void URLCheck() {
//        driver= DriverFactory.getInstance().getDriver();
//        DriverManager.getDriver();
        String current_url = "https://www.google.com/";
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, current_url, "Incorrect URL");
    }

    @Test(priority = 2)
    public void TitleCheck() {
//        driver= DriverFactory.getInstance().getDriver();
//        DriverManager.getDriver();
        boolean title = driver.getTitle().contains("instabug");
        Assert.assertTrue(title, "Incorrect Google Search Title");
    }

    @Test(priority = 3)
    public void checkicon() {
//        driver= DriverFactory.getInstance().getDriver();
//        DriverManager.getDriver();
        GP = new GooglePage();
        Assert.assertTrue(GP.iconpresence());
    }

    @Test(priority = 4)
    public void SearchCheck() {
//      driver= DriverFactory.getInstance().getDriver();
//        DriverManager.getDriver();
        GP = new GooglePage();
        String Text = "instabug";
        GP.Search(Text);
    }
}
