package Steps;

import Pages.ProductPages;
import Util.DriverFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProductSteps {


    WebDriver driver = DriverFactory.getDriver();
    ProductPages productPages = new ProductPages(driver);



    @When("Click the search button")
    public void clickTheSearchButton() {
        ProductPages.clickSearch();
    }

    @When("Write product name")
    public void writeProductName() {
        ProductPages.writeProduct();
    }

    @When("Click search button")
    public void clickSearchButton() {
        ProductPages.searchButton();
    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        ProductPages.filterAmazon();
    }

    @When("Filter for Apple")
    public void filterForApple() {
        ProductPages.filterApple();
    }


}
