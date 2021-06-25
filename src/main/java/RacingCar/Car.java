package RacingCar;

public class Car {

    private static final int RANDOM_LIMIT_NUM = 4;
    private String curPosition = "";

    public String move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMove()) {
            curPosition += "-";
        }
        return curPosition;
    }

    public String getCurPosition() {
        return curPosition;
    }
}
