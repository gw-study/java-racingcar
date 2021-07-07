package RacingCar;

import java.util.List;

public class ResultView {
    private final String displayPosition = "-";

    public ResultView() {
        System.out.println("실행 결과");
    }

    public void printCar(List<Car> carList) {
        System.out.println();
        for (Car car : carList) {
            System.out.println(car.getCarName() + " : " + printPosition(car));
        }
    }

    private String printPosition(Car car) {
        int carPosition = car.getCurPosition();
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < carPosition; i++) {
            result.append(displayPosition);
        }
        return result.toString();
    }

    public void printWinner(List<Car> carList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : carList) {
            stringBuilder.append(String.join(", ", car.getCarName()));
        }
        System.out.println(stringBuilder.toString() + "가 최종 우승했습니다.");
    }
}
