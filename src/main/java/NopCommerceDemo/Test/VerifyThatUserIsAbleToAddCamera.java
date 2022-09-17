package NopCommerceDemo.Test;


import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyThatUserIsAbleToAddCamera extends BaseClass {
    @Test
    public void addCamera() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
        pageFactory.getElectronicsPage().addCamera();
        pageFactory.getLoginPage().login();
        pageFactory.getElectronicsPage().checkout();
        pageFactory.getElectronicsPage().billing();
        pageFactory.getComputerPage().shippingMethod();
        pageFactory.getComputerPage().paymentMethod();
        pageFactory.getComputerPage().confirmOrder();
        pageFactory.getComputerPage().checkoutConfirm();
    }
}
