package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void evaluatesArithmeticWithCorrectPrecedence() {
        Calculator calculator = new Calculator();

        assertEquals(7.0, calculator.evaluate("1+2*3"));
        assertEquals(5.0, calculator.evaluate("10-3-2"));
        assertEquals(1.0, calculator.evaluate("8/4/2"));
        assertEquals(512.0, calculator.evaluate("2^3^2"));
        assertEquals(-4.0, calculator.evaluate("-2^2"));
        assertEquals(4.0, calculator.evaluate("(-2)^2"));
    }

    @Test
    void keepsVariablesInsideOneCalculatorInstance() {
        Calculator calculator = new Calculator();

        assertNull(calculator.evaluate("SET x=1+2; y=x*3;"));
        assertEquals(9.0, calculator.evaluate("y"));
    }

    @Test
    void rejectsUndefinedVariables() {
        CalculatorException exception =
                assertThrows(CalculatorException.class, () -> new Calculator().evaluate("abc"));

        assertEquals("undefined variable: abc", exception.getMessage());
    }

    @Test
    void rejectsSyntaxErrorsWithoutPartialEvaluation() {
        CalculatorException exception =
                assertThrows(CalculatorException.class, () -> new Calculator().evaluate("1+2xxx"));

        assertEquals("syntax error", exception.getMessage());
    }

    @Test
    void rejectsDivisionByZero() {
        CalculatorException exception =
                assertThrows(CalculatorException.class, () -> new Calculator().evaluate("1/0"));

        assertEquals("division by zero", exception.getMessage());
    }

    @Test
    void rejectsMathDomainErrors() {
        Calculator calculator = new Calculator();

        CalculatorException logException =
                assertThrows(CalculatorException.class, () -> calculator.evaluate("ln(-1)"));
        CalculatorException asinException =
                assertThrows(CalculatorException.class, () -> calculator.evaluate("asin(2)"));

        assertEquals("math domain error", logException.getMessage());
        assertEquals("math domain error", asinException.getMessage());
    }
}
