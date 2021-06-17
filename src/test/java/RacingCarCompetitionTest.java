import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;

class RacingCarCompetitionTest {

    @Test
    @DisplayName("자동차 이동 테스트, 랜덤숫자 4이상일 경우에만 전진")
    void moveTest() {
        Car car = new Car("-",1);
        car.move(4);
        assertThat(car.position.getIntegerDistance()).isEqualTo(2);
    }

    @ParameterizedTest
    @DisplayName("input값이 올바른 양의 정수값인지 테스트")
    @ValueSource(strings = {"", "  ", "의미없는", "test", "-1"})
    @NullSource
    void inputTest(String input) {
        InputView inputView = new InputView();
        assertThatThrownBy(()->inputView.isValidInput(input))
                .isInstanceOf(NullPointerException.class);
    }
}