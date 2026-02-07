package com.internet.pages.NestedFrames;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions; // Оставляем для комментариев
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage extends BasePage {

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    /*
    public NestedFramesPage verifyNestedFramesText() {
        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-left");
        Assertions.assertTrue(driver.findElement(By.tagName("body")).getText().contains("LEFT"));

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        Assertions.assertTrue(driver.findElement(By.id("content")).getText().contains("MIDDLE"));

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        Assertions.assertTrue(driver.findElement(By.tagName("body")).getText().contains("BOTTOM"));

        return this;
    }
    */


    public NestedFramesPage verifyNestedFramesTextSoftly() {

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        softly.assertThat(driver.findElement(By.tagName("body")).getText())
                .as("Проверка текста в левом фрейме")
                .contains("LEFT");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        softly.assertThat(driver.findElement(By.id("content")).getText())
                .as("Проверка текста в среднем фрейме")
                .contains("MIDDLE");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        softly.assertThat(driver.findElement(By.tagName("body")).getText())
                .as("Проверка текста в нижнем фрейме")
                .contains("BOTTOM");

        driver.switchTo().defaultContent();

        return this;
    }

    public void assertAll() {
        softly.assertAll();
    }
}