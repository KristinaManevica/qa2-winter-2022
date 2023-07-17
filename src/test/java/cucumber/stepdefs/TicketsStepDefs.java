package cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.假如;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.safari.SafariTechPreviewDriverInfo;
import pageobject.BaseFunc;
import pageobject.model.FlightInfo;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;

import java.net.URL;
import java.util.Map;

public class TicketsStepDefs {

    private FlightInfo flightInfo;

    private BaseFunc baseFunc = new BaseFunc();

    private final String URL = "http://qaguru.lv:8089/tickets/";

    private HomePage homePage;
    private PassengerInfoPage infoPage;

    @Given("flight info:")
    public void set_flight_info(Map<String, String> params){
        flightInfo = new FlightInfo(params.get("destination"), params.get("departure"), params.get("discount"),
                Integer.parseInt(params.get("adults")), Integer.parseInt(params.get("children")),
                Integer.parseInt(params.get("luggage")), params.get("flight_date"), Integer.parseInt(params.get("seat")));
    }

    @Given("passenger info is:")
    public void set_passenger_info(Map<String, String> params){
        Passenger passenger = new Passenger(params.get("first_name"), params.get("last_name"));

        flightInfo.setPassenger(passenger);
    }

    @Given("home page is opened")
    public void open_home_page() {
        baseFunc.openUrl(URL);

        homePage = new HomePage(baseFunc);
    }

    @When("select airports")
    public void select_airports(){
        homePage.selectAirports(flightInfo.getDeparture(), flightInfo.getDestination());

        infoPage = new PassengerInfoPage(baseFunc);
    }

    @Then("selected airports appear on the next page")
    public void check_airports(){
        Assertions.assertEquals(flightInfo.getDeparture(), infoPage.getFirstFromAirport(), "Wrong departure!");
        Assertions.assertEquals(flightInfo.getDestination(), infoPage.getFirstToAirport(), "Wrong destination!");
    }
}
