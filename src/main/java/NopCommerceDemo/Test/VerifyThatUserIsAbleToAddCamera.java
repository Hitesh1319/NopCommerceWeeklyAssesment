package NopCommerceDemo.Test;


import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyThatUserIsAbleToAddCamera extends BaseClass {
    @Test
    public void addCamera() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
        pageFactory.electronicsPage().addCamera();
        pageFactory.getLoginPage().login();
        pageFactory.electronicsPage().checkout();
        pageFactory.electronicsPage().billing();
        pageFactory.getComputerPage().shippingMethod();
        pageFactory.getComputerPage().paymentMethod();
        pageFactory.getComputerPage().confirmOrder();
        pageFactory.getComputerPage().checkoutConfirm();
    }
}
