package po.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import singleton.Singleton;

public class RoomsAndGuests {
    private WebDriver driver;
    @FindBy(xpath = "//button[@aria-label='Add adult to room 1']")
    private WebElement buttonRoomsAndGuestsPlusAdultsLocator;
    @FindBy(xpath = "//button[@class='btn btn-primary-text btn-lg absolute right-0 top-0 rtl:left-0 rtl:right-auto']")
    private WebElement CloseRoomsAndGuestsCloseLocator;

    public RoomsAndGuests() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public RoomsAndGuests buttonRoomsAndGuestsPlusAdultsClick() {
        buttonRoomsAndGuestsPlusAdultsLocator.click();
        return new RoomsAndGuests();
    }

    public HomePage buttonRoomsAndGuestsCloseClick(){
        CloseRoomsAndGuestsCloseLocator.click();
        return new HomePage();
    }
}
