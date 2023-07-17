package sometests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;                                              //lokatori by ID: dolzen bitj unikalen: <div id="element_id">
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
                                                                                               // (esli v konce id cifri, ili simvoli -> chto-to ne tak-> refresh, esli id pomenjalasj - avtogenirirujetsja id)
                                                                                               //by name (formi vvoda): <input type="text" name="element_name">
public class FirstSeleniumTest {                                                              //by Xpath <div class="main"> , klassi
                                                                                              //final - ne bjudet izmenina, konstanta; u lokatora tip davnnih BY
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");               //takoje pravilo boljwimi bukvami i cherez _ i v konce chto eto btn=button

    @Test
    public void openHomePageTest() {
        System.setProperty("webdriver.chrome.driver", "C://KM/aqa/chromedriver.exe");     //obrawaemsja k nawej oper sisteme, i prosim propisatj nastrojku - gde nahoditsja driver
        WebDriver browser = new ChromeDriver();                                           //webdriver - objekt oboznachaet browser okno, objekt vnutri selenium   //peremenniju prinjato nazivatkj driver
        browser.manage().window().maximize();                                             //https - nikogda s, zaodno srazu redirect provirjajem s http na https
        browser.get("http://discovercars.com/");                                          //obrawaemsja k peremennoj browser . cherez metod get() iz podskazki     (get - metod)
                                                                                          // Java -> Selenium -> ...driver...-> Browser  (driver - selenium odin, a browserov mnogo. poseredine dolzhen bitj drive, programka perevodchik mezhdu standartnim jazikom sistemi i jazikom browser
                                                                                          //! versija chroma uznatj, dlja novoj versii novij drive
                                                                                          //metod manage() - delajem chto-to s browser   (maximize rashlopnutj no ostavljajet start stroku)
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        //Thread.sleep(30000); --ploho
        browser.findElement(ACCEPT_COOKIES_BTN).click();

    //list, spiski, kollekcii











    }
}
