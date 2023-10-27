package po.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import singleton.Singleton;
import util.Waiters;

public class UpdateYourRatePage {
    WebDriver driver;
    @FindBy(xpath = "//button[@data-testid='standardPriceBookCTA']")
    WebElement button2XPointBookLocator;

    public UpdateYourRatePage() {
        driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public PaymentAndGuestDetailsPage buttonBestAvailableRateClick() {
        Waiters.waitFor(1);
        button2XPointBookLocator.click();
        return new PaymentAndGuestDetailsPage();
    }
}
