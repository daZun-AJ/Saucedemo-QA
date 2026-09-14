package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {

    public WebDriver driver;

    // Locators
    private final By cancelButton = By.id("cancel");
    private final By finishButton = By.id("finish");

    // Constructor
    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    // actions
    public void clickFinish() {
        driver.findElement(finishButton).click();
    }

    public void clickCancel() {
        driver.findElement(cancelButton).click();
    }
}

