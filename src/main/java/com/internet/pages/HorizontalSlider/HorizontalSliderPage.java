package com.internet.pages.HorizontalSlider;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends BasePage {

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sliderContainer input")
    WebElement slider;

    @FindBy(id = "range")
    WebElement sliderValue;

   /* public HorizontalSliderPage moveSliderWithKeys(int steps) {
        waitOfElementVisibility(slider, 10);
        click(slider);

        for (int i = 0; i < steps; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
            }
        return this;
    }*/

    public HorizontalSliderPage moveSlider(int xOffset) {
        waitOfElementVisibility(slider, 10);
        actions.dragAndDropBy(slider, xOffset, 0).perform();
        return this;
    }

    public HorizontalSliderPage verifySliderValue(String expectedValue) {
        Assertions.assertEquals(expectedValue, sliderValue.getText());
        return this;
    }

}