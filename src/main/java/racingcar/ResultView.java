package racingcar;

import java.util.List;

public class ResultView {
    private static final char TRACKSHAPE = '-';

    public void startResult(){
        System.out.println("실행결과");
    }

    public void showRacingCarResult(List<Car> cars) {
        for(Car car : cars) {
            System.out.print(car.getName() + " :");
            System.out.println(showTrack(car));
        }
        System.out.println();
    }
    public void printWinners(List<String> carNames){
        System.out.println(String.format( "%s 가 최종 우승했습니다.", String.join(",", carNames)));
    }
    public String showTrack(Car car) {
        StringBuffer track = new StringBuffer();

        for(int i=0; i< car.getPosition(); i++) {
            track.append(TRACKSHAPE);
        }
        return track.toString();
    }
}
