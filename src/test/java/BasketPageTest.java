import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BasketPageTest {

    static WebDriver driver;
    private MainPage mainPage;
    private CartPage cartPage;


    @BeforeAll
    static void setupWebDriverManager() { WebDriverManager.chromedriver().setup(); }

    @BeforeEach
    void setupAll() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://www.wildberries.ru/");
        mainPage = new MainPage(driver);
        cartPage = new CartPage(driver);

    }


    @AfterEach
    public void browserClose() {
        driver.quit();
    }

    @Test
    public void PageTest() {
        mainPage.searchForProduct("Ноутбук");
        List<Product> products = mainPage.addProductsToCartByIndex(new int [] {1, 2});
        mainPage.goToCart();
        List<Product> cartProducts = cartPage.getAllProductsData();

        Assertions.assertEquals(products.size(),cartProducts.size(),"Quantity of selected products is not equal to the quantity of products in the basket");
        Assertions.assertEquals(cartPage.getTotalPrice(), Product.getTotalPrice(products),"Total price of products is not equal");

        for (int i = 0; i < cartProducts.size(); i++) {
            Product product = products.get(i);
            Product cartProduct = cartProducts.get(i);
            Assertions.assertEquals(product.getName(),cartProduct.getName(),"Different item names");
            Assertions.assertEquals(product.getPrice(),cartProduct.getPrice(), "Price of products is not equal");
        }
    }
}
