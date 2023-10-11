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
    @FindBy(xpath = "//button[@tabindex='0'][contains(@class,'bg-bg-alt font-bold')]//following::td[1]")
    private WebElement buttonStartDateLocator;
    @FindBy(xpath = "//button[@tabindex='0'][contains(@class,'bg-bg-alt font-bold')]//following::td[8]")
    private WebElement buttonEndDateLocator;
    @FindBy(xpath = "//button[@class='btn btn-primary-text btn-lg absolute right-0 top-0 rtl:left-0 rtl:right-auto']")
    private WebElement buttonCloseLocator;

    public AddDates() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public AddDates startDateClick() {
        buttonStartDateLocator.click();
        return new AddDates();
    }

    public AddDates endDateClick(){
        buttonEndDateLocator.click();
        return new AddDates();
    }

    public HomePage buttonCloseDateClick(){
        buttonCloseLocator.click();
        return new HomePage();
    }


}
