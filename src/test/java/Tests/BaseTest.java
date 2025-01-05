package Tests;

import Pages.ElementsPage;
import Pages.MainPage;
import Pages.TextBox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    MainPage mainPage;
    ElementsPage elementsPage;
    TextBox textBox;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);
        textBox = new TextBox(driver);
    }

//    @AfterMethod (alwaysRun = true)
//    public void dropdown() {
//        driver.quit();
//    }
}
