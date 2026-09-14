package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    public WebDriver driver;

    // locators
    private final By pageTitle = By.className("title");

    private final By productSortDropdown = By.className("product_sort_container");

    private final By cartButton = By.className("shopping_cart_link");

    private final By menuButton = By.id("react-burger-menu-btn");

    // Product locators
    private final By backpackAddToCart = By.id("add-to-cart-sauce-labs-backpack");

    private final By bikeLightAddToCart = By.id("add-to-cart-sauce-labs-bike-light");

    private final By boltTShirtAddToCart = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    private final By fleeceJacketAddToCart = By.id("add-to-cart-sauce-labs-fleece-jacket");

    private final By onesieAddToCart = By.id("add-to-cart-sauce-labs-onesie");

    private final By redTShirtAddToCart = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");


    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }


    // actions

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }


    public void addBackpackToCart() {
        driver.findElement(backpackAddToCart).click();
    }


    public void addBikeLightToCart() {
        driver.findElement(bikeLightAddToCart).click();
    }


    public void addBoltTShirtToCart() {
        driver.findElement(boltTShirtAddToCart).click();
    }


    public void addFleeceJacketToCart() {
        driver.findElement(fleeceJacketAddToCart).click();
    }


    public void addOnesieToCart() {
        driver.findElement(onesieAddToCart).click();
    }


    public void addRedTShirtToCart() {
        driver.findElement(redTShirtAddToCart).click();
    }


    public void clickCart() {
        driver.findElement(cartButton).click();
    }


    public void clickMenu() {
        driver.findElement(menuButton).click();
    }


    public void selectSortOption(String option) {

        driver.findElement(productSortDropdown).click();

        // Example:
        // az = Name (A to Z)
        // za = Name (Z to A)
        // lohi = Price (low to high)
        // hilo = Price (high to low)

        driver.findElement(
                By.cssSelector(
                        "option[value='" + option + "']"
                )
        ).click();
    }
}

