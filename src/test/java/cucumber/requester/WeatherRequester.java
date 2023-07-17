package cucumber.requester;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.model.WeatherResponse;
import org.springframework.web.client.RestTemplate;

public class WeatherRequester {
    private final String PREFIX = "http://qaguru.lv:8089/tickets/getWeather.php?id=";          //get zapros, posle ? parametri (id - eto id goroda), mozhet ljubaja id bitj v teste, poetomu delaem universljnij metod i v konce podstavljatj. Pervaja chast ssilki eto prefix

    //private final String POSTFIX = "&apiKey=tyudf7g89gtffcjgkhjk";
    //String url = PREFIX + cityId + POSTFIX;

    public WeatherResponse requestWeather(long cityId) throws JsonProcessingException {                                       //objekt nash WeatherResponse; nazvanije metoda vsegda glagol; u nas vhodnoj parametr, budem podstavljatj id goroda; id ne int a long - chto bi ne uperetsja v ganicu
        String url = PREFIX + cityId;

        RestTemplate restTemplate = new RestTemplate();                                        //sozdaem kopiju objekta RestTemplate

        //restTemplate.getForEntity(url, WeatherResponse.class);
        String jsonToParse = restTemplate.getForEntity(url, String.class).getBody();

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonToParse, WeatherResponse.class);
    }
}
