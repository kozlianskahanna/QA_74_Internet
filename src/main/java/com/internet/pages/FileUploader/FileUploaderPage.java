package com.internet.pages.FileUploader;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploaderPage extends BasePage {

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement fileUploadInput;

    public FileUploaderPage selectFile(String path) {
        fileUploadInput.sendKeys(path);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement fileSubmitButton;

    public FileUploaderPage clickUploadButton() {
        click(fileSubmitButton);
        return this;
    }

    @FindBy(css = "h3")
    WebElement successHeader;

    public FileUploaderPage verifyFileUpload(String expectedText) {
        Assertions.assertTrue(shouldHaveText(successHeader, expectedText, 10));
        return this;
    }
}