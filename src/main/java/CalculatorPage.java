import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    private AndroidDriver driver;
    @FindBy (id = "com.google.android.calculator:id/clr")

    public WebElement btnClear;
    @FindBy (id = "com.google.android.calculator:id/digit_4")
    public WebElement btn01;
    @FindBy (id = "com.google.android.calculator:id/digit_2")
    public WebElement btn02;
    @FindBy (id = "com.google.android.calculator:id/op_add")
    public WebElement btnAdd;
    @FindBy (id = "com.google.android.calculator:id/op_sub")
    public WebElement btnSub;
    @FindBy (id = "com.google.android.calculator:id/op_mul")
    public WebElement btnMul;
    @FindBy (id = "com.google.android.calculator:id/op_divv")
    public WebElement btnDiv;
    @FindBy (id = "com.google.android.calculator:id/eq")
    public WebElement btnEqual;
    @FindBy (id = "com.google.android.calculator:id/formula")
    public WebElement edtFormula;

    public CalculatorPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
