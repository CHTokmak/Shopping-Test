import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends basepage{

    By listedProductNumberLocator = By.id("faceted-search-list-total");
    By productNameLocator = new By.ByCssSelector("a.pr-img-link") {
    };

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(listedProductNumberLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
