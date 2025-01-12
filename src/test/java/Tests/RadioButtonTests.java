package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTests extends BaseTest {

    @Test
    public void clickYes() {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.clickRadioButton();
        elementsPage.clickRadioButtons("Yes");
        Assert.assertEquals(
                elementsPage.messageForVerification(),
                "You have selected Yes",
                "wrong message");
    }

    @Test
    public void clickNo() {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.clickRadioButton();
        elementsPage.clickRadioButtons("No");
        Assert.assertEquals(
                elementsPage.enabledOrDisabledButtons("No"),
                false,
                "Button is enabled");
    }

    @Test
    public void secondClick() {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.clickRadioButton();
        elementsPage.clickRadioButtons("Yes");
        elementsPage.clickRadioButtons("Impressive");
        Assert.assertEquals(
                elementsPage.messageForVerification(),
                "You have selected Impressive",
                "wrong message");
    }
}
