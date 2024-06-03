package POM;

import org.openqa.selenium.By;

public class LogInPage {

    public static By userNameField = By.id("user-name");
    public static By passwordField = By.id("password");
    public static By logInButton = By.id("login-button");
    public static By errorMessage = By.xpath("//div[@class='error-message-container error']");


}
