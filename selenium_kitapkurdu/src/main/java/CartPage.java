import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends basepage {

    By productNameLocator = new By.ByCssSelector("alt");



    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkifProductAdded() {

        return isDisplayed(productNameLocator);

    }


}
