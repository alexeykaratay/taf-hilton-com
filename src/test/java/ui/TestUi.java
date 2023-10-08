package ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import po.HotelsInWashingtonDcPage;
import po.homePage.HomePage;
import util.Waiters;

public class TestUi extends BaseTest {
    @DisplayName("Test Washington DS")
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        Waiters.waitFor(1);
        HotelsInWashingtonDcPage hotelsInWashingtonDcPage = homePage
                .InputTextWhereTo()
                .roomsAndGuestsClick()
                .roomsAndGuestsPlusAdultsButtonClick()
                .roomsAndGuestsCloseButtonClick()
                .buttonFindAHotelClick();
        Waiters.waitFor(5);

    }
}
