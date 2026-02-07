package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.HoversPage.HoversPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HoversTests extends TestBase {

    HoversPage hoversPage;

    @BeforeEach
    public void preconditions() {
        hoversPage = new HomePage(driver).getHoversPage();
    }

    @Test
    public void hoverUserTest() {
        hoversPage.hoverOnUser(0)
                .verifyUserNameSoftly(0, "name: user1");
        hoversPage.assertAll();
    }

    @Test
    public void hoverAllUsersTest() {
        hoversPage.hoverOnUser(0).verifyUserNameSoftly(0, "name: user1");
        hoversPage.hoverOnUser(1).verifyUserNameSoftly(1, "name: user2");
        hoversPage.hoverOnUser(2).verifyUserNameSoftly(2, "name: user3");
        hoversPage.assertAll();
    }
}