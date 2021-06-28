package racingcar;

import java.util.List;

public class ResultView {
    public void startResult(){
        System.out.println("실행결과");
    }

    private static final char TRACKSHAPE = '-';

    public static void showRacingCarResult(List<Car> cars) {
        for(Car car : cars) {
            System.out.print(car.getName() + " :");
            System.out.println(car.showTrack(TRACKSHAPE));
        }
        System.out.println();
    }
    public static void printWinners(Winners winners){
        System.out.println(String.format( "%s 가 최종 우승했습니다.", String.join(",", winners.winnerNames())));
    }
}
