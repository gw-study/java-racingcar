import org.junit.jupiter.api.*;
import java.lang.String;
import static org.assertj.core.api.Assertions.*;

class StringTest {

    @Test
    void split() {
        String[] splitString = "1,2".split(",");
        assertThat(splitString).contains("1", "2");
        assertThat(splitString).containsExactly("1", "2");
//        assertThat(splitString).containsExactly("2", "1");      //Error

        splitString = "1".split(",");
        assertThat(splitString).contains("1");
        assertThat(splitString).containsExactly("1");
    }

    @Test
    void substringSplit(){
        String substringString = "(1,2)".substring(1,4);
        String[] splitString = substringString.split(",");
        assertThat(splitString).contains("1", "2");
        assertThat(splitString).containsExactly("1", "2");
    }

    @Test
    @DisplayName("charAt IndexOutOfBoundsException Test")
    void charAt(){
        assertThatThrownBy(() -> {
            "abc".charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }
}