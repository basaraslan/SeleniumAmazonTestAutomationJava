package Elements;


import org.openqa.selenium.By;



public class CartElements {

    public static By product = By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']//span[1]");
    public static By addCartButton = By.xpath("//input[@id='add-to-cart-button']");
    public static By XButton = By.id("attach-close_sideSheet-link");
    public static By cart = By.xpath("//span[@id='nav-cart-count']");
    public static By visible = By.xpath("//span[@class='a-truncate-cut']");
    public static By deleteButton = By.cssSelector("input[value='Sil']");


}
