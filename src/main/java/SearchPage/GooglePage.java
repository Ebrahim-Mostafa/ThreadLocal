package SearchPage;

import BasePackage.BaseTest;
import BasePackage.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BaseTest {
    public GooglePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "hplogo")
    WebElement google_icon;

    @FindBy(name = "btnK")
    WebElement Search_btn;

    @FindBy(name = "btnI")
    WebElement lucky_btn;

    @FindBy(name = "q")
    WebElement Search_Field;

    public boolean iconpresence() {
        boolean icon_appear = google_icon.isDisplayed();
        return icon_appear;
    }

    public String searchbtn(){
        String search_btn = Search_btn.getText();
        return  search_btn;
    }

    public String luckybtn(){
        String lucky_btnn = lucky_btn.getText();
        return lucky_btnn;
    }

    public void Search(String search_txt) {
        Search_Field.click();
        Search_Field.clear();
        Search_Field.sendKeys(search_txt);
        Search_Field.submit();
    }

}
