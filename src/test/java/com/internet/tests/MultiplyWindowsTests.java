package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.MultiplyWindows.MultiplyWindowsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplyWindowsTests extends TestBase {

    MultiplyWindowsPage multiplyWindowsPage;

    @BeforeEach
    public void preconditions() {
        driver.get("https://the-internet.herokuapp.com/");
        multiplyWindowsPage = new HomePage(driver).getMultiplyWindowsPage();
    }

    @Test
    public void openNewWindowTest() {
        multiplyWindowsPage.clickOnClickHere()
                .switchToNewTab(1)
                .verifyNewTitle("New Window");
    }
}