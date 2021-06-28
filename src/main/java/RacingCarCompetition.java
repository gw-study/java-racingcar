import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RacingCarCompetition {

    private final int numberOfCar;
    private final int numberOfTimes;
    private final String[] names;

    public List<Car> cars = new ArrayList<>();
    public List<Car[]> history = new ArrayList<>();

    public RacingCarCompetition(String[] names, int numberOfTimes) {
        this.names = names;
        this.numberOfTimes = numberOfTimes;
        this.numberOfCar = names.length;
        readyForCar();
    }

    public void readyForCar() {
        for (int i = 0; i < numberOfCar; i++) {
            cars.add(new Car("-", 1, names[i]));
        }
    }

    public List<Car[]> startRacing() {
        for (int i = 0; i < numberOfTimes; i++) {
            Car[] c = new Car[numberOfCar];

            for (int j = 0 ; j < numberOfCar ; j++) {
                cars.get(j).move(cars.get(j).getRandomNumber());
                c[j] = new Car(cars.get(j).position.distance, cars.get(j).position.value, cars.get(j).name);
            }

            history.add(i, c);
        }

        return history;
    }

    public List<Car> getWinner() {
        Car[] last = history.get(numberOfTimes-1);
        Arrays.sort(last, Collections.reverseOrder());

        List<Car> winners = new ArrayList<>();
        Car first = new Car(last[0].position.distance, last[0].position.value, last[0].name);

        winners.add(0, first);

        for (int i = 1; i < last.length; i++) {
            if (first.position.value == last[i].position.value) {
                winners.add(last[i]);
            }
        }

        return winners;
    }
}
