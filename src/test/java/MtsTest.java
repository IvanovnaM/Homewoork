import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*Необходимо написать автотесты для сайта mts.by. Суть тестов заключается в проверке блока
 «Онлайн пополнение без комиссии»:
 */

public class MtsTest {
    static WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("cookie-agree")).click();
    }

    @AfterEach
    void close() {
        driver.close();
    }

    @Test
        /*Проверить название указанного блока;*/
    void testName() {
        WebElement nameBlock = driver.findElement(By.xpath("//*[@class=\"pay__wrapper\"]/h2"));
        assertTrue(nameBlock.isDisplayed() && nameBlock.isEnabled());
        assertEquals(nameBlock.getText(), "Онлайн пополнение\n" +
                "без комиссии");
    }


    @Test
        /*Проверить наличие логотипов платёжных систем;*/
    void testPartners() {
        List<WebElement> partners = driver.findElements(By.xpath("//*[@class=\"pay__partners\"]/ul/li"));
        partners.forEach(partner -> assertTrue(partner.isDisplayed() && partner.isEnabled()));
        assertEquals(partners.size(), 6);

    }

    @Test
        /*Проверить работу ссылки «Подробнее о сервисе»;*/
    void testClickUrl() {
        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        Assertions.assertEquals(driver.getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }

    @Test
    /*Заполнить поля и проверить работу кнопки «Продолжить» (проверяем только вариант
    «Услуги связи», номер для теста 297777777)*/
    void testBtnContinue() {
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.click();
        phone.sendKeys("297777777");

        WebElement phoneField = driver.findElement(By.id("connection-sum"));
        phoneField.click();
        phoneField.sendKeys("10");

        WebElement email = driver.findElement(By.id("connection-email"));
        email.click();
        email.sendKeys("luna@mail.ru");


        String xpath = "//*[@id=\"pay-connection\"]/button";
        driver.findElement(By.xpath(xpath)).click();

    }
}
