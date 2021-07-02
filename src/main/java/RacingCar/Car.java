package RacingCar;

public class Car {
    private final CarName carName;

    private String curPosition = "";

    public Car(String carName) {
        this.carName = new CarName(carName);
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
        return carName.getCarName();
    }

}
