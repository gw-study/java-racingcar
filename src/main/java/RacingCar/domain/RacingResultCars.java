package RacingCar.domain;

import java.util.LinkedList;
import java.util.List;

public class RacingResultCars {
    private final List<List<Car>> racingResult;

    public RacingResultCars() {
        racingResult = new LinkedList<>();
    }

    public void addRacingResult(List<Car> carList) {
        racingResult.add(carList);
    }

    public List<List<Car>> getRacingResult() {
        return racingResult;
    }

    public List<Car> getLastCarList() {
        return racingResult.get(racingResult.size() - 1);
    }
}
