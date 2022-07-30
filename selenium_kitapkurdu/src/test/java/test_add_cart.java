import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.util.Random;

public class test_add_cart extends basetest {

    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;


    @Test
    @Order(1)
    public void search_roman(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.searchBox().search("Roman");
        Assertions.assertTrue(productPage.isOnProductPage() , "Not on Products Page");

    }

    @Test
    @Order(2)
    public void select_roman(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        Random rnd = new Random();
        int i = rnd.nextInt(10);
        productPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isProductDetailPage(), "Not on Product Detail Page");

    }

    @Test
    @Order(3)
    public void add_roman(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCount(), "Product Count did not increase");

    }

    @Test
    @Order(4)
    public void go_cart(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        productDetailPage.addToCart();
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkifProductAdded(), "Product could not added");

    }

    @Test
    @Order(5)
    public void goto_cart(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        productDetailPage.addToCart();
        homePage.goTogoToCart();

    }







}
