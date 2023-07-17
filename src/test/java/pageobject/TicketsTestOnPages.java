package pageobject;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.model.FlightInfo;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatSelectionPage;
import pageobject.pages.SuccessfulRegistrationPage;

import java.util.Random;

public class TicketsTestOnPages {

    private BaseFunc baseFunc = new BaseFunc();

    private final String URL = "http://qaguru.lv:8089/tickets/";

    @Test
    public void successfulRegistrationTest() {

        int seatNr = (RandomUtils.nextInt(1, 35));

        Passenger passenger = new Passenger("TestName", "TestSurname");
        FlightInfo flightInfo = new FlightInfo("SVO", "RIX", "TEST", 2,
                3, 2, "14-05-2018", seatNr);
        flightInfo.setPassenger(passenger);

        baseFunc.openUrl(URL);

        HomePage homePage = new HomePage(baseFunc);

        homePage.selectAirports(flightInfo.getDeparture(), flightInfo.getDestination());

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);                                                    //peredaem infoPage v browser

        infoPage.fillInPassengerInfo(flightInfo);                                                                        //peredaem naw objekt

        Assertions.assertEquals(flightInfo.getDeparture(), infoPage.getFirstFromAirport(), "Wrong first departure!");
        Assertions.assertEquals(flightInfo.getDeparture(), infoPage.getSecondFromAirport(), "Wrong second departure!");
        Assertions.assertEquals(flightInfo.getDestination(), infoPage.getFirstToAirport(), "Wrong first arrival!");
        Assertions.assertEquals(flightInfo.getDestination(), infoPage.getSecondToAirport(), "Wrong second arrival!");

        //expected v peremennoj passenger, actual to chto na dannoj stranice nahodtsja infoPage. metod
        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(), "Wrong name!");

        //proverka uslovija, ne pustaja stroka
        Assertions.assertTrue(infoPage.getPrice().length() > 0, "Error in price!");

        infoPage.book();

        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);

        seatSelectionPage.selectSeat(seatNr);

        int selectedSeat = seatSelectionPage.getSelectedSeatNr();

        Assertions.assertEquals(seatNr, selectedSeat, "Error in selected seat");

        seatSelectionPage.book();

        SuccessfulRegistrationPage successfulRegistrationPage = new SuccessfulRegistrationPage(baseFunc);

        Assertions.assertTrue(successfulRegistrationPage.isSuccessfulRegistrationTextAppears(),
                "Wrong text on successful registration page");
    }
}

