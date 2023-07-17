package cucumber.stepdefs;

import cucumber.requester.WeatherRequester;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.model.WeatherResponse;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Map;

public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response;

    @Given("city ID is: {long}")
    public void set_city_id(long cityId){
        this.cityId = cityId;
    }
    @When("user requests weather forecast")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);
    }
    @Then("coordinates are:")
    public void check_coordinates(Map<String, Double> params){            //tip dannih dlja key (String) i dlja value //klassika nazvatj params ili date //Double s boljwoj - ne ispolzuem primitiv, polnij klass
       Assertions.assertEquals(params.get("latitude"), response.getLat(), "Wrong lattitude");  //hashmap - map gde netu odinakovih key, perepisivajet esli odinakovije
       Assertions.assertEquals(params.get("longitude"), response.getLon(), "Wrong longitude");
    }
    @Then("timezone information is:")                                      //v step defs ne ispoljzujem And
    public void check_timezone(Map<String,String> params){                  //esli v value raznije tipi dannih - vsegda String (vsegda universalen, vsegda mozhno zapisatj v String vse)
        Assertions.assertEquals((params.get("timezone")), response.getTimezone(), "Wrong timezone_offset");
        Assertions.assertEquals((params.get("timezone_offset")), response.getTimezoneOffset(), "Wrong timezone_offset");
    }
    @Then("current weather data is:")
    public void check_weather(Map<String, String> params){
        Assertions.assertEquals((params.get("dt")), response.getCurrent().getDt(), "Wrong dt!");
        Assertions.assertEquals((params.get("sunrise")), response.getCurrent().getSunrise(), "Wrong sunrise");
        Assertions.assertEquals((params.get("sunset")), response.getCurrent().getSunset(), "Wrong sunset");
        Assertions.assertEquals((params.get("temp")), response.getCurrent().getTemp(), "Wrong temp");
    }
    @Then("alert Nr. {int} received:")
    public void check_alert(int index, Map<String, String> params){          //pervij vhodnoj parametr int iz shaga, vtoroj parametr dlja map
        String expectedSenderName = params.get("sender_name").trim().replaceAll("\\s", "");
        String expectedEventName = params.get("event").trim().replaceAll("\\s", "");

        Assertions.assertEquals(expectedSenderName, response.getAlerts().get(0).getSenderName(), "Wrong sender_name in Alerts!");
        Assertions.assertEquals(expectedEventName, response.getAlerts().get(0).getEvent(), "Wrong sender_name in Alerts!");
        Assertions.assertEquals((params.get("start")), response.getAlerts().get(0).getStart(), "Wrong start in Alerts!");
        Assertions.assertEquals((params.get("end")), response.getAlerts().get(0).getEnd(), "Wrong end in Alerts!");
        Assertions.assertEquals((params.get("description")), response.getAlerts().get(0).getDescription(), "Wrong description in Alerts!");
    }
    @Then("tags for an alert Nr. {int} are:")
    public void check_tags(int index, List<String> tags){                   //spisok vhodnoj parametr

    }
}
