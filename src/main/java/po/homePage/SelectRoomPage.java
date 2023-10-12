package po.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import singleton.Singleton;

import java.util.List;

public class SelectRoomPage {
    WebDriver driver;
    @FindBy(xpath = "//button[@data-testid='moreRatesButton']")
    WebElement buttonBookFromLocator;

    public SelectRoomPage() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public UpdateYourRatePage buttonBookFromClick() {
        buttonBookFromLocator.click();
        return new UpdateYourRatePage();
    }
}
