import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.Integer;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

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
    void size(){
        System.out.println(numbers.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(int i) {
        assertThat(numbers.contains(i)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void contains2(int input, boolean expected) {
        assertThat(numbers.contains(input)).isEqualTo(expected);
        assertEquals(numbers.contains(input), expected);
    }

}