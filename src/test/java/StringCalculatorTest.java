import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;


class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    @NullSource
    @DisplayName("빈 공백 문자일 경우, IllegalArgumentException 테스트")
    void isEmpty_EnterCommand(String input) {
        assertThatIllegalArgumentException().isThrownBy(
                () -> {
                    calculator.enterCommand(input);
                }

        ).withMessage("Input IllegalArgument Exception");
    }

    @ParameterizedTest
    @ValueSource(strings = {"!", "@", "#", "^", "?", ">", "<", "(", ")"})
    @DisplayName("사칙연산 기호가 아닌 경우, IllegalArgumentException 테스트")
    void calculate(String sign) {
        assertThatIllegalArgumentException().isThrownBy(
                () -> {
                    calculator.calculate("2",sign,"4");
                }
        ).withMessage("Operator IllegalArgument Exception");
    }

    @Test
    @DisplayName("+ 연산 기능 테스트")
    void addTest(){
        int result = calculator.add(5,3);
        assertThat(result).isEqualTo(8);
    }

    @Test
    @DisplayName("- 연산 기능 테스트")
    void substractTest(){
        int result = calculator.substract(6,1);
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("* 연산 기능 테스트")
    void multipleTest(){
        int result = calculator.multiple(4,1);
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("/ 연산 기능 테스트")
    void divideTest(){
        int result = calculator.divide(3,4);
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("0으로 나누었을때, ArithmeticException 테스트")
    void divideByZeroTest() {
        assertThatExceptionOfType(ArithmeticException.class).isThrownBy(
                () -> {
                    calculator.divide(10,0);
                }
        ).withMessage("ArithmeticException");
    }
}