package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    By elementsButton = By.xpath("//h5[text()='Elements']");

    public void open() {
        driver.get("https://demoqa.com");
    }

    public void clickElementButton() {
        driver.findElement(elementsButton).click();
    }
}
