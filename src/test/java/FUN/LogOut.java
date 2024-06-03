package FUN;

import POM.LogInPage;
import POM.PLPPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut {

    public static void LogOut(WebDriver driver, WebDriverWait wait){

        //Click on button paths to LogOut button
        driver.findElement(PLPPage.hamburgerButton).click();
        driver.findElement(PLPPage.logOutButton).click();
        driver.findElement(LogInPage.userNameField).isDisplayed();

    }

}
