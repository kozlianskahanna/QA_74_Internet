package com.internet.pages.ContextMenu;

import com.internet.core.BasePage;
import com.internet.pages.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hot-spot")
    WebElement hotSpot;

    public ContextMenuPage rightClickOnHotSpot() {
        actions.contextClick(hotSpot).perform();
        return this;
    }

    public ContextMenuPage acceptAlert() {
        driver.switchTo().alert().accept();
        return this;
    }

    public HomePage clickBackUsingKeys() {
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
        return new HomePage(driver);
    }

}