package po.homePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import po.HotelsInWashingtonDcPage;
import singleton.Singleton;

public class HomePage {
    private WebDriver driver;
    JavascriptExecutor js;
    private String url = "https://www.hilton.com/en/";
    private String textInputInWhereTo = "Washington, District of Columbia, US";
    @FindBy(xpath = "//input[@aria-label='Where to?. Begin typing to filter results.']")
    private WebElement whereToInput;
    @FindBy(xpath = "//div[@class='flex w-36 items-center justify-center whitespace-nowrap md:w-auto md:ltr:pl-2 md:ltr:first-of-type:pl-0 md:rtl:pr-2 md:rtl:first-of-type:pr-0']/..")
    private WebElement dateButton;
    @FindBy(xpath = "//button[@data-testid='search-rooms-button']")
    private WebElement roomsAndGuests;
    @FindBy(xpath = "//button[@data-testid='search-submit-button']")
    private WebElement buttonFindAHotel;


    public HomePage() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public HomePage openHomePage() {
        driver.get(url);
        return new HomePage();
    }


    public HomePage InputTextWhereTo() {
        whereToInput.sendKeys(textInputInWhereTo);
        return new HomePage();
    }

    public HotelsInWashingtonDcPage buttonFindAHotelClick() {
        buttonFindAHotel.click();
        return new HotelsInWashingtonDcPage();
    }

    public RoomsAndGuests roomsAndGuestsClick() {
        roomsAndGuests.click();
        return new RoomsAndGuests();
    }

    public AddDates dateButtonClick() {
        dateButton.click();
        return new AddDates();
    }

}
