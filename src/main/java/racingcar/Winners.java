package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {
    private static final int INIT_POSITION_NUM = 0;
    private final List<Car> cars;

    public Winners(List<Car> cars){
        this.cars = cars;
    }

    public List<String> findWinnerCarNames(List<Car> winnersCar){
        return winnerNames(winnersCar);
    }

    public List<String> winnerNames(List<Car> winnersCar){
        List<String> winnerNames = new ArrayList<>();
        for(Car car : winnersCar){
            winnerNames.add(car.getName());
        }
        return winnerNames;
    }

    public int getMaxPosition(List<Car> readyCars){
        int maxPosition = INIT_POSITION_NUM;
        for (Car car : readyCars) {
            maxPosition = car.maxPosition(maxPosition);
        }
        return maxPosition;
    }

    public List<Car> winnerCars() {
        return cars.stream()
                .filter(car -> car.getPosition() == getMaxPosition(cars))
                .collect(Collectors.toList());
    }
}
