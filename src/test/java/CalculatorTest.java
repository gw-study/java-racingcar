import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.String;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("정수 덧셈 테스트")
    void plus(){
        assertThat(calculator.plus(2,3)).isEqualTo(5);
    }

    @Test
    @DisplayName("정수 뺄셈 테스트")
    void minus(){
        assertThat(calculator.minus(3,2)).isEqualTo(1);
    }

    @Test
    @DisplayName("정수 곱셈 테스트")
    void multiply(){
        assertThat(calculator.multiply(5,4)).isEqualTo(20);
    }

    @Test
    @DisplayName("정수 나눗셈 테스트")
    void divide(){
        assertThat(calculator.divide(20,2)).isEqualTo(10);
    }

    @DisplayName("문자열 사칙연산 계산기 테스트")
    @ParameterizedTest
    @CsvSource(value = {"2 + 3 * 4 / 2:10", "3 - 2:1", "6 / 3 - 1 * 4 + 5:9"}, delimiter = ':')
    void stringCalculator(String input, int expected){
        assertThat(calculator.stringCalculator(input)).isEqualTo(expected);
    }

    @DisplayName("문자열 사칙연산 계산기 예외 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"=", "1 ", "null", " ", "2 *"})
    void stringCalculatorException(String input){
        assertThatIllegalArgumentException().isThrownBy(() -> {
            calculator.stringCalculator(input);
        });
    }

}
