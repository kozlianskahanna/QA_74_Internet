package com.internet.pages;

import com.internet.pages.NestedFrames.NestedFramesPage;
import com.internet.core.BasePage;
import com.internet.pages.JavaScriptAlerts.JavaScriptAlertsPage;
import com.internet.pages.MultiplyWindows.MultiplyWindowsPage;
import com.internet.pages.Dropdown.DropdownPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
    WebElement jsAlertsLink;

    public JavaScriptAlertsPage getJavaScriptAlerts() {
        clickWithJS(jsAlertsLink, 0, 300);
        return new JavaScriptAlertsPage(driver);
    }

    @FindBy(xpath = "//a[text()='Multiple Windows']")
    WebElement multipleWindowsLink;

    public MultiplyWindowsPage getMultipleWindowsPage() {
        clickWithJS(multipleWindowsLink, 0, 300);
        return new MultiplyWindowsPage(driver);
    }

    @FindBy(xpath = "//a[text()='Nested Frames']")
    WebElement nestedFramesLink;

    public NestedFramesPage getNestedFramesPage() {
        clickWithJS(nestedFramesLink, 0, 300);
        return new NestedFramesPage(driver);
    }

    @FindBy(xpath = "//a[text()='Dropdown']")
    WebElement dropdownLink;

    public DropdownPage getDropdownPage() {
        clickWithJS(dropdownLink, 0, 300);
        return new DropdownPage(driver);
    }
}