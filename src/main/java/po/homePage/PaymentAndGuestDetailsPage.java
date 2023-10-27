package po.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import singleton.Singleton;
import util.Waiters;

public class PaymentAndGuestDetailsPage {
    WebDriver driver;
    @FindBy(xpath = "//span[@data-testid='totalForStayAmount']")
    WebElement totalForStayLocator;

    public PaymentAndGuestDetailsPage() {
        driver = Singleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public void printTotalForStay(){
        Waiters.waitFor(1);
        System.out.println("Total for Stay: "+totalForStayLocator.getText());
    }
}
