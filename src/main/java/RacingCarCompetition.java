import java.util.*;

public class RacingCarCompetition {

    private final int numberOfCar;
    private final int numberOfTimes;
    private final String[] names;
    private final Round round;

    public List<Car> cars = new ArrayList<>();
    public List<Car[]> history = new ArrayList<>();

    public RacingCarCompetition(String[] names, int numberOfTimes) {
        this.names = names;
        this.numberOfTimes = numberOfTimes;
        this.numberOfCar = names.length;
        this.round = new Round(numberOfTimes);
        readyForCar();
    }

    private void readyForCar() {
        for (int i = 0; i < numberOfCar; i++) {
            cars.add(new Car("-", 1, names[i]));
        }
    }

    public List<Car[]> startRacing() {

        while (round.isContinuedRound()) {
            start();
            round.reduceRound();
        }

        return history;
    }

    public void start() {
        Car[] c = new Car[numberOfCar];

        for (int j = 0 ; j < numberOfCar ; j++) {
            cars.get(j).move(cars.get(j).getRandomNumber());
            c[j] = new Car(cars.get(j).getPositionString(), cars.get(j).getPositionInteger(), cars.get(j).getName());
        }

        history.add(c);
    }

    public List<Car> getWinner() {
        int lastIndex = numberOfTimes-1;
        Car[] last = history.get(lastIndex);

        List<Car> winners = new ArrayList<>();

        Car winner = Arrays.stream(last).max(Comparator.comparingInt(Car::getPositionInteger)).orElseThrow(NoSuchElementException::new);
        Car first = new Car(last[0].getPositionString(), last[0].getPositionInteger(), last[0].getName());

        winners.add(0, first);

        for (int i = 1; i < last.length; i++) {
            if (winner.getPositionInteger() == last[i].getPositionInteger()) {
                winners.add(last[i]);
            }
        }

        return winners;
    }
}
