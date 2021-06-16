import java.util.ArrayList;
import java.util.List;

public class RacingCarCompetition {

    public int numberOfCar;
    public int numberOfTimes;

    public Car[] cars;
    public List<String[]> history = new ArrayList<>();


    public void readyForCompetition() {
        cars = readyForCar();
        startRacing();
    }

    public Car[] readyForCar() {
        cars = new Car[numberOfCar];

        for (int i = 0; i < numberOfCar; i++) {
            cars[i] = new Car("-",1);
        }

        return cars;
    }

    public void startRacing() {
        for (int i = 0; i < numberOfTimes; i++) {
            String[] distances = new String[numberOfCar];

            for (int j = 0 ; j < numberOfCar ; j++) {
                cars[j].move(cars[j].getRandomNumber());
                distances[j] = cars[j].position.distance;
            }

            history.add(i, distances);
        }
    }
}
