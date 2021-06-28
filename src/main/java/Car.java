public class Car implements Comparable<Car> {
    private final static int LIMIT_RANDOM_NUMBER = 4;
    public Position position;
    public String name;

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

    public int getRandomNumber() {
        return (int)(Math.random() * 10);
    }

    @Override
    public int compareTo(Car car) {
        if (this.position.value < car.position.value) {
            return -1;
        } else if (this.position.value == car.position.value) {
            return 0;
        } else {
            return 1;
        }
    }
}
