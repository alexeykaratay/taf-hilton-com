package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import po.HotelsInWashingtonDcPage;
import singleton.Singleton;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class SwitchingTabs {
    WebDriver driver;

    public SwitchingTabs() {
        this.driver = Singleton.getDriver();
    }

    public static void switchingTabs(){
        Wait<WebDriver> wait = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(2));
        String originalWindow = Singleton.getDriver().getWindowHandle();
        assert Singleton.getDriver().getWindowHandles().size() == 1;
        HotelsInWashingtonDcPage hotelsInWashingtonDcPage = new HotelsInWashingtonDcPage();
        hotelsInWashingtonDcPage.buttonViewRatesClick();
        wait.until(numberOfWindowsToBe(2));
        for (String windowHandle : Singleton.getDriver().getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                Singleton.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
        wait.until(titleIs("Available Rooms - Hampton Inn Washington, D.C./White House"));
    }
}
