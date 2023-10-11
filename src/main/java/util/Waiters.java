package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import singleton.Singleton;

import java.time.Duration;
import java.util.List;

public class Waiters {
    WebDriver driver;
    public Waiters() {
        this.driver = Singleton.getDriver();
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            System.out.println("Interrupted Exception!!!");
        }
    }

    public static void waitFor(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e){
            System.out.println("Interrupted Exception!!!");
        }
    }

    public void waitForExplicit( WebElement webElement){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(d -> webElement.isDisplayed());
    }
}
