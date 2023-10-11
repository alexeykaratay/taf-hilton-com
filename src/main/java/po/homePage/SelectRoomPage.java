package po.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import singleton.Singleton;

public class SelectRoomPage {
    WebDriver driver;
    @FindBy
    WebElement buttonBookFromLocator;

    public SelectRoomPage() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void ButtonBookFromClick(){
        buttonBookFromLocator.click();
    }
}
