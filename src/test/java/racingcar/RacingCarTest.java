package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingCarTest {
    Racing racing;
    String[] carNames = {"pobi", "crong", "honux"};

    @BeforeEach
    public void setUp(){
        racing = new Racing();
        racing.readyCar(carNames);
    }

    @Test
    @DisplayName("자동차 race 단위 테스트")
    public void getReadyCarCount(){
        assertThat(racing.getCars().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 race 단위 테스트")
    public void moveForward(){
        assertThat(racing.getCars().get(0).moveForward(4)).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 위치 표시")
    public void showRacingCarResult() {
        racing.getCars().get(0).moveForward(4);
        assertEquals("-", racing.getCars().get(0).showTrack('-'));
    }

    @Test
    @DisplayName("우승자 선정 테스트")
    public void getWinnersName(){
        racing.getCars().get(0).moveForward(1);
        racing.getCars().get(1).moveForward(5);
        racing.getCars().get(2).moveForward(2);
        assertThat(String.join(",", racing.getWinners().winnerNames())).isEqualTo("crong");
    }

}
