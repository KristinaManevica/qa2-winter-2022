import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    @Test
    public void openHomePageTest() {
        System.setProperty("webdriver.chrome.driver", "C://KM/aqa/chromedriver.exe");    //obrawaemsja k nawej oper sisteme, i prosim propisatj nastrojku - gde nahoditsja driver
        WebDriver browser = new ChromeDriver();                                           //webdriver - objekt oboznachaet browser okno, objekt vnutri selenium   //peremenniju prinjato nazivatkj driver
        browser.get("http://discovercars.com/");                                          //https - nikogda s, zaodno srazu redirect provirjajem s http na https
                                                                                         //obrawaemsja k peremennoj browser . cherez metod get() iz podskazki     (get - metod)
    }                                                                                    // Java -> Selenium -> ...driver...-> Browser  (driver - selenium odin, a browserov mnogo. poseredine dolzhen bitj drive, programka perevodchik mezhdu standartnim jazikom sistemi i jazikom browser
}                                                                                       //! versija chroma uznatj, dlja novoj versii novij driver

