import java.util.*;
import java.util.stream.Collectors;

public class RacingCarCompetition {

    public List<Car> cars;
    public List<List<Car>> history;

    public RacingCarCompetition(List<Car> cars) {
        this.history = new ArrayList<>();
        this.cars = cars.stream().distinct().collect(Collectors.toList());
    }

    public RacingCarCompetition(String[] names){
        this(Arrays.stream(names).map(Car::new).collect(Collectors.toList()));
    }

    public void ready(int times) {
        for (int i = 0; i<times; i++) {
            start();
        }
    }

    public void start() {
        for (Car car : this.cars) {
            car.move(car.getRandomNumber());
        }

        this.history.add(getCars());
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public List<Car> getWinners() {
        Car winner = this.cars.stream()
                .max(Comparator.comparingInt(Car::getPositionInteger))
                .orElseThrow(IllegalStateException::new);

        return this.cars.stream().filter(car -> car.isSamePosition(winner)).collect(Collectors.toList());
    }
}
