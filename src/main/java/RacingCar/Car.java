package RacingCar;

public class Car {
    private String curPosition = "";
    private String carName = "";

    public Car(String carName) {
        this.carName = carName;
    }

    public String move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMove()) {
            curPosition += "-";
        }
        return curPosition;
    }

    public String getCurPosition() {
        return curPosition;
    }

    public String getCarName() {
        return carName;
    }

}
