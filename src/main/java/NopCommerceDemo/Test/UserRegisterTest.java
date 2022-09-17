package NopCommerceDemo.Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class UserRegisterTest extends BaseClass {
   @Test
    public void register() throws IOException {
        pageFactory.getUserRegisteration().registeringUser();
    }
}
