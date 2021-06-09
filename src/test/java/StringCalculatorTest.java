import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;


class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @ParameterizedTest(name = "{index}: {0} 계산식의 답은 {1} 입니다.")
    @CsvSource(value = {"1 + 2 * 4 / 6 : 2", "2 + 3 - 7 : -2"}, delimiter = ':')
    @DisplayName("연산에 대한 정확한 계산값을 리턴 하는지 테스트")
    void calculateTest(String input, int answer) {
        int result = calculator.setInputs(input);

        assertThat(result).isEqualTo(answer);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    @NullSource
    @DisplayName("빈 공백 문자일 경우, IllegalArgumentException 테스트")
    void isEmpty_EnterCommand(String input) {
        assertThatThrownBy(() -> calculator.enterCommand(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest(name = "{index}: ''{0}'' sign is not arithmetic operations.")
    @ValueSource(strings = {"!", "@", "#", "^", "?", ">", "<", "(", ")"})
    @DisplayName("사칙연산 기호가 아닌 경우, IllegalArgumentException 테스트")
    void isTrueOrFalse_ArithmeticOperationTest(String sign) {
        assertThatThrownBy(() -> calculator.calculation(2, Operation.valueOf(sign), 4))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("+ 연산 기능 테스트")
    void addTest(){
        int result = calculator.setInputs("5 + 3");
        int answer = 8;

        assertThat(result).isEqualTo(answer);
    }

    @Test
    @DisplayName("- 연산 기능 테스트")
    void substractTest(){
        int result = calculator.setInputs("6 - 1");
        int answer = 5;

        assertThat(result).isEqualTo(answer);
    }

    @Test
    @DisplayName("* 연산 기능 테스트")
    void multipleTest(){
        int result = calculator.setInputs("4 * 1");
        int answer = 4;

        assertThat(result).isEqualTo(answer);
    }

    @Test
    @DisplayName("/ 연산 기능 테스트")
    void divideTest(){
        int result = calculator.setInputs("3 / 4");
        int answer = 0;

        assertThat(result).isEqualTo(answer);
    }

    @Test
    @DisplayName("0으로 나누었을때, ArithmeticException 테스트")
    void divideByZeroTest() {
        assertThatThrownBy(()->calculator.calculation(10, Operation.DIVIDE, 0))
                .isInstanceOf(ArithmeticException.class);
    }
}