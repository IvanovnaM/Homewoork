import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {
    @Test(description = "Calculating the factorial of 0")
    public void testFactorialOfZero() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(0), 1);
    }

    @Test(description = "Calculating the factorial of a positive number")
    public void testFactorialOfPositiveNumber() {
        Assert.assertEquals(FactorialCalculator.calculateFactorial(5), 120);
    }

    @Test(description = "Calculating the factorial of a negative number")
    public void testFactorialOfNegativeNumber() {
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-5)
                );
        Assertions.assertEquals("Число не может быть отрицательным", thrown.getMessage());
    }
}
