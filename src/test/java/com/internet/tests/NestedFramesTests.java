package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NestedFramesTests extends TestBase {

    @BeforeEach
    public void setup() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void nestedFramesTest() {
        new HomePage(driver)
                .getNestedFramesPage()
                .verifyNestedFramesText();
    }
}