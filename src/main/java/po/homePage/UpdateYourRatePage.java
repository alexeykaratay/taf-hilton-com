package po.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateYourRatePage {
    WebDriver driver;
    @FindBy(xpath = "//button[@data-testid='packageRatePriceBookCTA']")
    WebElement button2XPointBookLocator;

    public void button2XPointBookLocatorClick(){
        button2XPointBookLocator.click();
    }
}
