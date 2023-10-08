package ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import po.homePage.HomePage;
import singleton.Singleton;

public class BaseTest {
    @BeforeEach
    public void before() {
        HomePage homePage = new HomePage();
        homePage.openHomePage();
    }

    @AfterEach
    public void after() {
        Singleton.quitDriver();
    }

}
