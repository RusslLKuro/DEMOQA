package Tests;

import Pages.ElementsPage;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    MainPage mainPage;
    ElementsPage elementsPage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);
    }

//    @AfterMethod (alwaysRun = true)
//    public void dropdown() {
//        driver.quit();
//    }
}
