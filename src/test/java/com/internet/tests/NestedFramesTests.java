package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.NestedFrames.NestedFramesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NestedFramesTests extends TestBase {

    NestedFramesPage nestedFramesPage;

    @BeforeEach
    public void setup() {
        driver.get("https://the-internet.herokuapp.com/");
        nestedFramesPage = new HomePage(driver).getNestedFramesPage();
    }

    @Test
    public void nestedFramesTest() {
        nestedFramesPage
                .verifyNestedFramesTextSoftly()
                .assertAll();
    }
}