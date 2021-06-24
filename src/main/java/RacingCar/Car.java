package RacingCar;

public class Car {

    private static final int RANDOM_LIMIT_NUM = 4;
    private String curPosition = "";

    public String move(int value) {
        if (value >= RANDOM_LIMIT_NUM) {
            curPosition += "-";
        }
        return curPosition;
    }

    public String getCurPosition() {
        return curPosition;
    }
}
