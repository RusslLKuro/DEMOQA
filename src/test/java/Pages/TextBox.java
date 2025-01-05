package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox {

    WebDriver driver;

    By fullNameField = By.xpath("//*[@id='userName']");
    By emailField = By.xpath("//*[@id='userEmail']");
    By currentAddressField = By.xpath("//*[@id='currentAddress']");
    By permanentAddressField = By.xpath("//*[@id='permanentAddress']");
    By submitButton = By.xpath("//*[@id='userForm']/div[5]/div");

    public TextBox(WebDriver driver) {
        this.driver = driver;
    }

    public void submitClick(String name, String email, String currentAddress, String permanentAddress) {
        driver.findElement(fullNameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(currentAddressField).sendKeys(currentAddress);
        driver.findElement(permanentAddressField).sendKeys(permanentAddress);
    }
}
