package homework3;

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
        String country = "Latvia";

        System.setProperty("webdriver.chrome.driver", "C:\\KM\\aqa\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://discovercars.com/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        driver.findElement(ACCEPT_COOKIES_BTN).click();

        clickCountry(country);
    }

    private void clickCountry(String country) {
        List<WebElement> links = driver.findElements(TOP_LOCATION_LINK);

        boolean isCountryFound = false;

        for (WebElement link : links) {
            if (link.getText().equals(country)) {
                isCountryFound = true;
                wait.until(ExpectedConditions.elementToBeClickable(link));
                link.click();
                break;
            }
        }
        Assertions.assertTrue(isCountryFound, "Country not found!");
    }
}

