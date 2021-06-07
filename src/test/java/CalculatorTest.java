import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.platform.commons.util.StringUtils.isBlank;

@DisplayName("문자열 사칙 연산 계산기 구현")
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("덧셈 테스트")
    public void additionTest() {
        assertThat(Calculator.OperationType.ADDITION.operate(10,5)).isEqualTo(15);
    }

    @Test
    @DisplayName("뺄셈 테스트")
    public void subtractionTest() {
        assertThat(Calculator.OperationType.SUBSTITUTION.operate(10, 5)).isEqualTo(5);
    }

    @Test
    @DisplayName("곱셈 테스트")
    public void multiplicationTest() {
        assertThat(Calculator.OperationType.MULTIPLY.operate(10, 5)).isEqualTo(50);
    }

    @Test
    @DisplayName("나눗셈 테스트")
    public void divisionTest(){
        assertThat(Calculator.OperationType.DIVIDE.operate(10,5)).isEqualTo(2);
    }

    @ParameterizedTest(name = "Input {0} is not supported.")
    @ValueSource(strings = {"", "  "})
    @DisplayName("입력값 NULL 또는 빈 공백 문자일 경우 예외 테스트")
    public void chkIsNullOrBlankTest(String input) {
        assertThatThrownBy(() ->  calculator.calculate(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageEndingWith("input data is blank or null");
    }

    @Test
    @DisplayName("사칙 연산 기호가 아닌 경우 예외 테스트")
    public void chkIsNotArithmeticOperationTest() {
        assertThatThrownBy(() -> calculator.calculate("2 +1 3 * 4 / 2"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageEndingWith("사칙 연산 기호가 아닙니다");
    }

    @Test
    @DisplayName("사칙 연산을 모두 포함 하는 기능 테스트")
    public void calculatorTest() {
        String input = "2 + 3 * 4 / 2";
        assertEquals(10,calculator.calculate(input));
    }
}
