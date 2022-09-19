package NopCommerceDemo.Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class VerifyThatUserIsAbleToAddNotebook extends BaseClass{
    @Test
    public void notebookAddToCart() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
        pageFactory.getComputerPage().computerNotebook();
        pageFactory.getComputerPage().checkout();
        pageFactory.getLoginPage().login();
        pageFactory.getComputerPage().checkout();
        pageFactory.getComputerPage().billingAddress();
        pageFactory.getComputerPage().shippingMethod();
        pageFactory.getComputerPage().paymentMethod();
        pageFactory.getComputerPage().confirmOrder();
        pageFactory.getComputerPage().checkoutConfirm();
    }
}
