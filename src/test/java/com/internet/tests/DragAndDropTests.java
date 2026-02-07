package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.DragAndDrop.DragAndDropPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DragAndDropTests extends TestBase {

    DragAndDropPage dragAndDropPage;

    @BeforeEach
    public void preconditions() {
        dragAndDropPage = new HomePage(driver).getDragAndDropPage();
    }

    @Test
    public void dragAndDropTest() {

        dragAndDropPage.actionDragAndDrop()
                .verifyColumnAText("B")
                .verifyColumnBText("A");
    }
}