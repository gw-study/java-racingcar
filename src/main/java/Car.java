public class Car {
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

}
