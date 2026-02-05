package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import com.internet.pages.JavaScriptAlerts.JavaScriptAlertsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaScriptAlertsTests extends TestBase {

    JavaScriptAlertsPage alertsPage;

    @BeforeEach
    public void preconditions() {
        driver.get("https://the-internet.herokuapp.com/");
        alertsPage = new HomePage(driver).getJavaScriptAlerts();
    }

    @Test
    public void jsAlertTest() {
        alertsPage.clickOnJsAlert()
                .verifyResultText("You successfully clicked an alert");
    }

    @Test
    public void jsConfirmTest() {
        alertsPage.clickOnJsConfirm("Ok")
                .verifyResultText("You clicked: Ok");
    }

    @Test
    public void jsPromptTest() {
        alertsPage.clickOnJsPrompt("Hello Hanna!")
                .verifyResultText("You entered: Hello Hanna");
    }
}