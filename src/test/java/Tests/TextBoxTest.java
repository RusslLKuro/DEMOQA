package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void positiveTest() {
        mainPage.open();
        elementsPage.clickTextBox();
        elementsPage.submitClick("Test", "test@mail.ru", "test", "test");
//        driver.findElement(By.xpath("//button[text()='Submit']")).click();



    }
}
