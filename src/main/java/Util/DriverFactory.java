package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static WebDriver driver;
    static Properties properties;


    public static WebDriver initialize_Driver(String browser) {
        properties = ConfigReader.getProperties();

        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

        String url = properties.getProperty("url");
        int pageWait = Integer.parseInt(properties.getProperty("pageLoadTimeout"));
        int impWait = Integer.parseInt(properties.getProperty("implicityWait"));


        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);


        return getDriver();

    }

    public static String getDirectory() {
        properties = ConfigReader.getProperties();
        String screenshotDirectory = properties.getProperty("screenshotPath");
        return screenshotDirectory;
    }

    public static String getEmail() {
        properties = ConfigReader.getProperties();
        String email = properties.getProperty("userEmail");
        return email;

    }

    public static String getPassword() {
        properties = ConfigReader.getProperties();
        String password = properties.getProperty("userPassword");
        return password;

    }

    public static String getProductName() {
        properties = ConfigReader.getProperties();
        String product = properties.getProperty("searchedProduct");
        return product;
    }


    public static WebDriver getDriver() {
        return driver;
    }


}
