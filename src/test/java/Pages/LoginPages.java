package Pages;


import Elements.LoginElements;
import Util.DriverFactory;
import Util.ElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPages {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);

    }


    public static void HomePage() {
    }

    public static void acceptCookie() {

        elementHelper.click(LoginElements.acceptButton);
    }


    public static void clickLogin() {

        elementHelper.click(LoginElements.loginButton);

    }

    public static void clickEmailBlank() {

        elementHelper.click(LoginElements.emailBlank);
    }


    public static void enterEmail() {

        elementHelper.sendKey(LoginElements.emailBlank, DriverFactory.getEmail());


    }


    public static void clickContinueButton() {
        elementHelper.click(LoginElements.continueButton);

    }

    public static void clickPasswordBlank() {
        elementHelper.click(LoginElements.passwordBlank);


    }


    public static void enterPassword() {

        elementHelper.sendKey(LoginElements.passwordBlank, DriverFactory.getPassword());

    }


    public static void clickSignIn() {

        elementHelper.click(LoginElements.SignInButton);



    }




}
