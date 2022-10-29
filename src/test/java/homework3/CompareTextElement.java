package homework3;

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
    private final By LATVIA_COUNTRY_HREF = By.xpath(".//a[@href='https://www.discovercars.com/latvia']");

    @Test
    public void searchClickElement() {
        System.setProperty("webdriver.chrome.driver", "C:\\KM\\aqa\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://discovercars.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        driver.findElement(ACCEPT_COOKIES_BTN).click();

        List<WebElement> firstElement = driver.findElements(By.xpath(".//h1[contains(@class, 'home-h1 display-small')]"));

        driver.findElement(LATVIA_COUNTRY_HREF).click();

        List<WebElement> secondElement = driver.findElements(By.xpath(".//h1[contains(@class, 'home-h1 display-small')]"));

        if (firstElement.equals(secondElement)) {
            System.out.println("Something is wrong");
        } else {
            System.out.println("It is correct, two different texts in element");
        }
    }
}
