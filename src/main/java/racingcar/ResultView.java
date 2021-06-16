package racingcar;

import java.util.List;

public class ResultView {
    public void startResult(){
        System.out.println("실행결과");
    }

    private static final char TRACKSHAPE = '-';

    public static void showRacingCarResult(List<Car> cars) {
        System.out.println("");
        for(Car car : cars) {
            System.out.println(car.showTrack(TRACKSHAPE));
        }
    }
}
