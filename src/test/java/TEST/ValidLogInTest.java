package TEST;

import FUN.LogIn;
import org.testng.annotations.Test;

public class ValidLogInTest extends BeforeAfterTest {

    @Test
    public void validLogInTest(){
        LogIn.validLogIn(driver, wait);
    }

}
