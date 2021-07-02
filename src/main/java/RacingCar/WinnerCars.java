package RacingCar;

import java.util.ArrayList;
import java.util.List;

public class WinnerCars {
    private final int MAX_POSITION;
    private final List<Car> carList;

    public WinnerCars(List<Car> carList) {
        this.carList = carList;
        MAX_POSITION = getMaxPosition();
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : carList) {
            maxPosition = Math.max(maxPosition, car.getCurPosition().length());
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
        if (car.getCurPosition().length() == MAX_POSITION) {
            winnerCarList.add(car);
        }
    }
}
