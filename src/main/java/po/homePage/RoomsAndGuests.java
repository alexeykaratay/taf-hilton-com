package po.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import po.HotelsInWashingtonDcPage;
import singleton.Singleton;

public class RoomsAndGuests {
    private WebDriver driver;
    @FindBy(xpath = "//button[@aria-label='Add adult to room 1']")
    private WebElement roomsAndGuestsPlusAdultsButton;
    @FindBy(xpath = "//button[@class='btn btn-primary-text btn-lg absolute right-0 top-0 rtl:left-0 rtl:right-auto']")
    private WebElement roomsAndGuestsCloseButton;

    public RoomsAndGuests() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public RoomsAndGuests roomsAndGuestsPlusAdultsButtonClick() {
        roomsAndGuestsPlusAdultsButton.click();
        return new RoomsAndGuests();
    }

    public HomePage roomsAndGuestsCloseButtonClick(){
        roomsAndGuestsCloseButton.click();
        return new HomePage();
    }

}
