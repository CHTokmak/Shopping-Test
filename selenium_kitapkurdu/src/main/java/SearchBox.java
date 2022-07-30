import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchBox extends basepage{

    By searchBoxLocator = By.id("search-input");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator,text);
        type(searchBoxLocator, String.valueOf(Keys.ENTER));

    }
}
