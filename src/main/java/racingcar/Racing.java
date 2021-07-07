package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Racing {

    private final List<Car> readyCars;

    public Racing(String[] cars) {
        this.readyCars = readyCar(cars);
    }

    public Racing(List<Car> cars){
        this.readyCars = cars;
    }

    private List<Car> readyCar(String[] cars) {
        List<Car> racingCars = new ArrayList<>();

        for (String car : cars) {
            racingCars.add(new Car(car, 0));
        }

        return racingCars;
    }

    public List<Car> getCars(){
        return this.readyCars;
    }

    public List<Car> moveCars(){
        for(Car car : readyCars) {
            Forward forward = new Forward();
            int forwardValue = forward.moveForwardValue();
            car.moveForward(forwardValue);
        }
        return readyCars;
    }

}
