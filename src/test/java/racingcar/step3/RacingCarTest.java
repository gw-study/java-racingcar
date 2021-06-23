package racingcar.step3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class RacingCarTest {
    RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar(3,5);
    }

    @Test
    @DisplayName("자동차 수 입력값 테스트")
    void getRacingCarInput() {
        assertThat(racingCar.getCountOfCars()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 수 배열 생성 테스트")
    void getRacingCars() {
        assertThat(racingCar.getCars()).isEqualTo(new int[3]);
    }

    @Test
    @DisplayName("시도 횟수 입력값 테스트")
    void getRacingNumberInput() {
        assertThat(racingCar.getCountOfRounds()).isEqualTo(5);
    }

    @Test
    @DisplayName("랜덤값 생성 테스트")
    void makeRandomNumber() {
        assertThat(RandomNumber.makeRandomNumber()).isBetween(0,9);
    }

    @Test
    @DisplayName("자동차 경주 1회 전진 테스트")
    void move() {
        RacingCarMain.move(racingCar, racingCar.getCars(), racingCar.getMovementOfCar());
        assertThat(racingCar.getMovementOfCar().size()).isEqualTo(racingCar.getCountOfCars());
    }

}