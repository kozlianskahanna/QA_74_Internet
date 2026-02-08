package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.ContextMenu.ContextMenuPage;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContextMenuTests extends TestBase {

    ContextMenuPage contextMenuPage;

    @BeforeEach
    public void preconditions() {
        contextMenuPage = new HomePage(driver).getContextMenu();
    }

    @Test
    public void contextMenuAndReturnHomeTest() {
        contextMenuPage
                .rightClickOnHotSpot()
                .acceptAlert()
                .clickBackUsingKeys();
    }

}

// ? убедиться, что вы вернулись на домашнюю страницу?