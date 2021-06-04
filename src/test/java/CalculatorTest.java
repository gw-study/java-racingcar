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

    @Test
    @DisplayName("덧셈 테스트")
    public void additionTest() {
        assertThat(addition(10, 5)).isEqualTo(15);
    }

    private int addition(int a, int b){
        return  a+b;
    }

    @Test
    @DisplayName("뺄셈 테스트")
    public void subtractionTest() {
        assertThat(subtraction(10, 5)).isEqualTo(5);
    }

    private int subtraction(int a, int b){
        return a - b;
    }

    @Test
    @DisplayName("곱셈 테스트")
    public void multiplicationTest() {
        assertThat(multiplication(10, 5)).isEqualTo(50);
    }

    private int multiplication(int a, int b){
        return a * b;
    }

    @Test
    @DisplayName("나눗셈 테스트")
    public void divisionTest(){
        assertThat(division(10,5)).isEqualTo(2);
    }

    private int division(int a, int b){
        return a / b;
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"", "  "})
    @DisplayName("입력값 NULL 또는 빈 공백 문자일 경우 예외 테스트")
    public void chkIsNullOrBlankTest(String input) {
        assertThatIllegalArgumentException().isThrownBy(()->{
            int val = calculator(input);
        }).withMessageMatching("input data is blank or null");
    }

    @Test
    @DisplayName("사칙 연산 기호가 아닌 경우 예외 테스트")
    public void chkIsNotArithmeticOperationTest() {
        assertThatIllegalArgumentException().isThrownBy(()->{
            int val = calculator("2 +1 3 * 4 / 2");
        }).withMessageMatching("사칙 연산 기호가 아닙니다");
    }

    @Test
    @DisplayName("사칙 연산을 모두 포함 하는 기능 테스트")
    public void calculatorTest() {
        String input = "2 + 3 * 4 / 2";
        assertEquals(10,calculator(input));
    }

    public int calculator(String input){

        if(isBlank(input)){
            throw new IllegalArgumentException("input data is blank or null");
        }

        String[] inputArr = input.split(" ");
        int len = inputArr.length;
        int value = Integer.parseInt(inputArr[0]);

        for(int i=1; i<len; i+=2){
            switch(inputArr[i]) {
                case "+":
                    value = addition(value, Integer.parseInt(inputArr[i + 1]));
                    break;
                case "-":
                    value = subtraction(value, Integer.parseInt(inputArr[i + 1]));
                    break;
                case "*":
                    value = multiplication(value, Integer.parseInt(inputArr[i + 1]));
                    break;
                case "/":
                    value = division(value, Integer.parseInt(inputArr[i + 1]));
                    break;
                default:
                    throw new IllegalArgumentException("사칙 연산 기호가 아닙니다");
            }
        }
        return value;
    }
}
