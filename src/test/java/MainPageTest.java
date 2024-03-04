import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;
    private CartPage cartPage;

    private final int GOODS_FOR_TEST = 4;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        mainPage.open();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    public void addGoodsToCartAndCheckNamePriceQuantity() throws InterruptedException {
        mainPage
                .addSomeGoodsToCart(GOODS_FOR_TEST)
                .clickHeaderCartButton();

        cartPage = new CartPage(driver);
        cartPage.addGoodsList(mainPage.getGoodList().size());


        for (int i = 0; i < mainPage.getGoodList().size(); i++) {
            int I = i;
            assertAll("Проверяем соответствие наименования, цены и количества каждого товара в корзине",
                    () -> assertEquals(mainPage.getGoodList().get(I).getName(), cartPage.getGoodList().get(I).getName()),
                    () -> assertEquals(mainPage.getGoodList().get(I).getPrice(), cartPage.getGoodList().get(I).getPrice()),
                    () -> assertEquals(mainPage.getGoodList().get(I).getQuantity(), cartPage.getGoodList().get(I).getQuantity())
            );
        }
    }

    //Проверяем общую сумму
    @Test
    public void checkTotalSum() throws InterruptedException {
        mainPage
                .addSomeGoodsToCart(GOODS_FOR_TEST)
                .clickHeaderCartButton();
        cartPage = new CartPage(driver);
        assertEquals(mainPage.getGoodsSum(), cartPage.getTotalSum());
    }

    //Проверяем общее количество
    @Test
    public void checkTotalQuantity() {
        mainPage
                .addSomeGoodsToCart(GOODS_FOR_TEST)
                .clickHeaderCartButton();

        cartPage = new CartPage(driver);
        assertEquals(mainPage.getTotalQuantity(), cartPage.getTotalGoodQuantity());
    }

}
