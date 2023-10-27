package steps;

import po.homePage.HomePage;
import po.homePage.SelectRoomPage;
import util.SwitchingTabs;

public class Step {
    public static void runTest(){
        new HomePage()
                .InputTextWhereTo()
                .dateButtonClick()
                .startDateClick()
                .endDateClick()
                .buttonCloseDateClick()
                .roomsAndGuestsClick()
                .buttonRoomsAndGuestsPlusAdultsClick()
                .buttonRoomsAndGuestsCloseClick()
                .buttonFindAHotelClick()
                .PrintTextAddHotelsWashingtonDc();

        SwitchingTabs.switchingTabs();

        new SelectRoomPage()
                .buttonBookFromClick()
                .buttonBestAvailableRateClick()
                .printTotalForStay();
    }
}
