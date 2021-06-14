class Car {
    private static int LIMIT_RANDOM_NUMBER = 4;
    public Position position;

    Car(String defaultDistance, int defaultValue) {
        position = new Position(defaultDistance, defaultValue);
    }

    public void showDistance() {
        System.out.println(position.distance);
    }

    public void move(int randomNumber) {
        showDistance();

        if (randomNumber >= LIMIT_RANDOM_NUMBER) {
            position.distance += "-";
            position.value += 1;
        }
    }

    public int getRandomNumber() {
        return (int)(Math.random() * 10);
    }
}

class Position {
    String distance;
    int value;

    Position(String distance, int value) {
        this.distance = distance;
        this.value = value;
    }
}