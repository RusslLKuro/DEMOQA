package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void positiveTest() {
        mainPage.open();
        elementsPage.clickTextBox();
        textBox.submitClick("Test", "test@mail.ru", "test", "test");
        driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']")).click();

    }
}
