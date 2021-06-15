package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    private List<Car> cars = new ArrayList<>();
    private ResultView resultView= new ResultView();

    public List<Car> getCars(){
        return this.cars;
    }

    public void readyCar(int CarCount){
        for(int i = 0; i < CarCount; i++){
            cars.add(new Car());
        }
    }

    public void startRace(int tryCount){
        resultView.startResult();
        for(int i = 0; i < tryCount; i++){
            System.out.println("");
            moveCars();
        }
    }

    public void moveCars(){
        for(Car car : cars){
            Forward forward = new Forward();
            int forwardValue = forward.moveForwardValue();
                car.moveForward(forwardValue);

            resultView.showPosition(car.getCurrentPosition());
        }
    }


}
