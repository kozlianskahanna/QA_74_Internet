package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.FileUploader.FileUploaderPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileUploaderTests extends TestBase {

    FileUploaderPage fileUploaderPage;

    @BeforeEach
    public void preconditions() {
        driver.get("https://the-internet.herokuapp.com/upload");
        fileUploaderPage = new FileUploaderPage(driver);
    }

    @Test
    public void fileUploaderPositiveTest() {
        String filePath = "/Users/hannakozlianska/Tools/free-png.ru-377 (1).png";

        fileUploaderPage.selectFile(filePath)
                .clickUploadButton()
                .verifyFileUpload("File Uploaded!");
    }
}