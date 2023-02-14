package Pages;

import Elements.ProductElements;
import ScreenShot.SnapShot;
import Util.DriverFactory;
import Util.ElementHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

import static java.util.UUID.randomUUID;

public class ProductPages {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public ProductPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);

    }





    public static void clickSearch() {

        elementHelper.click(ProductElements.searchClick);


    }

    public static void writeProduct() {


        elementHelper.sendKey(ProductElements.searchClick, DriverFactory.getProductName());


    }


    public static void searchButton() {

        elementHelper.click(ProductElements.searchMagnify);
        /*
        try {

        } catch (Exception e) {
            SnapShot.takeSnapShot(driver, DriverFactory.getDirectory() + randomUUID() + ".png");
            driver.quit();
        }

*/


    }


    public static void filterAmazon() {

        elementHelper.click(ProductElements.checkBoxAmazon);


    }

    public static void filterApple() {

        elementHelper.click(ProductElements.checkBoxApple);


    }


}
