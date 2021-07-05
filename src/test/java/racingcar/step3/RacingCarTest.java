package racingcar.step3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Java6Assertions.assertThat;

class RacingCarTest {
    RacingCar racingCar;
    Winner winner;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar("pobi,crong,honux", 5);
        winner = new Winner();
    }

    @Test
    @DisplayName("자동차 수 입력값 테스트")
    void getRacingCarInput() {
        assertThat(racingCar.getCountOfCars()).isEqualTo(3);
    }

    @Test
    @DisplayName("시도 횟수 입력값 테스트")
    void getRacingNumberInput() {
        assertThat(racingCar.getCountOfRounds()).isEqualTo(5);
    }

    @Test
    @DisplayName("랜덤값 생성 테스트")
    void makeRandomNumber() {
        assertThat(RandomNumber.makeRandomNumber()).isBetween(0, 9);
    }

    @Test
    @DisplayName("자동차 경주 1회 전진 테스트")
    void move() {
        racingCar.race(racingCar);
        assertThat(racingCar.getMovementOfCar().size()).isEqualTo(racingCar.getCountOfCars());
    }

    @Test
    @DisplayName("자동차 객체 리스트 생성 테스트")
    void enterNameOfCars() {
        ArrayList<Car> infoOfCars = racingCar.getInfoOfCars();
        assertThat(infoOfCars.size()).isEqualTo(racingCar.getCountOfCars());
    }

    @Test
    @DisplayName("자동차 경주 우승자 찾기 테스트")
    void findWinner() {
//        자동차 = A,B,C 3대
//        시도횟수 = 2회 라고 하면,

//1회
        racingCar.move(0, 1); //0칸
        racingCar.move(1, 2); //0칸
        racingCar.move(2, 8); //1칸
//2회
        racingCar.move(0, 1); //0칸
        racingCar.move(1, 5); //1칸
        racingCar.move(2, 6); //2칸

        winner.findWinner(racingCar);
        assertThat(winner.getWinner().get(0)).isEqualTo("honux");
    }

}