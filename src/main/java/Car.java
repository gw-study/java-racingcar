import java.util.Random;
import java.util.Objects;

public class Car {
    private final static int LIMIT_RANDOM_NUMBER = 4;
    private final static int LIMIT_MAX_RANDOM = 10;
    private Random random = new Random();
    private Position position;
    private String name;

    public Car(String name) {
        this.name = name;
        this.position = new Position(0);
    }

    public void move(int randomNumber) {
        if (randomNumber >= LIMIT_RANDOM_NUMBER) {
            position.increaseDistance();
        }
    }

    public Car makeCar(String name, int position) {
        Car car = new Car(name);

        for (int i = 0; i<position; i++) {
            car.move(LIMIT_RANDOM_NUMBER);
        }

        return car;
    }

    public int getPosition() {
        return this.position.getDistance();
    }

    public int getRandomNumber() {
        return random.nextInt(LIMIT_MAX_RANDOM);
    }

    public String getName() { return this.name; }

    public boolean isSamePosition(Car other) {
        return this.position.getDistance() == other.position.getDistance();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
