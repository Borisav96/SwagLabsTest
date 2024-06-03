package TEST;

import FUN.Checkout;
import FUN.LogIn;
import org.testng.annotations.Test;

public class CheckoutTest extends BeforeAfterTest {

    @Test
    public void checkoutTest(){

        LogIn.validLogIn(driver, wait);
        Checkout.checkout(driver, wait);

    }

}
