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
}
