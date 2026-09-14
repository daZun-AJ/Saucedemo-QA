package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {

    public WebDriver driver;

    // Locators
    private final By backHomeButton = By.id("back-to-products");
    private final By generatePdfButton = By.id("generate-pdf-order");

    // Constructor
    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    // actions
    public void clickBackHome() {
        driver.findElement(backHomeButton).click();
    }

    public void clickGeneratePdfOrder() {
        driver.findElement(generatePdfButton).click();
    }
}