package Code.Home_work.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/***
 * Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException
 */
public class CalculatorTest {
    public static void main(String[] args) {

        try {
            assertThat(Calculator.calculatingDiscount(1000, 10)).isEqualTo(900);
            assertThat(Calculator.calculatingDiscount(1000, 50)).isEqualTo(500);
        } catch (AssertionError e) {
            throw new ArithmeticException("Арифметическая ошибка");
        }
    }
}