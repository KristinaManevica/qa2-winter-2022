package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseFunc {
    private WebDriver driver;
    private WebDriverWait wait;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C:\\KM\\aqa\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    public void openUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    public void selectByText(By locator, String text) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByVisibleText(text);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void type(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }

    public void type(By locator, int text) {
        type(locator, String.valueOf(text));
    }

    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public void waitForElementsCountToBe(By locator, int count) {
        wait.until(ExpectedConditions.numberOfElementsToBe(locator, count));
    }

    public void waitForMinElementsAmount(By locator, int minCount){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, minCount));
    }

    public void click(WebElement we){
        wait.until(ExpectedConditions.elementToBeClickable(we)).click();
    }
}
