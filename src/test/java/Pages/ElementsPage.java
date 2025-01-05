package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {

    WebDriver driver;

//    By textBox = By.cssSelector(".text");
    By textBox = By.id("item-0");
    By fullNameField = By.xpath("//*[@id='userName']");
    By emailField = By.xpath("//*[@id='userEmail']");
    By currentAddressField = By.xpath("//*[@id='currentAddress']");
    By permanentAddressField = By.xpath("//*[@id='permanentAddress']");
//    By submitButton = By.xpath("//button[text()='Submit']");
    By submitButton = By.id("submit");



    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTextBox() {
        driver.findElement(textBox).click();
    }

    public void submitClick(String name, String email, String currentAddress, String permanentAddress) {
        driver.findElement(fullNameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(currentAddressField).sendKeys(currentAddress);
        driver.findElement(permanentAddressField).sendKeys(permanentAddress);
        driver.findElement(submitButton).click();
    }
}
