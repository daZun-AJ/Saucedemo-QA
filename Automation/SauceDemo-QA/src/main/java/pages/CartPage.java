package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    public WebDriver driver;

    // locators
    private final By checkoutButton = By.id("checkout");
    private final By continueShoppingButton = By.id("continue-shopping");

    // Product buttons
    private final By backpackRemoveButton = By.id("remove-sauce-labs-backpack");
    private final By bikeLightRemoveButton = By.id("remove-sauce-labs-bike-light");
    private final By boltTShirtRemoveButton = By.id("remove-sauce-labs-bolt-t-shirt");
    private final By fleeceJacketRemoveButton = By.id("remove-sauce-labs-fleece-jacket");
    private final By onesieRemoveButton = By.id("remove-sauce-labs-onesie");
    private final By redTShirtRemoveButton = By.id("remove-test.allthethings()-t-shirt-(red)");


    public CartPage(WebDriver driver) {
        this.driver = driver;
    }


    // actions
    public void removeBackpack() {
        driver.findElement(backpackRemoveButton).click();
    }

    public void removeBikeLight() {
        driver.findElement(bikeLightRemoveButton).click();
    }

    public void removeBoltTShirt() {
        driver.findElement(boltTShirtRemoveButton).click();
    }

    public void removeFleeceJacket() {
        driver.findElement(fleeceJacketRemoveButton).click();
    }

    public void removeOnesie() {
        driver.findElement(onesieRemoveButton).click();
    }

    public void removeRedTShirt() {
        driver.findElement(redTShirtRemoveButton).click();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public void clickContinueShopping() {
        driver.findElement(continueShoppingButton).click();
    }
}
