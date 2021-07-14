import org.assertj.core.util.Lists;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class RacingCarCompetitionTest {

    @Test
    @DisplayName("자동차 이동 테스트, 랜덤숫자 4이상일 경우에만 전진")
    void moveTest() {
        Car car = new Car("pkh");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
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

    @ParameterizedTest
    @DisplayName("자동차 이름은 공백을 포함할 수 없다.")
    @ValueSource(strings = {", ,,", "Max, asdf, , adfadf", ""})
    void canSplitByCommaTest(String input) {
        InputView inputView = new InputView();
        assertThatThrownBy(()->inputView.isValidString(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차 이름은 중복을 허용하지 않는다.")
    void distinctTest() {
        Car car1 = new Car("pkh").makeCar("pkh",1);
        Car car2 = new Car("pkh").makeCar("pkh",1);

        RacingCarCompetition competition = new RacingCarCompetition(Lists.list(car1, car2));
        List<Car> winners = competition.getWinners();

        assertThat(winners).hasSize(1);
    }

    @Test
    @DisplayName("Distance가 제일 큰 자동차가 우승")
    void gameWinnerTest() {
        Car car1 = new Car("car1").makeCar("car1", 1);
        Car car2 = new Car("car2").makeCar("car2", 2);

        RacingCarCompetition competition = new RacingCarCompetition(Lists.list(car1, car2));
        List<Car> winners = competition.getWinners();

        assertThat(winners).contains(car2);
    }

    @Test
    @DisplayName("우승자가 여럿일 경우 테스트")
    void multipleWinnerTest() {
        Car car1 = new Car( "car1").makeCar("car1",1);
        Car car2 = new Car( "car2").makeCar("car2",1);

        RacingCarCompetition competition = new RacingCarCompetition(Lists.list(car1, car2));

        assertThat(competition.getWinners()).hasSize(2);
    }
}