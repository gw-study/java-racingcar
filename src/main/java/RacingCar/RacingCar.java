package RacingCar;

import java.util.ArrayList;
import java.util.List;

public class RacingCar {

    private final List<Car> carList = new ArrayList<>();
    private int tryCnt;

    RacingCar(int carCnt, int tryCnt) {
        initCars(carCnt);
        this.tryCnt = tryCnt;
    }

    public void initCars(int carCnt) {
        for (int i = 0; i < carCnt; i++) {
            carList.add(new Car());
        }
    }

    public List<Car> start() {
        for (Car car : carList) {
            car.move(new RandomMovingStrategy());
        }
        return carList;
    }

    public boolean racing() {
        if (tryCnt > 0) {
            tryCnt--;
            return true;
        }
        return false;
    }

}
