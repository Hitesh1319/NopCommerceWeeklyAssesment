package NopCommerceDemo.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    static WebDriver driver;
    private UserRegistration userRegisteration;
    private ComputerPage computerPage;
    private LoginPage loginPage;
    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public UserRegistration getUserRegisteration() {
        if(userRegisteration == null) {
            userRegisteration = new UserRegistration(driver);
        }
        return userRegisteration;
    }

    public ComputerPage getComputerPage() {
        if(computerPage == null) {
            computerPage = new ComputerPage(driver);
        }
        return computerPage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return  loginPage;
    }
}
