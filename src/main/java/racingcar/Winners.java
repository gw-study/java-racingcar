package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private final List<Car> winners;

    public Winners(){
        this(new ArrayList<>());
    }
    public Winners(List<Car> cars){
        this.winners = cars;
    }
    public void addWinner(Car car){
        this.winners.add(car);
    }

    public String winnerNames(){
        List<String> winnerNames = new ArrayList<>();
        for(Car car : winners){
            winnerNames.add(car.getName());
        }
        return String.join(",", winnerNames);
    }
}
