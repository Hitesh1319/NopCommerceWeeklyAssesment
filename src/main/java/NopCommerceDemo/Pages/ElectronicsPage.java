package NopCommerceDemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ElectronicsPage {
    WebDriver driver;

    public static String path;
    int number;

    By electronic = By.linkText("Electronics");
    By cellPhones = By.linkText("Cell phones");
    By verifyCellProducts = By.xpath("//div[@class='picture']");
    By addToCartCellFirstProduct = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/18/1/1\"),!1']");
    By shoppingCart = By.linkText("Shopping cart");
    By radioButtonInput = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.xpath("//button[@id='checkout']");
    By billingButton = By.xpath("//button[@type='button' and @name='save' and @onclick='Billing.save()']");

    public ElectronicsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void electronicCell() {
        driver.findElement(electronic).click();
        driver.findElement(cellPhones).click();
        List<WebElement> objectDetails = driver.findElements(verifyCellProducts);
        number = objectDetails.size();
        Assert.assertEquals(number,3);
        driver.findElement(addToCartCellFirstProduct).click();
        driver.findElement(shoppingCart).click();
        driver.findElement(radioButtonInput).click();
        driver.findElement(checkoutButton).click();
    }

    public void checkout() {
        driver.findElement(shoppingCart).click();
        driver.findElement(radioButtonInput).click();
        driver.findElement(checkoutButton).click();
    }

    public void billing(){
        driver.findElement(billingButton).click();
    }
}