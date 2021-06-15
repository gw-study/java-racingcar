package racingcar.step3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingCarTest {
    RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar(3,5);
    }

    @Test
    @DisplayName("자동차 수 입력값 테스트")
    void getRacingCarInput() {
        racingCar.getRacingCarInput();
    }

    @Test
    @DisplayName("시도 횟수 입력값 테스트")
    void getRacingCars() {
        racingCar.getRacingCars();
    }

    @Test
    @DisplayName("자동차 수 배열 생성 테스트")
    void getRacingNumberInput() {
        racingCar.getRacingNumberInput();
    }

    @Test
    @DisplayName("랜덤값 생성 테스트")
    void makeRandomNumber() {
        RandomNumber.makeRandomNumber();
    }

    @Test
    @DisplayName("자동차 경주 테스트")
    void racing() {
        RacingCarMain.racing(racingCar);
    }

    @Test
    @DisplayName("자동차 경주 1회 전진 테스트")
    void racingOnce() {
        RacingCarMain.racingOnce(racingCar, racingCar.getRacingCars());
    }

}