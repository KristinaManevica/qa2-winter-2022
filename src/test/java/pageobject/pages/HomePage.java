package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class HomePage {
    private final By FROM_SELECT = By.id("afrom");
    private final By TO_SELECT = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class='gogogo']");
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectAirports(String from, String to) {
        baseFunc.select(FROM_SELECT, from);
        baseFunc.select(TO_SELECT, to);
        baseFunc.click(GO_BTN);
    }
}
