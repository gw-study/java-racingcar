package RacingCar;

import java.util.ArrayList;
import java.util.List;

public class RacingCar {

    private final List<Car> carList = new ArrayList<>();
    private int tryCnt;

    RacingCar(String carName, int tryCnt) {
        initCars(carName);
        this.tryCnt = tryCnt;
    }

    private void initCars(String carName) {
        String[] carNameList = carName.split(",");
        for (String car : carNameList) {
            carList.add(new Car(car));
        }
    }

    public List<Car> getCarList() {
        return carList;
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
