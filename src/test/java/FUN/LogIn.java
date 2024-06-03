package FUN;

import POM.LogInPage;
import POM.PLPPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn {

    public static void validLogIn(WebDriver driver, WebDriverWait wait){
        //User LogIn
        driver.findElement(LogInPage.userNameField).sendKeys("standard_user");
        driver.findElement(LogInPage.passwordField).sendKeys("secret_sauce");
        driver.findElement(LogInPage.logInButton).click();
        driver.findElement(PLPPage.titleProducts).isDisplayed();

    }

    public static void emptyUserNameLogIn(WebDriver driver, WebDriverWait wait){

        //User try to LogIn with Empty Username field
        driver.findElement(LogInPage.passwordField).sendKeys("secret_sauce");
        driver.findElement(LogInPage.logInButton).click();
        driver.findElement(LogInPage.errorMessage).isDisplayed();

    }

}
