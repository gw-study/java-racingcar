package RacingCar;

import java.util.List;

public class ResultView {

    ResultView() {
        System.out.println("실행 결과");
    }

    public void printCar(List<Car> carList) {
        System.out.println();
        for (Car car : carList) {
            System.out.println(car.getCarName() + " : " + car.getCurPosition());
        }
    }

    public void printWinner(List<Car> carList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : carList) {
            stringBuilder.append(String.join(",", car.getCarName()));
        }
        System.out.println(stringBuilder.toString() + "가 최종 우승했습니다.");
    }
}
