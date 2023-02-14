package Pages;

import Elements.CartElements;
import Util.ElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CartPages {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public CartPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);

    }


    public static void firstProduct() {


        elementHelper.click(CartElements.product);

    }

    public static void addCart() {

        elementHelper.click(CartElements.addCartButton);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeCart() {
        elementHelper.click(CartElements.XButton);
    }

    public static void clickCart() {
        elementHelper.click(CartElements.cart);
    }


    public static void checkCart() {
        elementHelper.checkVisible(CartElements.visible);

    }


    public static void deleteProduct() {

        elementHelper.click(CartElements.deleteButton);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
