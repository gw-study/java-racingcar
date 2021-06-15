package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingCarTest {
    Racing racing;

    @BeforeEach
    public void setUp(){
        racing = new Racing();
        racing.readyCar(3);
        //racing.startRace(1);
    }

    @Test
    @DisplayName("자동차 race 단위 테스트")
    public void getReadyCarCount(){
        assertThat(racing.getCars().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 race 단위 테스트")
    public void moveForward(){
        assertThat(racing.getCars().get(0).moveForward(4)).isEqualTo(4);
    }

    @Test
    @DisplayName("자동차 위치 표시")
    public void showRacingCarResult() {
        racing.getCars().get(0).moveForward(4);
        assertEquals("----", racing.getCars().get(0).showTrack('-'));
    }

}
