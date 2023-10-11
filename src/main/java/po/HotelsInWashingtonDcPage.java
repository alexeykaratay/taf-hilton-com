package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import po.homePage.SelectRoomPage;
import singleton.Singleton;
import util.Waiters;

import java.time.Duration;
import java.util.List;

public class HotelsInWashingtonDcPage {
    WebDriver driver;
    @FindBy(xpath = "//h3[@data-testid='listViewPropertyName']")
    List<WebElement> selectHotelsAddLocator;
    @FindBy(xpath = "/h3[@data-testid='listViewPropertyName']")
    WebElement addSelect;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-md sm:btn-lg mt-2 self-end btn-md sm:btn-lg']")
    List<WebElement> buttonViewRatesLocator;

    public HotelsInWashingtonDcPage() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public HotelsInWashingtonDcPage getTextAddHotelsWashingtonDc() {
        System.out.println(selectHotelsAddLocator.get(0).getText());
        return new HotelsInWashingtonDcPage();
    }

    public SelectRoomPage buttonViewRatesClick() {
        Waiters.waitFor(2);
        buttonViewRatesLocator.get(0).click();
        return new SelectRoomPage();
    }
}
