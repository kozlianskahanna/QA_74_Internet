package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.ContextMenu.ContextMenuPage;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContextMenuTests extends TestBase {

    ContextMenuPage contextMenuPage;

    @BeforeEach
    public void preconditions(){
        contextMenuPage = new HomePage(driver).getContextMenu();
    }

    @Test
    public void contextMenuAndReturnHomeTest() {
        contextMenuPage
                .rightClickOnHotSpot()
                .acceptAlert()
                .clickBackUsingKeys();

        String currentUrl = driver.getCurrentUrl();
        Assertions.assertTrue(currentUrl.equals("https://the-internet.herokuapp.com/")
                        || currentUrl.endsWith(".com/"),
                "Ошибка: переход не выполнен. URL остался: " + currentUrl);
    }
}