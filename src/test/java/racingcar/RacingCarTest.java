package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.*;
import racingcar.view.ResultView;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingCarTest {
    Racing racing;
    ResultView resultView;
    String[] carNames = {"pobi", "crong", "honux"};

    @Test
    @DisplayName("자동차 생성 테스트")
    public void createCarTest() {
        assertThat(new Car("pobi", 2)).isEqualTo(new Car("pobi", 2));
    }

    @Test
    @DisplayName("자동차 이름 생성 테스트")
    void creatNameTest() {
        assertThat(new Name("pobi")).isEqualTo(new Name("pobi"));
    }
    
    @Test
    @DisplayName("자동차 race 차 대수 테스트")
    public void getReadyCarCount(){
        racing = new Racing(carNames);
        assertThat(racing.getCars().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 race 단위 테스트")
    public void moveForward(){
        racing = new Racing(carNames);
        assertThat(racing.getCars().get(0).moveForward(4)).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 위치 표시")
    public void showRacingCarResult() {
        racing = new Racing(carNames);
        resultView = new ResultView();
        racing.getCars().get(0).moveForward(4);
        assertEquals("-", resultView.showTrack(racing.getCars().get(0)));
    }

    @Test
    @DisplayName("우승자 선정 테스트")
    public void getWinnersName() {
        Car car1 = new Car("pobi", 3);
        Car car2 = new Car("crong", 2);
        Car car3 = new Car("honux", 2);

        car1.moveForward(4);
        car2.moveForward(5);
        car3.moveForward(2);

        List<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Winners winners = new Winners(cars);

        assertThat(winners.winnerCars()).containsExactly(car1);
    }

    @Test
    @DisplayName("자동차 위치정보 테스트")
    public void initPostionTest() {
        Position position = new Position(1);

        assertThat(position.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 위치 한단계 앞으로 전진 테스트")
    public void postionIncreaseTest() {
        Position position = new Position(1);

        assertThat(position.increase()).isEqualTo(new Position(2));
    }

    @ParameterizedTest
    @ValueSource(strings = {"kyle","hodle","pobi"})
    @DisplayName("이름 규칙에 문제가 없어서 정상적으로 생성되는 경우")
    public void createNameTest(String name) {
        assertThat(new Name(name));
    }

}
