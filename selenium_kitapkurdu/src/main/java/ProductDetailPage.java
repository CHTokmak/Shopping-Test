import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends basepage{
    By addToCartButton = By.id("button-cart");



    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductDetailPage() {
        return isDisplayed(addToCartButton);

    }

    public void addToCart() {
        click(addToCartButton);
    }
}
