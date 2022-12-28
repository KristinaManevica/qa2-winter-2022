package homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FlyTicketsTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By FROM_SELECT = By.id("afrom");
    private final By TO_SELECT = By.id("bfrom");
    private final By GO_BTN = By.xpath(" .//span[@class='gogogo']");

    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_INPUT = By.id("discount");
    private final By ADULTS_INPUT = By.id("adults");
    private final By CHILDREN_INPUT = By.id("children");
    private final By LUGGAGE_INPUT = By.id("bugs");
    private final By FLIGHT_SELECT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span[@onclick='setLang();']");
    private final By RESPONSE_SELECT = By.xpath(".//div[@id='response']/span");


    @Test
    public void reservationCheck() throws InterruptedException {
        //test data
        String name = "Kristina";
        String surname = "Berzinja";
        String discount = "KRI";
        String adultCount = "2";
        String childrenCount = "2";
        String luggage = "1";


        System.setProperty("webdriver.chrome.driver", "C:\\KM\\aqa\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(7));

        select(FROM_SELECT, "RIX");
        select(TO_SELECT, "SFO");

        driver.findElement(GO_BTN).click();

        typeText(NAME_INPUT, name);
        typeText(SURNAME_INPUT, surname);
        typeText(DISCOUNT_INPUT, discount);
        typeText(ADULTS_INPUT, adultCount);
        typeText(CHILDREN_INPUT, childrenCount);
        typeText(LUGGAGE_INPUT, luggage);
        select(FLIGHT_SELECT, "15");


        driver.findElement(GET_PRICE_BTN).click();

        String airportFrom = driver.findElement(FROM_SELECT).getText();
        String airportTo = driver.findElement(TO_SELECT).getText();

        List<WebElement> responses  = driver.findElements(RESPONSE_SELECT);
        String airportSelectedFrom = responses.get(0).getText();
        String airportSelectedTo = responses.get(1).getText();
   //     String selectedName = responses.get(0).getText();

        Assertions.assertEquals(airportFrom, airportSelectedFrom, "Departure airports are not the same!");
        Assertions.assertEquals(airportTo, airportSelectedTo, "Arrival airports are not the same!");
   //     Assertions.assertEquals(name, selectedName, "Names are not the same!");


     /*
        WebElement inputName = driver.findElement(By.xpath(".//div[@id='response']/span"));
        String value = inputName.getText();

        Assertions.assertEquals(name, value, "Names are correct");

        logika:
        get List<webelement> with Name , from, to
                                 0         1    2
        poluchitj soderzhimoje iz webelementa - .getText() -> String generirujet

        String fromAirport = data (iz spiska).get(1).getText() -> "RIX"
        Assertion.equals(1 peremennaja, fromAirport, "Error");
        */
    }

    private void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    private void typeText(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }
}
