package homework3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchCompareTextElement {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By LATVIA_COUNTRY_HREF = By.xpath(".//a[@href='https://www.discovercars.com/latvia']");
    /*private final By HEADER_START_H1 = By.xpath(".//h1[contains(@class, 'home-h1 display-small')]");
    private final By HEADER_LATVIA_H1 = By.xpath(".//h1[@class= 'home-h1 display-small' and .//[contains(text(), 'Car Rental in Latvia')]");
     */


    @Test
    public void searchClickElement() {
        System.setProperty("webdriver.chrome.driver", "C:\\KM\\aqa\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://discovercars.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        driver.findElement(ACCEPT_COOKIES_BTN).click();

        String firstElement = driver.findElement(By.xpath(".//h1[contains(@class, 'home-h1 display-small')]")).getText();

        driver.findElement(LATVIA_COUNTRY_HREF).click();

        String secondElement = driver.findElement(By.xpath(".//h1[contains(@class, 'home-h1 display-small')]")).getText();

        if (firstElement.equalsIgnoreCase(secondElement)) {
            System.out.println("Something is wrong");
        } else {
            System.out.println("It is correct, two different texts in top");
        }
    }
}
