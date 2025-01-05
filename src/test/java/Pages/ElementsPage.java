package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {

    WebDriver driver;
    By textBox = By.id("item-0");
    By fullNameField = By.xpath("//*[@id='userName']");
    By emailField = By.xpath("//*[@id='userEmail']");
    By currentAddressField = By.xpath("//*[@id='currentAddress']");
    By permanentAddressField = By.xpath("//*[@id='permanentAddress']");
    By submitButton = By.xpath("//button[text()='Submit']");

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void submitClick(String name, String email, String currentAddress, String permanentAddress) throws InterruptedException {
        driver.findElement(textBox).click();
        driver.findElement(fullNameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(currentAddressField).sendKeys(currentAddress);
        driver.findElement(permanentAddressField).sendKeys(permanentAddress);
        Thread.sleep(2500);
        driver.findElement(submitButton).click();
    }
}
