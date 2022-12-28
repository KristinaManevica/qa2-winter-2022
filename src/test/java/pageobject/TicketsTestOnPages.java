package pageobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;

public class TicketsTestOnPages {

    private BaseFunc baseFunc = new BaseFunc();

    private final String URL = "http://qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT = "RIX";
    private final String AIRPORT_TO = "SFO";

    @Test
    public void successfulRegistrationTest() {
        Passenger passenger = new Passenger("TestName", "TestSurname", "MANKRI", 2,
                2, 2, "15-05-2018");

        baseFunc.openUrl(URL);

        HomePage homePage = new HomePage(baseFunc);

        homePage.selectAirports(FROM_AIRPORT, AIRPORT_TO);

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);                     //peredaem infoPage v browser

        infoPage.fillInPassengerInfo(passenger);                                          //peredaem naw objekt

        Assertions.assertEquals(FROM_AIRPORT, infoPage.getFirstFromAirport(), "Wrong first departure!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getSecondFromAirport(), "Wrong second departure!");
        Assertions.assertEquals(AIRPORT_TO, infoPage.getFirstToAirport(), "Wrong first arrival!");
        Assertions.assertEquals(AIRPORT_TO, infoPage.getSecondToAirport(), "Wrong second arrival!");

                       //expected v peremennoj passenger, actual to chto na dannoj stranice nahodtsja infoPage. metod
        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(), "Wrong name!");

        //proverka uslovija, ne pustaja stroka
        Assertions.assertTrue(infoPage.getPrice().length() > 0, "Error in price!");


    }
}

