package string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {

    @Test
    public void split() {
        String numbers = "1,2";
        String[] modNumber = numbers.split(",");
        assertThat(modNumber).containsExactly("1", "2");

        modNumber = "1".split(",");
        assertThat(modNumber).contains("1");
    }

    @Test
    public void substring() {

        String numbers = "(1,2)";
        String result = numbers.substring(1, numbers.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("문자열에서 특정 위치에 해당하는 문자값 검증")
    public void charAt() {
        String str = "abc";

        assertThatThrownBy(() -> {
            str.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }
}
