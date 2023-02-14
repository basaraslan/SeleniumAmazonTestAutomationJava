package Steps;

import Pages.CartPages;
import Util.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CartSteps {

    WebDriver driver = DriverFactory.getDriver();
    CartPages cartPages = new CartPages(driver);

    @When("Click the first product")
    public void clickTheFirstProduct() {
        CartPages.firstProduct();
    }

    @When("Add to Cart")
    public void addToCart() {
        CartPages.addCart();
    }

    @And("Close the Cart")
    public void closeTheCart() {
        CartPages.closeCart();
    }

    @And("Click the Cart")
    public void clickTheCart() {
        CartPages.clickCart();
    }


    @When("Check at cart page")
    public void checkAtCartPage() {

        CartPages.checkCart();
    }

    @When("Delete the product")
    public void deleteTheProduct() {
        CartPages.deleteProduct();

    }

}
