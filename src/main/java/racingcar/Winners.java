package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private final List<Car> cars;
    private static final int INIT_POSITION_NUM = 0;


    public Winners(){
        this(new ArrayList<>());
    }
    public Winners(List<Car> cars){
        this.cars = cars;
    }

    public List<String> findWinnerCarNames(){
        return winnerNames();
    }

    public void addWinner(Car car){
        this.cars.add(car);
    }

    public List<String> winnerNames(){
        List<String> winnerNames = new ArrayList<>();
        for(Car car : cars){
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
}
