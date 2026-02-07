package com.internet.pages.HoversPage;

import com.internet.core.BasePage;
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

    public HoversPage verifyUserNameSoftly(int index, String expectedName) {
        softly.assertThat(userNames.get(index).getText())
                .as("Проверка имени пользователя  " + index)
                .contains(expectedName);
        return this;
    }

    public void assertAll() {
        softly.assertAll();
    }
}