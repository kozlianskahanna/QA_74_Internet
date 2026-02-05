package com.internet.pages.MultiplyWindows;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MultiplyWindowsPage extends BasePage {

    public MultiplyWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".example a")
    WebElement clickHereLink;

    public MultiplyWindowsPage clickOnClickHere() {
        click(clickHereLink);
        return this;
    }

    public MultiplyWindowsPage switchToNewTab(int index) {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy(css = "h3")
    WebElement sampleHeading;

    public MultiplyWindowsPage verifyNewTitle(String title) {
        Assertions.assertTrue(shouldHaveText(sampleHeading, title, 5));
        return this;
    }
}