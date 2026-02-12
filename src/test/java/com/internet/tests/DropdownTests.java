package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DropdownTests extends TestBase {

    @BeforeEach
    public void setup() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    @Tag("smoky")
    public void dropdownTest() {
        new HomePage(driver)
                .getDropdownPage()
                .selectOption("Option 2")
                .verifySelected("Option 2");
    }
}