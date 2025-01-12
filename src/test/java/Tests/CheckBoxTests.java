package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTest {

    @Test
    public void clickHomeCheckBox() {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.clickCheckbox();
        elementsPage.checkboxesClick("Home");
        Assert.assertEquals(
                elementsPage.getTextFromSelectedField(),
                "You have selected :\n" +
                        "home\n" +
                        "desktop\n" +
                        "notes\n" +
                        "commands\n" +
                        "documents\n" +
                        "workspace\n" +
                        "react\n" +
                        "angular\n" +
                        "veu\n" +
                        "office\n" +
                        "public\n" +
                        "private\n" +
                        "classified\n" +
                        "general\n" +
                        "downloads\n" +
                        "wordFile\n" +
                        "excelFile",
                "Wrong text");
    }

    @Test
    public void selectOneElement() {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.clickCheckbox();
        elementsPage.setArrowClick("Home");
        elementsPage.setArrowClick("Desktop");
        elementsPage.checkboxesClick("Notes");
        Assert.assertEquals(
                elementsPage.getTextFromSelectedField(),
                "You have selected :\n" +
                        "notes", "wrong text");
    }

    @Test
    public void selectedCheckBox() {
        mainPage.open();
        mainPage.clickElementButton();
        elementsPage.clickCheckbox();
        elementsPage.checkboxesClick("Home");
        Assert.assertEquals(
                elementsPage.checkboxSelect("Home"),
                true,
                "checkbox is not selected");
    }
}
