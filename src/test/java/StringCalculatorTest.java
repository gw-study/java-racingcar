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

        String[] array = calculator.enterCommand(input);
        int result = calculator.parseInt(array[0]);

        for(int i = 0; i < array.length - 2; i=i+2) {
            String operator = array[i+1];
            int num = calculator.parseInt(array[i+2]);

            result = calculator.calculation(result, Operation.findOperator(operator), num);
        }

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
        String[] inputs = calculator.enterCommand("5 + 3");
        int num1 = calculator.parseInt(inputs[0]);
        int num2 = calculator.parseInt(inputs[2]);

        float result = calculator.calculation(num1, Operation.PLUS, num2);
        assertThat(result).isEqualTo(8);
    }

    @Test
    @DisplayName("- 연산 기능 테스트")
    void substractTest(){
        String[] inputs = calculator.enterCommand("6 - 1");
        int num1 = calculator.parseInt(inputs[0]);
        int num2 = calculator.parseInt(inputs[2]);

        float result = calculator.calculation(num1, Operation.MINUS, num2);
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("* 연산 기능 테스트")
    void multipleTest(){
        String[] inputs = calculator.enterCommand("4 * 1");
        int num1 = calculator.parseInt(inputs[0]);
        int num2 = calculator.parseInt(inputs[2]);

        float result = calculator.calculation(num1, Operation.MULTIPLE, num2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("/ 연산 기능 테스트")
    void divideTest(){
        String[] inputs = calculator.enterCommand("3 / 4");
        int num1 = calculator.parseInt(inputs[0]);
        int num2 = calculator.parseInt(inputs[2]);

        float result = calculator.calculation(num1, Operation.DIVIDE, num2);
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("0으로 나누었을때, ArithmeticException 테스트")
    void divideByZeroTest() {
        assertThatThrownBy(()->calculator.calculation(10, Operation.DIVIDE, 0))
                .isInstanceOf(ArithmeticException.class);
    }
}