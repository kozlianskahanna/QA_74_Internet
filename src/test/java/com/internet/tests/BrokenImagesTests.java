package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.BrokenImages.BrokenImagesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BrokenImagesTests extends TestBase {
    BrokenImagesPage brokenImagesPage;

    @BeforeEach
    public void preconditions() {
        brokenImagesPage=new HomePage(driver).getBrokenImagesPage();
    }

    @Test
    public void checkBrokenImagesTest() {
        brokenImagesPage.checkBrokenImages();
    }
}