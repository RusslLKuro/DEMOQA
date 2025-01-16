package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementsPage {

    WebDriver driver;
    Actions actions;

    By textBox = By.id("item-0");
    By fullNameField = By.xpath("//*[@id='userName']");
    By emailField = By.xpath("//*[@id='userEmail']");
    By currentAddressField = By.xpath("//*[@id='currentAddress']");
    By permanentAddressField = By.xpath("//*[@id='permanentAddress']");
    By submitButton = By.xpath("//button[text()='Submit']");
    By messageField = By.xpath("//*[@id='output']/div");
    By checkBox = By.id("item-1");
    By selectedText = By.xpath("//div[@id='result']");
    String arrowClick = "//span[text()='%s']//ancestor::span[@class='rct-text']//button";
    String checkboxes = "//span[text()='%s']";
    By radioButton = By.id("item-2");
    String radioButtons = "//label[text()='%s']";
    By youHaveSelectedMessage = By.xpath("//p[@class='mt-3']");
    By webTablets = By.id("item-3");
    By addButton = By.xpath("//button[@id='addNewRecordButton']");
    By firstName = By.xpath("//input[@placeholder ='First Name']");
    By lastName = By.xpath("//input[@placeholder ='Last Name']");
    By mail = By.xpath("//input[@placeholder ='name@example.com']");
    By age = By.xpath("//input[@placeholder ='Age']");
    By salary = By.xpath("//input[@placeholder ='Salary']");
    By department = By.xpath("//input[@placeholder ='Department']");
    By search = By.xpath("//input[@placeholder ='Type to search']");
    By buttonSubmit = By.xpath("//button[@id='submit']");
    By registrationFormText = By.xpath("//div[text()='Registration Form']");
    By rowGroup = By.xpath("//div[@class='rt-tr-group']");
    By buttonButton = By.id("item-4");
    String oneClickButton = "//button[text()='%s']";
    By dynamicMessage = By.xpath("//p[@id='dynamicClickMessage']");
    By doubleMessage = By.xpath("//p[@id='doubleClickMessage']");
    By rightMessage = By.xpath("//p[@id='rightClickMessage']");

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

    public void submitClick(String name, String email, String currentAddress, String permanentAddress) {
        driver.findElement(textBox).click();
        driver.findElement(fullNameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(currentAddressField).sendKeys(currentAddress);
        driver.findElement(permanentAddressField).sendKeys(permanentAddress);
        driver.findElement(submitButton).click();
    }

    public String getTextFromFieldOfMessage() {
        return driver.findElement(messageField).getText();
    }

    public void clickCheckbox() {
        driver.findElement(checkBox).click();
    }

    public String getTextFromSelectedField() {
        return driver.findElement(selectedText).getText();
    }

    public void setArrowClick(String arrowName) {
        driver.findElement(By.xpath(String.format(arrowClick, arrowName))).click();
    }

    public void checkboxesClick(String element) {
        driver.findElement(By.xpath(String.format(checkboxes, element))).click();
    }

    public boolean checkboxSelect(String element) {
        return driver.findElement(By.xpath(String.format(checkboxes, element))).isSelected();
    }

    public void clickRadioButton() {
        driver.findElement(radioButton).click();
    }

    public void clickRadioButtons(String element) {
        driver.findElement(By.xpath(String.format(radioButtons, element))).click();
    }

    public String messageForVerification() {
        return driver.findElement(youHaveSelectedMessage).getText();
    }

    public boolean enabledOrDisabledButtons(String element) {
        return driver.findElement(By.xpath(String.format(radioButtons, element))).isSelected();
    }

    public void setWebTablets() {
        driver.findElement(webTablets).click();
        driver.findElement(addButton).click();
    }

    public void registrationForm(String name,
                                 String lastNameField,
                                 String email,
                                 String ageOld,
                                 String salaryField,
                                 String departmentField,
                                 String searchField) {
        driver.findElement(firstName).sendKeys(name);
        driver.findElement(lastName).sendKeys(lastNameField);
        driver.findElement(mail).sendKeys(email);
        driver.findElement(age).sendKeys(ageOld);
        driver.findElement(salary).sendKeys(salaryField);
        driver.findElement(department).sendKeys(departmentField);
        driver.findElement(buttonSubmit).click();
        driver.findElement(search).sendKeys(searchField);
    }

    public String getTextRow() {
        return driver.findElement(rowGroup).getText();
    }

    public void clickButton(String button) {
        driver.findElement(buttonButton).click();
        actions.click(driver.findElement(By.xpath(String.format(oneClickButton, button)))).perform();
    }

    public void doubleClickButton(String button) {
        driver.findElement(buttonButton).click();
        actions.doubleClick(driver.findElement(By.xpath(String.format(oneClickButton, button)))).perform();
    }

    public void rightClickButton(String button) {
        driver.findElement(buttonButton).click();
        actions.contextClick(driver.findElement(By.xpath(String.format(oneClickButton, button)))).perform();
    }

    public String getTextDynamicMessage() {
        return driver.findElement(dynamicMessage).getText();
    }

    public String getTextDoubleMessage() {
        return driver.findElement(doubleMessage).getText();
    }

    public String getTextRightMessage() {
        return driver.findElement(rightMessage).getText();
    }
}
