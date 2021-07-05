public class Car {
    private final static int LIMIT_RANDOM_NUMBER = 4;
    private final static int LIMIT_MAX_RANDOM = 10;
    private Position position;
    private String name;

    public Car(String name) {
        this.name = name;
        this.position = new Position("-",1);
    }

    public void move(int randomNumber) {
        if (randomNumber >= LIMIT_RANDOM_NUMBER) {
            position.setDistance();
            position.setIntegerDistance();
        }
    }

    public Car makeCar(String name, int position) {
        Car car = new Car(name);

        for (int i = 0; i<position; i++) {
            car.move(LIMIT_RANDOM_NUMBER);
        }

        return car;
    }

    public int getPositionInteger() {
        return this.position.getIntegerDistance();
    }

    public String getPositionString() {
        return this.position.getDistance();
    }

    public int getRandomNumber() {
        return (int)(Math.random() * LIMIT_MAX_RANDOM);
    }
    public String getName() { return this.name; }

    public boolean isSamePosition(Car other) {
        return this.position.getIntegerDistance() == other.position.getIntegerDistance();
    }
}
