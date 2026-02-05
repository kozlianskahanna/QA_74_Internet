package com.internet.pages.Dropdown;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    public DropdownPage selectOption(String optionText) {
        new Select(dropdown).selectByVisibleText(optionText);
        return this;
    }

    public DropdownPage verifySelected(String expectedText) {
        String actualText = new Select(dropdown).getFirstSelectedOption().getText();
        Assertions.assertEquals(expectedText, actualText);
        return this;
    }
}