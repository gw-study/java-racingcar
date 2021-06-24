import RacingCar.Car;
import RacingCar.MovableStrategy;
import RacingCar.NonMovableStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    Car car = new Car();

    @Test
    @DisplayName("3번 시도시, 자동차는 전진한 결과는  이다(전진 못함)")
    public void ThreeTryNonMoveTest() {
        for (int i = 0; i < 3; i++) {
            car.move(new NonMovableStrategy());
        }
        assertThat(car.getCurPosition()).isEqualTo("");
    }

    @Test
    @DisplayName("3번 시도시, 자동차가 전진한 결과는 ---이다")
    public void ThreeTryThreeMoveTest() {
        for (int i = 0; i < 3; i++) {
            car.move(new MovableStrategy());
        }
        assertThat(car.getCurPosition()).isEqualTo("---");
    }

}