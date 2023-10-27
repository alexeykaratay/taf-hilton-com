package po.homePage;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import singleton.Singleton;
import util.Waiters;

public class SelectRoomPage {
    WebDriver driver;
    @FindBy(xpath = "//button[@data-testid='moreRatesButton']")
    WebElement buttonBookFromLocator;

    public SelectRoomPage() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public UpdateYourRatePage buttonBookFromClick() {
        Waiters.waitFor(2);
        buttonBookFromLocator.click();
        return new UpdateYourRatePage();
    }
}
