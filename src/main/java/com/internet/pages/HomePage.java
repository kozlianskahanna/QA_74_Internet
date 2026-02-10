package com.internet.pages;

import com.internet.pages.BrokenImages.BrokenImagesPage;
import com.internet.pages.ContextMenu.ContextMenuPage;
import com.internet.pages.DragAndDrop.DragAndDropPage;
import com.internet.pages.FileUploader.FileUploaderPage;
import com.internet.pages.HorizontalSlider.HorizontalSliderPage;
import com.internet.pages.HoversPage.HoversPage;
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
        click(jsAlertsLink);
        return new JavaScriptAlertsPage(driver);
    }

    @FindBy(xpath = "//a[text()='Multiple Windows']")
    WebElement multipleWindowsLink;

    public MultiplyWindowsPage getMultiplyWindowsPage() {
        click(multipleWindowsLink);
        return new MultiplyWindowsPage(driver);
    }

    @FindBy(xpath = "//a[text()='Nested Frames']")
    WebElement nestedFramesLink;

    public NestedFramesPage getNestedFramesPage() {
        click(nestedFramesLink);
        return new NestedFramesPage(driver);
    }

    @FindBy(xpath = "//a[text()='Dropdown']")
    WebElement dropdownLink;

    public DropdownPage getDropdownPage() {
        click(dropdownLink);
        return new DropdownPage(driver);
    }

    @FindBy(xpath = "//a[text()='Drag and Drop']")
    WebElement dragAndDropLink;

    public DragAndDropPage getDragAndDropPage() {
        click(dragAndDropLink);
        return new DragAndDropPage(driver);
    }

    @FindBy(xpath = "//a[text()='Horizontal Slider']")
    WebElement horizontalSliderLink;

    public HorizontalSliderPage getHorizontalSliderPage() {
        click(horizontalSliderLink);
        return new HorizontalSliderPage(driver);
    }

    @FindBy(xpath = "//a[text()='Hovers']")
    WebElement hoversLink;

    public HoversPage getHoversPage() {
        click(hoversLink);
        return new HoversPage(driver);
    }

    @FindBy(xpath = "//a[text()='Context Menu']")
    WebElement contextMenuLink;

    public ContextMenuPage getContextMenu() {
        click(contextMenuLink);
        return new ContextMenuPage(driver);
    }

    @FindBy(xpath = "//a[text()='File Upload']")
    WebElement fileUploadLink;

    public FileUploaderPage getFileUploaderPage() {
        click(fileUploadLink);
        return new FileUploaderPage(driver);
    }

    @FindBy(xpath = "//a[text()='Broken Images']")
    WebElement brokenImagesLink;

    public BrokenImagesPage getBrokenImagesPage() {
        click(brokenImagesLink);
        return new BrokenImagesPage(driver);
    }
}