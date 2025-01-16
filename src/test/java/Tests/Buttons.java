package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Buttons extends BaseTest{

    @Test
    public void oneClick() {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.clickButton("Click Me");
        Assert.assertEquals(
                elementsPage.getTextDynamicMessage(),
                "You have done a dynamic click",
                "not clicked");
    }

    @Test
    public void doubleClick() {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.doubleClickButton("Double Click Me");
        Assert.assertEquals(
                elementsPage.getTextDoubleMessage(),
                "You have done a double click",
                "not clicked");
    }

    @Test
    public void rightClick() {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.rightClickButton("Right Click Me");
        Assert.assertEquals(
                elementsPage.getTextRightMessage(),
                "You have done a right click",
                "not clicked");
    }
}
