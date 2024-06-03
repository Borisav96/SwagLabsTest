package TEST;

import FUN.LogIn;
import org.testng.annotations.Test;

public class emptyUserNameFieldLogInTest extends BeforeAfterTest {
    @Test
    public void emptyUserNameFiledLogInTest(){
        LogIn.emptyUserNameLogIn(driver, wait);
    }
}


