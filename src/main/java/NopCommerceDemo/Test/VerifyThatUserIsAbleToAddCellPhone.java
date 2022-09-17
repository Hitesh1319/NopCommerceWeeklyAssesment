package NopCommerceDemo.Test;

import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyThatUserIsAbleToAddCellPhone extends BaseClass{
    @Test
    public void addCellPhone() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
        pageFactory.electronicsPage().electronicCell();
        pageFactory.getLoginPage().login();
        pageFactory.electronicsPage().checkout();
        pageFactory.electronicsPage().billing();
        pageFactory.getComputerPage().shippingMethod();
        pageFactory.getComputerPage().paymentMethod();
        pageFactory.getComputerPage().confirmOrder();
        pageFactory.getComputerPage().checkoutConfirm();
    }
}
