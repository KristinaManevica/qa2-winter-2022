package homework3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class CompareTextElement {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By TOP_LOCATION_LINK = By.xpath(".//div[@class='tl-box']/a");

    private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void searchClickElement() {
        //test data
        String country = "Latvia";

        System.setProperty("webdriver.chrome.driver", "C:\\KM\\aqa\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://discovercars.com/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        driver.findElement(ACCEPT_COOKIES_BTN).click();

        clickCountry(country);     //vizivaem metod clickCountry (39 stroka); vizivet etot metod, peredast tuda 24 stroka country
    }

    private void clickCountry(String country) {                                   //rabotaem gde country
        List<WebElement> links = driver.findElements(TOP_LOCATION_LINK);          // List<WebElement> - rabotaem so spiskom v kotorm hranitsja tip dannih - web elementi // links - nazvanije peremennoj v kotoroj sohranitsja spisok web elementov, nazvanije vsegda mnozhestvennoje chislo//driver.findElementS - najti vse elementi po lokatoru zadannomu

        boolean isCountryFound = false;

        for (WebElement link : links) {                                 //cikl foreach; : links -> 39 stroka (mozhno vnutri foreach iz 39 stroki); po zadannomu lokatoru najdet vesj spisok elementov; WebElement link - eto budet kazhdij najdennij webelement i nazvanije peremennoj links kuda budet klastjsja chto najdeno (obichno nazvanije peremennoj = we)
            if (link.getText().equals(country)) {                       // if(link. -> tekuwij webelement(43 stroke WebElement link); .getText() - poluchaem iz nego tekst; mozhno ne text a naprimer getAttribute() - bratj attribute iz html; equels - tochnoje sovpadenije; (country) - eto iz 24 stroki
                isCountryFound = true;                                     //.equels(country) -> (country) 36 stroka
                wait.until(ExpectedConditions.elementToBeClickable(link));
                link.click();                                           //klikaem po najdennomu webelementu
                break;                                                  //vijti iz cikla
            }
        }
        Assertions.assertTrue(isCountryFound, "Country not found!");
    }
    @AfterEach                                                            //zakritije tab; posle kazhdogo testa (junit, poetomu public); vsegda otdeljnim metodom; vnezavisimosti failed ili passed; budet zakrit; obichno kommentirujut chtobi posmotretj gde upal
    public void closeDriver (){
        driver.close();                                                   //quit - celikom okno
    }
}

/*
!true = false
!false = true
 */

