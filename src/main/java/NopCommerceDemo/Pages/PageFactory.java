package NopCommerceDemo.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    static WebDriver driver;
    private UserRegistration userRegisteration;
    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public UserRegistration getUserRegisteration() {
        if(userRegisteration == null) {
            userRegisteration = new UserRegistration(driver);
        }
        return userRegisteration;
    }
}
