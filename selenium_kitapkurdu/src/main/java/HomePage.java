import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends basepage{

    SearchBox searchBox;
    By cartCountLocator = By.id("cart-items");
    By cartIconLocator = By.id("sprite-cart-icon");
    By cartToGoLocator = By.id("js-cart");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCount() {
        return getCartCount() > 0;
    }



    public void goToCart() {
        click(cartIconLocator);
    }

    public void goTogoToCart() {

        click(cartToGoLocator);
    }


    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

}
