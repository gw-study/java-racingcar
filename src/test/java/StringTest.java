import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class StringTest {
    @Test
    @DisplayName("split함수로 '1,2' 잘 분리 되는지 테스트")
    public void split() {
        String[] values = "1,2".split(",");
        assertThat(values).containsExactly("1","2");
        values = "1".split(",");
        assertThat(values).contains("1");
    }

    @Test
    @DisplayName("substring 함수로 '1,2'를 반환하는 테스트")
    public void substring() {
        String input = "(1,2)";
        String result = input.substring(1, input.length()-1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt함수로 특정 위치의 문자 가져오는 테스트, 값을 벗어나면 Exception발생 테스트")
    public void charAt() {
        String input = "abc";
        int index = 0;

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> { input.charAt(index); }).withMessage("%d", index);

    }
}