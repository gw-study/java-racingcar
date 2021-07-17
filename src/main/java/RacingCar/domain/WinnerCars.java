package RacingCar.domain;

import java.util.ArrayList;
import java.util.List;

public class WinnerCars {
    private final List<Car> carList;
    private final int maxPosition;

    public WinnerCars(List<Car> carList) {
        this.carList = carList;
        maxPosition = getMaxPosition();
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : carList) {
            maxPosition = Math.max(maxPosition, car.getCurPosition());
        }
        return maxPosition;
    }

    public List<Car> findWinnerCarList() {
        List<Car> winnerCarList = new ArrayList<>();
        for (Car car : carList) {
            addWinnerCar(car, winnerCarList);
        }
        return winnerCarList;
    }

    private void addWinnerCar(Car car, List<Car> winnerCarList) {
        if (car.getCurPosition() == maxPosition) {
            winnerCarList.add(car);
        }
    }
}
