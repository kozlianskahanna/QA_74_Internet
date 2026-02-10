package com.internet.pages.BrokenImages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class BrokenImagesPage extends BasePage {

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".example img")
    List<WebElement> images;

    public BrokenImagesPage checkBrokenImages() {
        System.out.println("Total image on the page=" + images.size());

        for (int i = 0; i < images.size(); i++) {
            WebElement image = images.get(i);
            String imageUrl = image.getAttribute("src");
            verifyLinks(imageUrl);
            try {
                boolean imageDisplayed = (Boolean) js.executeScript(
                        "return (typeof arguments[0].naturalWidth != 'undefined' && arguments[0].naturalWidth > 0);",
                        image);
                if (imageDisplayed) {
                    softly.assertThat(imageDisplayed).isTrue();
                    System.out.println(imageUrl + " - DISPLAY OK");
                    System.out.println("**************************************");
                } else {
                    softly.fail("Broken image -->" + imageUrl);
                    System.out.println(imageUrl + " - DISPLAY BROKEN");
                    System.out.println("**************************************");
                }
            } catch (Exception e) {
                softly.fail("ERROR occurred while checking: " + imageUrl);
                System.out.println("ERROR occurred");
            }
        }
        softly.assertAll();
        return this;
    }
}