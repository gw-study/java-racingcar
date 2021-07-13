import java.util.*;
import java.util.stream.Collectors;

public class RacingCarCompetition {

    private final List<Car> cars;

    public RacingCarCompetition(String[] names){
        this(Arrays.stream(names).map(Car::new).collect(Collectors.toList()));
    }

    public RacingCarCompetition(List<Car> cars) {
        this.cars = cars.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public void start() {
        for (Car car : cars) {
            car.move(car.getRandomNumber());
        }
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public List<Car> getWinners() {
        Car winner = this.cars.stream()
                .max(Comparator.comparingInt(Car::getPosition))
                .orElseThrow(IllegalStateException::new);

        return this.cars.stream().filter(car -> car.isSamePosition(winner)).collect(Collectors.toList());
    }
}
