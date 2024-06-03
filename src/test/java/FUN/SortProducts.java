package FUN;

import POM.PLPPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortProducts {

    public static void sortProductsByPrice(WebDriver driver, WebDriverWait wait){

        //Make Array list containing prices
        List <WebElement> pricesOne = driver.findElements(By.className("inventory_item_price"));

        List<Double> newPricesOneList = new ArrayList<>();

        for (WebElement p : pricesOne) {
            newPricesOneList.add(Double.valueOf(p.getText().replace("$", "")));
        }

        //Click on drop down button and select Sort Prices (High to Low)
        Select dropdown = new Select(driver.findElement(PLPPage.sortingButton));
        dropdown.selectByVisibleText("Price (high to low)");

        //Add sorted prices to new ArrayList
        List <WebElement> pricesTwo = driver.findElements(By.className("inventory_item_price"));

        List<Double> newPricesTwoList = new ArrayList<>();

        for (WebElement p : pricesTwo) {
            newPricesTwoList.add(Double.valueOf(p.getText().replace("$", "")));
        }

        //Sort first ArrayList by Price from High to Low
        Collections.sort(newPricesOneList);
        Collections.reverse(newPricesOneList);

        //Compare two ArrayLists
        Assert.assertEquals(newPricesOneList, newPricesTwoList);



    }

}
