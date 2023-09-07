import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @org.junit.jupiter.api.Test

    public void testPlus() {
        int x = 3, y = 2, expected = 5;
        Calculator calculator = new Calculator();
        int result = calculator.plus(x, y);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMinus() {
        int x = 3, y = 2, expected = 7;
        Calculator calculator = new Calculator();
        int result = calculator.minus(x, y);
        Assertions.assertNotEquals(expected, result);
    }

    @Test
    public void testDivide() {
        int x = 3, y = 0;
        Class<ArithmeticException> expected = ArithmeticException.class;
        Calculator calculator = new Calculator();
        Executable executable = () -> calculator.devide(x, y);
        Assertions.assertThrows(expected, executable);
    }


}