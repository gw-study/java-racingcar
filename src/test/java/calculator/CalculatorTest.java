package calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }
    @Test
    public void stringCalculate () {
        assertThat(calculator.getResult("2 + 3 * 4 / 2 ")).isEqualTo(10);
    }
    @Test
    @DisplayName("두 개의 숫자 더하기 검증")
    public void testAdd() {
        assertThat(calculator.add(2, 3)).isEqualTo(5);
    }

    @Test
    @DisplayName("두 개의 숫자 빼기 검증")
    public void testSubtract(){
        assertThat(calculator.subtract(3, 2)).isEqualTo(1);
    }

    @Test
    @DisplayName("두 개의 숫자 곱하기 검증")
    public void testMultiply(){
        assertThat(calculator.multiply(5, 4)).isEqualTo(20);
    }

    @Test
    @DisplayName("두 개의 숫자 나누기 검증")
    public void testDivide(){
        assertThat(calculator.divide(20, 2)).isEqualTo(10);
    }

    @Test()
    @DisplayName("Blank 에러 검증")
    public void testBlank() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
           calculator.getResult(" ");
        });
    }

}
