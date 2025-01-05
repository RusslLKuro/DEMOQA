package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {

    WebDriver driver;
//    String TextBox = "/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[1]/span";
//    By textBox = By.cssSelector(".text");
    By textBox = By.id("item-0");
    By fullNameField = By.xpath("//*[@id='userName']");
    By emailField = By.xpath("//*[@id='userEmail']");
    By currentAddressField = By.xpath("//*[@id='currentAddress']");
    By permanentAddressField = By.xpath("//*[@id='permanentAddress']");
    By submitButton = By.xpath("//button[text()='Submit']");
//    By submitButton = By.id("submit");
//    By submitButton = By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div/button");
//    By submitButton = By.cssSelector(".btn btn-primary");
//    By submitButton = By.cssSelector("#submit");
//    By submitButton = By.xpath("//*[@id='userForm']/div[5]");

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
