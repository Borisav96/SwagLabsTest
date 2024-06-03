package TEST;

import FUN.LogIn;
import FUN.SortProducts;
import org.testng.annotations.Test;

public class SortProductsByPriceHighToLowTest extends BeforeAfterTest {

    @Test
    public void sortProductsByPriceHighToLowTest() throws InterruptedException {

        LogIn.validLogIn(driver, wait);
        SortProducts.sortProductsByPrice(driver, wait);

    }

}
