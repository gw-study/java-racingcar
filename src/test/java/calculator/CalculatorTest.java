package calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }
    @Test
    @DisplayName("문자열 사칙연산 계산 검증")
    public void stringCalculate () {
        assertThat(calculator.getResult("2 + 3 * 4 / 2 ")).isEqualTo(10);
    }
}
