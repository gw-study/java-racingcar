import java.util.Set;
import java.util.HashSet;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
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
    @DisplayName("Set의 크기를 구하는 테스트")
    public void size() {
        int size = numbers.size();
        assertThat(size).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    @DisplayName("Set의 값이 존재하는지 확인")
    public void isContains(int number) {
        assertTrue(numbers.contains(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"1","2","3","4","5"})
    @DisplayName("CsvSource를 활용한 ture/false 리턴 테스트")
    public void isContains_ShouldReturnTrueOrFalseIntegerValues(int number) {
        Boolean isTrue = numbers.contains(number);
        assertEquals(true, isTrue);
    }


}