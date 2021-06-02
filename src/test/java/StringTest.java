import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@DisplayName("String 클래스에 대한 학습 테스트")
public class StringTest {

    //요구사항 1
    @Test
    @DisplayName("요구사항 1")
    public void split() {

        String[] values = "1,2".split(",");
        assertThat(values).containsExactly("1", "2");

        values = "1".split(",");
        assertThat(values).containsOnly("1");

        //contains : 중복 여부, 순서 관계 없이 값만 일치하면 test 통과
        //containsOnly: 순서, 중복을 무시하는 대신 원소값과 갯수가 정확히 일치
        //containsExactly: 순서를 포함해서 정확히 일치
    }

    //요구사항 2
    @Test
    @DisplayName("요구사항 2")
    public void substring() {
        String input = "(1,2)";
        String result = input.substring(1, input.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

    //요구사항 3
    @Test
    @DisplayName("요구사항 3")
    public void charAt() {
        String input = "abc";
        char result = input.charAt(2);
        assertThat(result).isEqualTo('c');

        int index = 4;
        int size = input.length() - 1;
        assertThatThrownBy(() -> {
            input.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class)
        .hasMessageContaining("String index out of range: 4");
    }

}