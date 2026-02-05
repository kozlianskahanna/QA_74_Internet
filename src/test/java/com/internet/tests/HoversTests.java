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
                .verifyUserName(0, "name: user1");
    }

    @Test
    public void hoverAllUsersTest() {
        hoversPage.hoverOnUser(0).verifyUserName(0, "name: user1");
        hoversPage.hoverOnUser(1).verifyUserName(1, "name: user2");
        hoversPage.hoverOnUser(2).verifyUserName(2, "name: user3");
    }
}