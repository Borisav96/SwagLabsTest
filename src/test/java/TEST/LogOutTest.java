package TEST;

import FUN.LogIn;
import FUN.LogOut;
import POM.LogInPage;
import org.testng.annotations.Test;

public class LogOutTest extends BeforeAfterTest {

    @Test
    public void logOutTest(){

        LogIn.validLogIn(driver,wait);
        LogOut.LogOut(driver,wait);

    }

}
