package RacingCar.domain;

import RacingCar.utils.RandomMovingStrategy;

import java.util.ArrayList;
import java.util.List;

public class RacingCar {

    private final List<Car> carList = new ArrayList<>();
    private final TryCnt tryCnt;

    public RacingCar(String carName, int tryCnt) {
        initCars(carName);
        this.tryCnt = new TryCnt(tryCnt);
    }

    private void initCars(String carName) {
        String[] carNameList = carName.split(",");
        for (String car : carNameList) {
            carList.add(new Car(car));
        }
    }
    
    public List<Car> start() {
        for (Car car : carList) {
            car.move(new RandomMovingStrategy());
        }
        return carList;
    }

    public boolean racing() {
        return tryCnt.checkTryCnt();
    }

}
