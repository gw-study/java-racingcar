import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Set Collection에 대한 학습 테스트")
public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("요구사항 1")
    public void size(){
        int size = numbers.size();
        assertThat(size).isEqualTo(3);
    }

    @Test
    public boolean contains(int value){
        return numbers.contains(value);
    }

    @ParameterizedTest
    @DisplayName("요구사항 2")
    @ValueSource(ints = {1,2,3})
    public void isContainsUsingValueSource(int value){
        assertThat(contains(value));
    }

    @ParameterizedTest
    @DisplayName("요구사항 3")
    @CsvSource({"1,true","2,true","3,true", "4,false", "5,false"})
    public void isContainsUsingCsvSource(String input, String expected){
        int value = Integer.parseInt(input);
        String actualValue = Boolean.toString(contains(value));
        assertEquals(expected,actualValue);

    }
}