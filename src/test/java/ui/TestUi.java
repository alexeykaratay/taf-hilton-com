package ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import po.homePage.HomePage;
import po.homePage.SelectRoomPage;
import singleton.Singleton;
import util.SwitchingTabs;
import util.Waiters;

public class TestUi extends BaseTest {
    @DisplayName("Test Washington DS")
    @Test
    public void test1() {
        HomePage homePage = new HomePage();
        homePage
                .InputTextWhereTo()
                .dateButtonClick()
                .startDateClick()
                .endDateClick()
                .buttonCloseDateClick()
                .roomsAndGuestsClick()
                .buttonRoomsAndGuestsPlusAdultsClick()
                .buttonRoomsAndGuestsCloseClick()
                .buttonFindAHotelClick()
                .getTextAddHotelsWashingtonDc()
                .buttonViewRatesClick();
        Waiters.waitFor(5);
    }
}
