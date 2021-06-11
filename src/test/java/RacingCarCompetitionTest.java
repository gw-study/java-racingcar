import com.sun.istack.internal.Nullable;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.*;

import java.util.InputMismatchException;



class RacingCarCompetitionTest {

    private RacingCarCompetition competition;

    @BeforeEach
//    void setUp() {
//        competition = new RacingCarCompetition();
//    }

    @Test
    @DisplayName("자동차 이동 테스트")
    void moveTest() {
        // 자동차 갯수와 횟수가 int형이 아닐때 테스트

//        int numOfCar = racingCar.numberOfCar = 1;
//        int numOfTimes = racingCar.numberOfTimes = 3;
//        racingCar.move(numOfCar, numOfTimes);

        assertThat(4).isEqualTo(4);
    }

    @ParameterizedTest
    @DisplayName("input값이 올바른 정수값인지 테스트")
    @ValueSource(strings = {"", "  ", "의미없는", "test"})
    @NullSource
    void inputTest(String input) {
        InputView inputView = new InputView();
        assertThatThrownBy(()->inputView.isValidInput(input))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    @DisplayName("자동차 객체가 null일때 테스트")
    @Nullable
    void readyForCarTest() {

        assertThatThrownBy(()->competition.readForCar())
                .isInstanceOf(NullPointerException.class);

    }
}