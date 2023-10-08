package po.homePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import singleton.Singleton;

public class AddDates {
    private WebDriver driver;
    JavascriptExecutor js;
    private String url;
    //попробовать через css жирный шрифт и отсчитать 7 дней
    @FindBy(xpath = "//button[@tabindex='0'][contains(@class,'bg-bg-alt font-bold')]")
    private WebElement startDate;
    @FindBy(xpath = "//button[@tabindex='0'][contains(@class,'ring-1 focus:ring-1 font-bold')]//following::td[7]")
    private WebElement endDate;
    @FindBy(xpath = "//button[@class='btn btn-primary-text btn-lg absolute right-0 top-0 rtl:left-0 rtl:right-auto']")
    private WebElement closeButton;

    public AddDates() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public HomePage startDateClick() {
        startDate.click();
        return new HomePage();
    }

    public HomePage endDateClick(){
        endDate.click();
        return new HomePage();
    }

    public HomePage closeButtonClick(){
        closeButton.click();
        return new HomePage();
    }


}
