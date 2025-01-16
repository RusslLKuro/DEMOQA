package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTests extends BaseTest{

    @Test
    public void addSearch() {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.setWebTablets();
        elementsPage.registrationForm("TextForTest",
                "B",
                "a@mail.ru",
                "22",
                "280",
                "D",
                "a@mail.ru");
        Assert.assertEquals(
                elementsPage.getTextRow(),
                "TextForTest\n" +
                        "B\n" +
                        "22\n" +
                        "a@mail.ru\n" +
                        "280\n" +
                        "D",
                "поиск не удался");
    }
}
