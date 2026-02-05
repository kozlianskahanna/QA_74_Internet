package com.internet.pages.HoversPage;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class HoversPage extends BasePage {

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".figure")
    List<WebElement> userAvatars;

    @FindBy(css = ".figcaption h5")
    List<WebElement> userNames;

    public HoversPage hoverOnUser(int index) {
        waitOfElementVisibility(userAvatars.get(0), 10);
        actions.moveToElement(userAvatars.get(index)).perform();
        return this;
    }

    public HoversPage verifyUserName(int index, String expectedName) {
        Assertions.assertTrue(shouldHaveText(userNames.get(index), expectedName, 5));
        return this;
    }
}