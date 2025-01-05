package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void positiveTest() throws InterruptedException {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.submitClick("Test", "test@mail.ru", "test", "test");


    }
}
