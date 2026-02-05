package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.HorizontalSlider.HorizontalSliderPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HorizontalSliderTests extends TestBase {

    HorizontalSliderPage sliderPage;

    @BeforeEach
    public void preconditions() {
        sliderPage = new HomePage(driver).getHorizontalSliderPage();
    }

    @Test
    public void moveSliderTest() {
        sliderPage.moveSliderWithKeys(10)
                .verifySliderValue("5");
    }
}