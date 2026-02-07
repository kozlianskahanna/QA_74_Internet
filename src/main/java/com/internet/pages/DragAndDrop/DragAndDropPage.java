package com.internet.pages.DragAndDrop;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement columnA;

    @FindBy(id = "column-b")
    WebElement columnB;

    public DragAndDropPage actionDragAndDrop() {
        waitOfElementVisibility(columnA, 10);
        actions.dragAndDrop(columnA, columnB).perform();
        return this;
    }

    /* public DragAndDropPage verifyElementText(WebElement element, String expectedText) {
        Assertions.assertTrue(shouldHaveText(element, expectedText, 5));
        return this;
    }*/

    public DragAndDropPage verifyColumnAText(String expectedText) {
        Assertions.assertTrue(shouldHaveText(columnA, expectedText, 5));
        return this;
    }

    public DragAndDropPage verifyColumnBText(String expectedText) {
        Assertions.assertTrue(shouldHaveText(columnB, expectedText, 5));
        return this;
    }
}