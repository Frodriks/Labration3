import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test Calculator - Addition (Equals)")
    public void testCalculatorAdditionEquals() {
        int actual = calculator.add(5,10);
        assertEquals(15, actual);
    }

    @Test
    @DisplayName("Test Calculator - Subtraction (Not Equals)")
    public void testCalculatorSubtractionNotEquals() {
        int actual = calculator.subtract(8,7);
        assertNotEquals(actual, 2);
    }

    @Test
    @DisplayName("Test Calculator - Multiplication (True)")
    void testCalculatorMultiplicationTrue () {
        int actual = calculator.multiply(100,10);
        assertTrue(actual == 1000);
    }

    @Test
    @DisplayName("Test Calculator - Division (Not Equals)")
    void testCalculatorDivisionNotEquals() {
        double actual = calculator.divide(10,5);
        assertNotEquals(actual, 3);
    }

    @Test
    @DisplayName("Test Calculator - Square root (False)")
    void testCalculatorSquareRootFalse() {
        double actual = calculator.squareRootOf(9);
        assertFalse(actual == 4);
    }

    @Test
    @DisplayName("Test Calculator - Area (Equals)")
    public void testCalculatorAreaEquals() {
        double actual = calculator.getArea(2);
        assertEquals(actual, 12.57);
    }

    @Test
    @DisplayName("Test Calculator - Area (NotNull)")
    public void testCalculatorAreaNotNull() {
        double actual = calculator.getArea(3);
        System.out.println(actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test Calculator - Circumference (True)")
    void TestCalculatorCircumferenceTrue() {
        double actual = calculator.getCircumference(7);
        assertTrue(actual == 43.98);
    }
}