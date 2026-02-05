package com.internet.pages.JavaScriptAlerts;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage extends BasePage {

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='jsAlert()']")
    WebElement jsAlertButton;

    public JavaScriptAlertsPage clickOnJsAlert() {
        click(jsAlertButton);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(css = "button[onclick='jsConfirm()']")
    WebElement jsConfirmButton;

    public JavaScriptAlertsPage clickOnJsConfirm(String action) {
        click(jsConfirmButton);
        if (action != null && action.equals("Ok")) {
            driver.switchTo().alert().accept();
        } else if (action != null && action.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement jsPromptButton;

    public JavaScriptAlertsPage clickOnJsPrompt(String message) {
        click(jsPromptButton);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public JavaScriptAlertsPage verifyResultText(String text) {
        Assertions.assertTrue(isContainsText(text, result));
        return this;
    }
}