package NopCommerceDemo.Test;

import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyThatUserIsAbleToAddClothes extends BaseClass {
    @Test
    public void addClothes() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
        pageFactory.getApparelPage().addClothes();
        pageFactory.getLoginPage().login();
        pageFactory.getElectronicsPage().checkout();
        pageFactory.getElectronicsPage().billing();
        pageFactory.getComputerPage().shippingMethod();
        pageFactory.getComputerPage().paymentMethod();
        pageFactory.getComputerPage().confirmOrder();
        pageFactory.getComputerPage().checkoutConfirm();
    }
}
