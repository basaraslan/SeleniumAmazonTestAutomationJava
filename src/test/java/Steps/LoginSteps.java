package Steps;

import Pages.LoginPages;
import Util.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPages loginpages = new LoginPages(driver);


    @Given("User is on homepage")
    public void userIsOnHomepage() {
        LoginPages.HomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        LoginPages.acceptCookie();
    }

    @When("User click login button")
    public void userClickLoginButton() {
        LoginPages.clickLogin();
    }

    @When("User click EmailBlank")
    public void userClickEmailBlank() {
        LoginPages.clickEmailBlank();
    }

    @And("Enter e-mail address")
    public void enterEMailAddress() {
        LoginPages.enterEmail();
    }

    @And("User press continue button")
    public void userPressContinueButton() {
        LoginPages.clickContinueButton();
    }

    @When("User click PasswordBlank")
    public void userClickPasswordBlank() {
        LoginPages.clickPasswordBlank();
    }

    @And("Enter password")
    public void enterPassword() {
        LoginPages.enterPassword();
    }

    @And("Click SignIn button")
    public void clickSignInButton() {
        LoginPages.clickSignIn();
    }


}
