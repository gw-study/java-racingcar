public class Car implements Comparable<Car> {
    private final static int LIMIT_RANDOM_NUMBER = 4;
    private final static int LIMIT_MAX_RANDOM = 10;
    private Position position;
    private String name;

    public Car(String defaultDistance, int defaultValue, String name) {
        this.name = name;
        this.position = new Position(defaultDistance, defaultValue);
    }

    public void move(int randomNumber) {

        if (randomNumber >= LIMIT_RANDOM_NUMBER) {
            position.setDistance();
            position.setIntegerDistance();
        }
    }

    public Position getPosition() {
        return this.position;
    }

    public int getRandomNumber() {
        return (int)(Math.random() * LIMIT_MAX_RANDOM);
    }
    public String getName() { return this.name; }

    @Override
    public int compareTo(Car car) {
        if (this.getPosition().getIntegerDistance() < car.getPosition().getIntegerDistance()) {
            return -1;
        } else if (this.getPosition().getIntegerDistance() == car.getPosition().getIntegerDistance()) {
            return 0;
        } else {
            return 1;
        }
    }
}
