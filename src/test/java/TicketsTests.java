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

public class TicketsTests {
    private WebDriver driver;          //peremennije; prinadlezhit klassu
    private WebDriverWait wait;
    private final By FROM_SELECT = By.id("afrom");
    private final By TO_SELECT = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class='gogogo']");

    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_INPUT = By.id("discount");
    private final By ADULTS_INPUT = By.id("adults");
    private final By CHILDREN_INPUT = By.id("children");
    private final By BAG_INPUT = By.id("bugs");
    private final By FLIGHT_SELECT = By.id("flight");

    @Test
    public void reservationCheck() {
        System.setProperty("webdriver.chrome.driver", "C:\\KM\\aqa\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(7));



        /* BILO
        Select airportFrom = new Select(driver.findElement(FROM_SELECT));       Select - objekt seleniuma dlja raboti s dropdown; sozdaem kopiju objekta s peremennoj airportFrom; (driver.findElement(FROM_SELECT)) -> peredajem sam webelement, ne lokator a sam dropdown najdennije po lokatoru
        airportFrom.selectByValue("RIX");                                     cherez peremennuju metod select - viberaem option atribut 'value' selectByValue("RIX")
        */
        select(FROM_SELECT, "RIX");      //posle otdeljnogo metoda iz 61 -> select - metod nazvanije metoda 61; peredaem locator i znachenije chto vibratj
        select(TO_SELECT, "SFO");

        driver.findElement(GO_BTN).click();

        /*BILO
        driver.findElement(NAME_INPUT).clear();                        ochistitj v pole vvoda snachala vse
        driver.findElement(NAME_INPUT).sendKeys("Kristina");           po bukvam vvodit
        */
       typeText(NAME_INPUT, "First Name");                //vizivaem metod typeText, locator, i chto vvesti
       typeText(SURNAME_INPUT, "Second Name");
       typeText(DISCOUNT_INPUT, "Code");
       typeText(ADULTS_INPUT, "2");
       typeText(CHILDREN_INPUT, "2");
       typeText(BAG_INPUT, "2");
       select(FLIGHT_SELECT, "13");                      //select metod potomu chto s lokatorami
    }
                                                                           //po takomu-to lokatoru najdi dropdown i takoj-to value viberi v nem
    private void select(By locator, String value) {                       //vhodnje parametri, uzlovija; metod By po takomu to lokatoru najdi dropdown i viberi value
                                                                           //metod rabotaet s dropdownom, dolzhen znatj kakoj lokator najti i kakoje znachenije vibratj
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));      //WebElement we = zhdem element, kak rezuljtat ne toljko zhdet no i beret ego esli dozhdalasj vozvrawaet, mozhno ego zapisatj v peremennuju
        Select select = new Select(we);                                   //vnutri ukazivajem najdennij element
        select.selectByValue(value);                                      //vnutrj peredaem znachenije vhodnogo parametra iz 61 stroki
    }

    private void typeText(By locator, String text) {                          //By eto tip dannih dlja lokatorov; locator - eto nazvanije peremennoj, mozhet ljuboj; String - java stroka, text -
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();                                                        //ochiwaem pole vvoda
        input.sendKeys(text);
    }

/*--DOMAWKA--
    zapolnitj polja, proveritj praviljnostj airportov, nazhimaem get price, proverjajem chto pojavilosj imja, airporti praviljnije
   i pojavilasj cena
    potom nazhimaem book
    viberaem mesto (odinakovije elementi cikli)
    proverjam chto praviljnoje mesto vibrano
    ewe raz book
   proverjam nadpisj chto uspewno

    (proverki vsegda toljko: Assertions.assertEquals(homePageFrom, reservationPageFrom, "Wrong airport");) if else neljzja, assertions ostanovit test*/
                                      //               1 peremennaja    2 peremennaja      owibka vsegda budet
                                      //                ozhidal            poluchil


    /*
    String text = "Artis is best";
    String secondText = "Artis is worst";
     teperj pervije slova podgotavlivajem
     String firstName = text.split(" ")[0];        //delim tekst po probelu; eto cherez massivi i nachalo s nulja (Artis = 0)
     String secondName = secondText.split(" ")[0];
     Assertions.assertEquals(firstName, secondName, "Incorrect");
     */







}
