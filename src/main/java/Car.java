public class Car {
    private final static int LIMIT_RANDOM_NUMBER = 4;
    public Position position;

    Car(String defaultDistance, int defaultValue) {
        position = new Position(defaultDistance, defaultValue);
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
}
