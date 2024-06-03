package FUN;

import POM.CartPage;
import POM.ChackoutOverviewFinishPage;
import POM.CheckoutYourInformationPage;
import POM.PLPPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Checkout {

    public static void checkout(WebDriver driver, WebDriverWait wait){

        //Add item in ShoppingCart
        String itemName = driver.findElement(PLPPage.textBackpack).getText();
        driver.findElement(PLPPage.addToCardBackpack).click();
        //Open ShoppingCart
        driver.findElement(PLPPage.cartButton).click();
        //Check is right selected item in shopping cart
        String itemNameS = driver.findElement(CartPage.itemName).getText();
        Assert.assertEquals(itemName, itemNameS);
        //Continue to Checkout
        driver.findElement(CartPage.checkoutButton).click();
        driver.findElement(CheckoutYourInformationPage.firstNameField).click();
        driver.findElement(CheckoutYourInformationPage.firstNameField).sendKeys("Name");
        driver.findElement(CheckoutYourInformationPage.lastNameField).click();
        driver.findElement(CheckoutYourInformationPage.lastNameField).sendKeys("Lastname");
        driver.findElement(CheckoutYourInformationPage.postCodeField).click();
        driver.findElement(CheckoutYourInformationPage.postCodeField).sendKeys("PostCode123");
        driver.findElement(CheckoutYourInformationPage.continueButton).click();
        driver.findElement(ChackoutOverviewFinishPage.finishButton).click();
        driver.findElement(ChackoutOverviewFinishPage.backToHomePageButton).isDisplayed();



    }

}
