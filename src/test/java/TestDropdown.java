import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestDropdown  {
    static WebDriver driver;
    private Actions actions;


    private Actions getActions() {
        if(actions == null) {
            actions = new Actions(driver);
        }
        return actions;
    }

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
    public void scrollPage() {
        WebElement dropdown = driver.findElement(By.cssSelector("#pay-section .select button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",dropdown);
        getActions().moveToElement(dropdown).click().perform();
    }


    @Test
    public void placeholderHomeInternetTest(){
        scrollPage();
        WebElement homeInternet = driver.findElement(By.xpath("//p[@class='select__option'][contains(.,'Домашний интернет')]"));
        getActions().moveToElement(homeInternet).click().perform();

        WebElement phoneNumberInternet = driver.findElement(By.id("internet-phone"));
        WebElement internetSum = driver.findElement(By.id("internet-sum"));
        WebElement internetEmail = driver.findElement(By.id("internet-email"));


        Assertions.assertEquals("Номер абонента",phoneNumberInternet.getAttribute("placeholder"));
        Assertions.assertEquals("Сумма",internetSum.getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека",internetEmail.getAttribute("placeholder"));
    }
    @Test
    public void placeholderInstallmentTest () {
        scrollPage();

        WebElement installment = driver.findElement(By.xpath("//p[@class='select__option'][contains(.,'Рассрочка')]"));
        getActions().moveToElement(installment).click().perform();

        WebElement scoreInstalment = driver.findElement(By.id("score-instalment"));
        WebElement internetSum = driver.findElement(By.id("internet-sum"));
        WebElement instalmentEmail= driver.findElement(By.id("instalment-email"));


        Assertions.assertEquals("Номер счета на 44",scoreInstalment.getAttribute("placeholder"));
        Assertions.assertEquals("Сумма",internetSum.getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека",instalmentEmail.getAttribute("placeholder"));
    }

    @Test
    public void placeholderDebtTest(){
        scrollPage();

        WebElement debt = driver.findElement(By.xpath("//p[@class='select__option'][contains(.,'Задолженность')]"));
        getActions().moveToElement(debt).click().perform();

        WebElement invoiceNumber2073 = driver.findElement(By.id("score-arrears"));
        WebElement internetSum = driver.findElement(By.id("internet-sum"));
        WebElement instalmentEmail= driver.findElement(By.id("instalment-email"));


        Assertions.assertEquals("Номер счета на 2073",invoiceNumber2073.getAttribute("placeholder"));
        Assertions.assertEquals("Сумма",internetSum.getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека",instalmentEmail.getAttribute("placeholder"));
    }
    @Test
    public void  placeholderCommunicationServicesTest() {
        scrollPage();

        WebElement communicationServices = driver.findElement(By.xpath("//p[@class='select__option'][contains(.,'Услуги связи')]"));
        getActions().moveToElement(communicationServices).click().perform();

        WebElement phoneNumber = driver.findElement(By.id("connection-phone"));
        WebElement internetSum = driver.findElement(By.id("internet-sum"));
        WebElement instalmentEmail= driver.findElement(By.id("instalment-email"));


        Assertions.assertEquals("Номер телефона",phoneNumber.getAttribute("placeholder"));
        Assertions.assertEquals("Сумма",internetSum.getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека",instalmentEmail.getAttribute("placeholder"));
    }
    @Test
    public void buttonContinueTest(){
        scrollPage();

        WebElement communicationServices = driver.findElement(By.xpath("//p[@class='select__option'][contains(.,'Услуги связи')]"));
        getActions().moveToElement(communicationServices).click().perform();

        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.clear();
        phone.sendKeys("297777777");
        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        sumInput.sendKeys("10");
        WebElement email = driver.findElement(By.id("connection-email"));
        email.sendKeys("luna@gmail.com");

        driver.findElement(By.xpath("//form[@class='pay-form opened']/button[contains(.,'Продолжить')]")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/iframe")));
        Assertions.assertTrue(driver.findElement(By.xpath("//div/iframe")).isDisplayed());
        driver.switchTo().frame
                (driver.findElement(By.cssSelector("body>.bepaid-app>.bepaid-app__container>iframe.bepaid-iframe")));

        new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'payment-amount')]")));
        WebElement headerPayAmount = driver.findElement(By.xpath("//p[contains(@class,'payment-amount')]"));

        WebElement buttonSubmit = driver.findElement(By.xpath("//div[@class='card-page__card']/button"));

        WebElement phoneInfo = driver.findElement(By.xpath("//p[@class='header__payment-info']"));
        WebElement textNumberCard = driver.findElement(By.xpath("//div[@class='content ng-tns-c47-1']/label"));
        WebElement duration = driver.findElement(By.xpath("//div[@class='content ng-tns-c47-4']/label"));
        WebElement cvc = driver.findElement(By.xpath("//div[@class='content ng-tns-c47-5']/label"));
        WebElement namePerson = driver.findElement(By.xpath("//div[@class='content ng-tns-c47-3']/label"));
        List<WebElement> icons = driver.findElements(By.xpath("//div[@class='icons-container ng-tns-c47-1']//img"));


        Assertions.assertEquals("10.00 BYN",headerPayAmount.getText());
        Assertions.assertEquals("Оплатить 10.00 BYN",buttonSubmit.getText());
        Assertions.assertEquals("Оплата: Услуги связи Номер:375297777777",phoneInfo.getText());
        Assertions.assertEquals("Номер карты",textNumberCard.getText());
        Assertions.assertEquals("Срок действия",duration.getText());
        Assertions.assertEquals("CVC",cvc.getText());
        Assertions.assertEquals("Имя держателя (как на карте)",namePerson.getText());
        assertFalse(icons.isEmpty());

        driver.switchTo().defaultContent();
    }
}
