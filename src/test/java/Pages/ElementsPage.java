package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {

    WebDriver driver;

    By textBox = By.xpath("//*[@id='item-0']");

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTextBox() {
        driver.findElement(textBox).click();
    }
}
