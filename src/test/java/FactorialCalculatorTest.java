import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {
    @Test
    public void testCalculateFactorialForZero() {
        long result = FactorialCalculator.calculateFactorial(0);
        Assertions.assertEquals(result, 1,
                String.format("Verifi " + result));
        System.out.println("Факториал равен " + result);
    }

    @Test
    public void testCalculateFactorialForPositiveNumber() {
        long result = FactorialCalculator.calculateFactorial(5);
        Assertions.assertEquals(result, 120,
                String.format("Verifi " + result));
        System.out.println("Факториал равен " + result);
    }

    @Test
    public void testCalculateFactorialForNegativeNumber() {
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                            FactorialCalculator.calculateFactorial(-5);
                        }
                );
        Assertions.assertEquals("Число не может быть отрицательным", thrown.getMessage());
        System.out.println( thrown.getMessage());
    }
}
