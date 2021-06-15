package racingcar;

public class ResultView {
    public void startResult(){
        System.out.println("실행결과");
    }

    private static final char TRACKSHAPE = '-';

    public static void showRacingCarResult(Car car) {
        System.out.println(car.showTrack(TRACKSHAPE));
    }
}
