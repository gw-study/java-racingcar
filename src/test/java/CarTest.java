import RacingCar.domain.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {
    Car car = new Car("ahreu");

    @Test
    @DisplayName("3번 시도시, 자동차는 전진한 위치는  0이다(전진 못함)")
    public void ThreeTryNonMoveTest() {
        for (int i = 0; i < 3; i++) {
            car.move(() -> false);
        }
        assertThat(car.getCurPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("3번 시도시, 자동차가 전진한 위치는 3이다")
    public void ThreeTryThreeMoveTest() {
        for (int i = 0; i < 3; i++) {
            car.move(() -> true);
        }
        assertThat(car.getCurPosition()).isEqualTo(3);
    }

    @Test
    @DisplayName("이름 길이가 5자 초과시 에러")
    public void chkNameLength() {
        assertThatThrownBy(() -> new CarName("abcdefg"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageEndingWith("자동차 이름은 5자를 초과할 수 없습니다");
    }

    @Test
    @DisplayName("시도 횟수 초기세팅이 0이하일때 에러")
    public void chkTryCnt() {
        assertThatThrownBy(() -> new TryCnt(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageEndingWith("시도 횟수는 0 이하로 설정할 수 없습니다");
    }

    @Test
    @DisplayName("시도 횟수 있을때 true 나오는지 체크")
    public void checkTryCntTrueTest() {
        assertThat(new TryCnt(1).checkTryCnt()).isTrue();
    }

    @Test
    @DisplayName("시도 횟수 없을때 false 나오는지 체크")
    public void checkTryCntFalseTest() {
        TryCnt tryCnt = new TryCnt(1);
        tryCnt.checkTryCnt();
        assertThat(tryCnt.checkTryCnt()).isFalse();
    }

    @Test
    @DisplayName("trim() 함수 적용 체크")
    public void chkNameTrim() {
        assertThat(new Car("abc ").getCarName()).isEqualTo("abc");
    }

    @Test
    @DisplayName("우승자 테스트 : 우승자는 aaa ")
    public void winnerTest() {
        Car car1 = new Car("aaa");
        Car car2 = new Car("bbb");
        Car car3 = new Car("ccc");

        car1.move(() -> true);
        car2.move(() -> false);
        car3.move(() -> false);

        List<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        WinnerCars winnerCars = new WinnerCars(cars);
        assertThat(winnerCars.findWinnerCarList()).containsExactly(car1);
    }

    @Test
    @DisplayName("getLastCarList : 가장 마지막 리스트롤 가져오는지 TEST")
    public void getLastCarListTest() {
        Car car1 = new Car("aaa");
        Car car2 = new Car("bbb");

        List<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);

        RacingResultCars resultCars = new RacingResultCars();
        resultCars.addRacingResult(cars);

        List<Car> cars2 = new ArrayList<>();
        cars2.add(car1);

        resultCars.addRacingResult(cars2);

        assertThat(resultCars.getLastCarList()).isEqualTo(cars2);

    }

}