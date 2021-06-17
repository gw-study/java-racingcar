package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars(){
        return this.cars;
    }

    public void readyCar(int CarCount){
        for(int i = 0; i < CarCount; i++){
            cars.add(new Car());
        }
    }

    public List<Car> moveCars(){
        for(Car car : cars){
            Forward forward = new Forward();
            int forwardValue = forward.moveForwardValue();
            car.moveForward(forwardValue);
        }
        return cars;
    }
}
