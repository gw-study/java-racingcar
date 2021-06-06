import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.Integer;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Set size 테스트")
    void size(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    @DisplayName("Set contains 반복 테스트")
    @ParameterizedTest(name = "{index} {displayName} ints = {0}")
    @ValueSource(ints = {1, 2, 3})
    void contains(int i) {
        assertThat(numbers.contains(i)).isTrue();
    }

    @DisplayName("Set contains_trueOrFalse 반복 테스트")
    @ParameterizedTest(name = "{index} {displayName} {0} :{1}")
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void contains_trueOrFalse(int input, boolean expected) {
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }

}