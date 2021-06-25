package RacingCar;

import java.util.ArrayList;
import java.util.List;

public class RacingCar {

    private final List<Car> carList = new ArrayList<>();
    public int tryCnt;

    public void initCars(int carCnt) {
        for (int i = 0; i < carCnt; i++) {
            carList.add(new Car());
        }
    }

    public void initTryCnt(int tryCnt) {
        this.tryCnt = tryCnt;
    }

    public List<Car> start() {
        for (Car car : carList) {
            car.move(new RandomMove());
        }
        return carList;
    }
}
