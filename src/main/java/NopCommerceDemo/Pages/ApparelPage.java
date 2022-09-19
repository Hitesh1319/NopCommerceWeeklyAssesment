package NopCommerceDemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ApparelPage {
    WebDriver driver;
    WebDriverWait wait;

    int number;

    By apparel = By.linkText("Apparel");
    By shoes = By.linkText("Shoes");
    By verifyShoesProduct = By.xpath("//div[@class='product-item']");
    By nikeShoes = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/26/1/1\"),!1']");
    By shoppingCart = By.linkText("Shopping cart");
    By radioButtonInput = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.xpath("//button[@id='checkout']");

    public ApparelPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addShoes() {
        driver.findElement(apparel).click();
        driver.findElement(shoes).click();
        List<WebElement> objectDetails = driver.findElements(verifyShoesProduct);
        number = objectDetails.size();
        Assert.assertEquals(number, 3);
        driver.findElement(nikeShoes).click();
        driver.findElement(shoppingCart).click();
        driver.findElement(radioButtonInput).click();
        driver.findElement(checkoutButton).click();
    }
}
