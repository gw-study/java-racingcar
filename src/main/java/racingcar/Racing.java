package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    private List<Car> readyCars = new ArrayList<>();

    public List<Car> getCars(){
        return this.readyCars;
    }

    public void readyCar(String[] cars){
        for(int i = 0; i < cars.length; i++){
            readyCars.add(new Car(cars[i], 0));
        }
    }

    public List<Car> moveCars(){
        for(Car car : readyCars){
            Forward forward = new Forward();
            int forwardValue = forward.moveForwardValue();
            car.moveForward(forwardValue);
        }
        return readyCars;
    }

    public Winners getWinners(){
        Winners winners = new Winners();
        for(Car car : readyCars){
            addWinners(car, winners);
        }
        return winners;
    }
    public void addWinners(Car car, Winners winners){
        if(car.getPosition() == getMaxPosition())
            winners.addWinner(car);
    }

    public int getMaxPosition(){
        int position = readyCars.get(0).getPosition();
        for(Car car : readyCars){
            position = car.maxPosition(position);
        }
        return position;
    }
}
