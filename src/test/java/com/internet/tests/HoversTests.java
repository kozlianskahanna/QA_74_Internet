package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.HoversPage.HoversPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class HoversTests extends TestBase {

    HoversPage hoversPage;

    @BeforeEach
    public void preconditions() {
        new HomePage(driver).getHoversPage();
        hoversPage=new HoversPage(driver);
    }

    @Test
    @Tag("smoky")

    public void hoverUserTest() {
        hoversPage.hoverOnUser(0)
                .verifyUserNameSoftly(0, "name: user1");
    }
}