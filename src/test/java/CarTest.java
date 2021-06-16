import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CarTest {
    Car carRacing = new Car();

    @Test
    @DisplayName("랜덤이 0과 9사이 인지 테스트")
    public void makeRandomTest() {
        assertThat(carRacing.makeRandom()).isBetween(0, 9);
    }

    @ParameterizedTest(name = "before : {0} , after : {1}")
    @CsvSource({"-,--", "'',-", "--,---"})
    @DisplayName("차 움직 일때 '-' 추가 되는지 기능 테스트")
    public void addMoveTest(String input, String result) {
        assertThat(carRacing.addMove(input)).isEqualTo(result);
    }

    @Test
    @DisplayName("레이싱 TEST")
    public void racingStartTest() {
        carRacing.racingStart(3, 5);
    }
}