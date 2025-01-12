package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {

    @Test
    public void positiveTest() throws InterruptedException {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.submitClick("Test", "test@mail.ru", "test", "test");
        Assert.assertEquals(elementsPage.getTextFromFieldOfMessage(),
                "Name:Test\n" +
                        "Email:test@mail.ru\n" +
                        "Current Address :test\n" +
                        "Permananet Address :test",
                "Неверное отображение текста");
    }

    @Test
    public void wrongEmail() throws InterruptedException {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.submitClick("Test", "test", "test", "test");
        Assert.assertEquals(elementsPage.getTextFromFieldOfMessage(),
                "",
                "отображение текста при неверном заполнении формы");
    }
}
